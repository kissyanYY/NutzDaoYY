package com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

import mysql.bean.EBojectFiles;
import mysql.bean.ECar;
import mysql.bean.ECase;
import mysql.bean.ECriminal;
import mysql.bean.EHumen;
import mysql.bean.EObject;
import mysql.bean.EPreviewFiles;

import org.apache.log4j.Logger;
import org.nutz.dao.Cnd;
import org.nutz.dao.Dao;
import org.nutz.dao.Sqls;
import org.nutz.dao.sql.Sql;
import org.nutz.dao.util.DaoUp;
import org.nutz.lang.Strings;
import org.nutz.trans.Atom;
import org.nutz.trans.Trans;

import com.bean.AjxxBean;
import com.bean.CdxxxBean;
import com.bean.InsetRecodes;
import com.bean.RdxxBean;
import com.bean.YYYY;
import com.dao.MyNutzDao;

public class InsertBeanToMySql {
	static Logger logger = Logger.getLogger(InsertBeanToMySql.class);
	private static Set<String>  mxbs =new HashSet<String>();
	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				logger.info("【定时任务开始1】"); 
				doStSync();
			}
		}, 0, 60*60*1000);//每1个小时同步一边
	
	}
	
	public static void doStSync() {
		final Dao dao = MyNutzDao.GetDaoDao();
		System.out.println("dd");
		final Dao sqlDao= MyNutzDao.GetMysqlDao();
		logger.info("【省厅案件同步开始0】");
//		List<YYYY> li = dao.query(YYYY.class, null); 
		//\\44.53.4.111\share\TempFile\20171228\c10f2718-d713-4ece-bc7b-0640b5906cdf.jpg
	//	\\44.53.4.111\share\TempFile\20171228\c4d8b7df-2a7f-434d-bfed-afe0c5b32644_thumb.jpg
		//http://44.53.4.111:8090/files/20160809/Image/56de4362a91f123bcac6b7873934246c_thumb.jpg
		//http://44.53.4.111:8090/files/20160809/Image/245c8d36fc9d50e2fccd70ec8daae36d.jpg
		//a3d89e08c885.jpg
		//\\http://44.53.4.111:8090/files/20171228/b1f976dc-8717-49fe-b280-a3d89e08c885_thumb.jpg
		Sql sql = Sqls.create("select * from yy_view_mysql t where not exists ( select 1 from yy_insert_recodes y where y.mxbs = t.MXBS)"); 
		sql.setCallback(Sqls.callback.entities());
		sql.setEntity(dao.getEntity(YYYY.class));
		dao.execute(sql);
		List<YYYY> li = sql.getList(YYYY.class);
		if(li==null || li.size() == 0){
			logger.info("【未获取关联数据】");
			System.out.println("【未获取关联数据】");
			DaoUp.me().close();
			return;
		}
		logger.info("【省厅案件同步-----1-------获取到数据X条：】"+li.size());
		for(YYYY e : li){
			if(mxbs.contains(e.getMXBS())){
				continue;
			}
			mxbs.add(e.getMXBS());
			//生成缩略图
			final EPreviewFiles slt = new EPreviewFiles();
			String cclj =  rePath(e.getSLTLJ());
			slt.setFILES_PATH(cclj);
			slt.setCREATED_TIME(new Date());
			slt.setCREATED_USER(MysqUsers.GetUserByOrg(e.getCREATE_ORG()));
			slt.setSERVER_ID("keda000000001"); 
			slt.setOBJECT_TYPE(e.getRC_TYPE());
//			slt.setIMG_ITEM_TYPE(e.getT_TYPE());
			slt.setITEM_IMG_ID(e.getWJBS());//图片-视频  的文件id
			slt.setFILES_ID(UUID.randomUUID().toString());
			
			//生成对象
			final EObject ob = new EObject();
			ob.setCASE_ID(e.getAJBH());
			ob.setVIDEO_ADDRESS("0");
			ob.setOBJECT_ID(e.getMXBS());//Obj MXBS主键id;
			ob.setOBJ_TYPE(e.getRC_TYPE());
			ob.setCREATED_TIME(new Date());
			ob.setCREATED_USER(e.getSCRY());
			
			final EHumen h  =new EHumen();
			final ECar cc  =new ECar();
			if("1".equals(e.getRC_TYPE())){
				//人t.mxbs, t.xb, t.nlxx as nl, 2, t.tx
				
				List<RdxxBean> rl = dao.query(RdxxBean.class, Cnd.where("MXBS","=",e.getMXBS()));
				System.out.println("人："+rl.size());
				if(rl != null && rl.size()>0){
					RdxxBean r = rl.get(0);
					h.setXB(r.getXB());
					h.setSG(r.getNLSX());
					h.setTX(r.getTX());
					h.setOBJECT_ID(e.getMXBS());//MXBS主键id;
				}
				ob.setHUMAN_ID(e.getMXBS());
			}
			else if("2".equals(e.getRC_TYPE())){
				//车
				List<CdxxxBean> rl = dao.query(CdxxxBean.class, Cnd.where("MXBS","=",e.getMXBS()));
				System.out.println("车："+rl.size());
				if(rl != null && rl.size()>0){
					CdxxxBean c = rl.get(0);
					String  cllx = c.getCLLX();
					if("5".equals(cllx) || "10".equals(cllx) ||"12".equals(cllx)||"15".equals(cllx)){
						cllx = "2";//越野车
					}
					else if("13".equals(cllx) || "139".equals(cllx) ||"141".equals(cllx)){
						cllx = "1";//轿车
					}
					else if("66".equals(cllx) || "67".equals(cllx) ){
						cllx = "5";//二轮车
					}
					else if("61".equals(cllx) || "62".equals(cllx) ){
						cllx = "8";//三轮车
					}
					else if(cllx != null && !"".equals("")) {
						int hc = Integer.parseInt(cllx);
						if( hc > 16 && hc < 50 ){
							cllx = "4";//货车 
						}
						else{
							cllx = "";
						}
					}
					else{
						cllx = "";//其它 
					}
					cc.setCLLX(cllx);
					String csys = c.getCSYS();
					if("1".equals(csys) ) csys = "2";
					else if("3".equals(csys) ) csys = "6";
					else if("5".equals(csys) ) csys = "3";
					else if("7".equals(csys) ) csys = "5";
					else if("8".equals(csys) ) csys = "4";
					else if("10".equals(csys) ) csys = "1";
					else{
						csys = "";
					}
					
					cc.setCLYS(csys);
					cc.setCPH(c.getCPHM());
					cc.setOBJECT_ID(e.getMXBS());//MXBS主键id;
				}
				
				ob.setCAR_ID(e.getMXBS());
			}
			
			//文件Object_files
			final EBojectFiles eb = new EBojectFiles();
			eb.setFILES_ID(e.getWJBS()); //MXBS主键id;
			eb.setSERVER_ID("keda000000001");
			eb.setOBJ_TYPE(e.getRC_TYPE());//人车类型
			String cj =  rePath(e.getCCLJ());
			eb.setOBJ_PATH(cj);
			eb.setFILE_TYPE(e.getT_TYPE());//1视频，2图片
			eb.setOBJ_ID(e.getMXBS());
			eb.setCREATED_USER(MysqUsers.GetUserByOrg(e.getCREATE_ORG()));
			eb.setCREATED_TIME(new Date());
			eb.setCREATED_ORG(e.getCREATE_ORG());
			
			
			//案件
			final ECase aj = new ECase();
			final ECriminal ec = new ECriminal();//案件明细
			List<AjxxBean> rl = dao.query(AjxxBean.class, Cnd.where("AJBH","=",e.getAJBH()));
			if(rl != null && rl.size()>0){
				AjxxBean a= rl.get(0);
				aj.setCASE_ID(e.getAJBH());//AJBH主键id;
				aj.setCASE_AJMC(a.getAJMC());
				aj.setCREATED_ORG(e.getCREATE_ORG());
				aj.setCREATED_USER(MysqUsers.GetUserByOrg(e.getCREATE_ORG()));
				aj.setCREATED_TIME(new Date());
				aj.setIMG_ID(slt.getFILES_ID());
				 
				ec.setCASE_ID(e.getAJBH());//AJBH主键id;
				ec.setJZ_CODE(e.getAJBH());
				ec.setJYAQ(a.getAJMC());
				ec.setJJ_CODE(a.getAJBH());
				ec.setCASES_UNDER_UNIT(e.getCREATE_ORG());
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				try {
					if(!Strings.isEmpty(a.getAFKSSJ())){
						ec.setSFSJSX(sf.parse(a.getAFKSSJ()) );
					}
					if(!Strings.isEmpty(a.getAFJSSJ())){
						ec.setSFSJXX(sf.parse(a.getAFJSSJ()) );
					}
					if(!Strings.isEmpty(a.getSCSJ())){
						ec.setCASES_REGISTER_TIME(sf.parse(a.getSCSJ()));
					}

				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ec.setSFDD_QHNXXDZ(a.getAFDD());
//				ec.setCASES_STYLE_TIME();//作案时机
				ec.setCASES_STYLE_ZARS(a.getZARS());//作案人数
				ec.setCASES_STATUS("1");
				if(a.getAJZT() != null ){
					//案件状态（1：立案；2：破案；3：不予立案；4：不够立案；5：撤销案件）
					if("3".equals(a.getAJZT())){
						ec.setCASES_STATUS("1");
					}
					else if("3".equals(a.getAJZT())){
						ec.setCASES_STATUS("1");
					}
					else if("4".equals(a.getAJZT())){
						ec.setCASES_STATUS("2");
					}
					else if("6".equals(a.getAJZT())){
						ec.setCASES_STATUS("5");
					}
					else if("7".equals(a.getAJZT())){
						ec.setCASES_STATUS("3");
					}					
					else if("11".equals(a.getAJZT())){
						ec.setCASES_STATUS("4");
					}
					else{
						ec.setCASES_STATUS("1");
					}
				}
				String ajlb = a.getAJLB();
				if(ajlb ==null || "".equals(ajlb)){
					ajlb = "600299";
				}
				else if( ajlb.length() < 5){
					ajlb = "600299";
				} 
				ec.setCASES_BASE_SORT(ajlb);  
			}
			//更新记录
			final InsetRecodes rc = new InsetRecodes();
			rc.setInsertTime(new Date());
			rc.setMXBS(e.getMXBS());
			rc.setAJBH(e.getAJBH());
			rc.setRC_TYPE(e.getRC_TYPE());
			
			Trans.exec(new Atom(){
			    public void run() {
					logger.info("【省厅案件同步-----2------开始存数据：】");
			    	sqlDao.insert(slt);
			    	sqlDao.insert(ob);
			    	if(h.getOBJECT_ID() != null && !"".equals(h.getOBJECT_ID())){
			    		sqlDao.insert(h);//人
			    	}
			    	if(cc.getOBJECT_ID() != null && !"".equals(cc.getOBJECT_ID())){
			    		sqlDao.insert(cc);//车
			    	}
			    	
			    	List<EBojectFiles> eblist = sqlDao.query(EBojectFiles.class,Cnd.where("FILES_ID","=",eb.getFILES_ID()));
			    	if(eblist.size() == 0 ){
			    		sqlDao.insert(eb);
			    	}
			    	
			    	List<ECase> alist = sqlDao.query(ECase.class,Cnd.where("CASE_ID","=",aj.getCASE_ID()));
			    	if(alist.size() == 0 ){
			    		sqlDao.insert(aj);
			    	}
			    	List<ECriminal> clist = sqlDao.query(ECriminal.class,Cnd.where("CASE_ID","=",ec.getCASE_ID()));
			    	if(clist.size() == 0 ){
			    		sqlDao.insert(ec);
			    	}
			    	
					dao.insert( rc);//更新记录
					logger.info("【省厅案件同步-----3------此批数据同步成功】");

			    	System.out.println("【插入完成：yech】");
			    }
			});


		}
		DaoUp.me().close();
		
	}
	
	public static String rePath(String cclj ){
		cclj = cclj.replace("\\\\44.53.4.111\\share", "");
		cclj = cclj.replace("\\", "/");
		return cclj;
	}
	
}
