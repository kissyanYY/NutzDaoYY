package com.test;

import java.util.List;

import mysql.bean.EBojectFiles;
import mysql.bean.ECar;
import mysql.bean.ECase;
import mysql.bean.ECriminal;
import mysql.bean.EHumen;
import mysql.bean.EObject;
import mysql.bean.EPreviewFiles;

import org.nutz.dao.Cnd;
import org.nutz.dao.Dao;
import org.nutz.dao.util.DaoUp;
import org.nutz.dao.util.Daos;

import com.bean.CdxxxBean;
import com.bean.InsetRecodes;
import com.bean.QzwjBean;
import com.bean.QzxxBean;
import com.bean.SPwjBean;
import com.bean.TPwjBean;
import com.dao.MyNutzDao;

public class TestDao {

	
	public static void main(String[] args) {
		
//		Dao dao = MyNutzDao.GetDaoDao();
		
//		ECar car = new ECar();
//		car.setCLLX("aaa");
//		dao.create(ECar.class, false);
//		dao.insert(car);
		
//		dao.drop(ECar.class);
//		Daos.createTablesInPackage(dao, "com.bean", false);//批量见表
		
//		List<QzwjBean> cdx = dao.query(QzwjBean.class, null);
//		List<SPwjBean> tpps = dao.query(SPwjBean.class, null);
////		List<TPwjBean> tpps = dao.query(TPwjBean.class, Cnd.where("WJBS", "=",  "2a55ddb3-4321-4c81-aac8-1b7d524ab132"));
////		
//		if(tpps != null && tpps.size() > 0){
//			for(SPwjBean tp : tpps){
//				System.out.println(tp.getWJBS() + "【图片：】"+tp.getYLSLTWLLJ());
//			}
//		}
//		for(QzwjBean qb :cdx) {
//			if("0".equals(qb.WJLX) ){
//				System.out.println("[qb]："+qb.WJLX+",:"+qb.WJBS);
//				List<QzxxBean> tplist = dao.query(QzxxBean.class, Cnd.where("QZBH", "=", qb.getQZBH()));
//				if(tplist != null && tplist.size() > 0){
//					QzxxBean tp = tplist.get(0);
//					System.out.println("【QzxxBean：】"+tp.getQZMC());
//				}
//			}
//		}
//		DaoUp.me().close();
		
		testCreateOracleTable();
	}
	
	public static void testCreateTable(){
		Dao dao = MyNutzDao.getSQlDao();
		
//		dao.drop(EBojectFiles.class);
//		dao.drop(ECar.class);
//		dao.drop(ECase.class);
//		dao.drop(ECriminal.class);
//		dao.drop(EHumen.class);
//		dao.drop(EObject.class);
//		dao.drop(EPreviewFiles.class);
		Daos.createTablesInPackage(dao, "mysql.bean", true);//批量见表

	}
	
	public static void testCreateOracleTable(){
		Dao dao = MyNutzDao.GetDaoDao();
		dao.create(InsetRecodes.class, true);
		
		DaoUp.me().close();
//		dao.drop(EBojectFiles.class);
//		dao.drop(ECar.class);
//		dao.drop(ECase.class);
//		dao.drop(ECriminal.class);
//		dao.drop(EHumen.class);
//		dao.drop(EObject.class);
//		dao.drop(EPreviewFiles.class);
//		Daos.createTablesInPackage(dao, "mysql.bean", true);//批量见表

	}
}
