package mysql.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.EL;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Prev;
import org.nutz.dao.entity.annotation.Table;


@Table("e_car")
public class ECar {
	
    @Name
    private	String	OBJECT_ID;
    @Column
	private	String	CLLX;
    @Column
	private	String	CPH;
    @Column
    private	String	CLYS;
    
    
	public String getOBJECT_ID() {
		return OBJECT_ID;
	}
	public void setOBJECT_ID(String oBJECT_ID) {
		OBJECT_ID = oBJECT_ID;
	}
	public String getCLLX() {
		return CLLX;
	}
	public void setCLLX(String cLLX) {
		CLLX = cLLX;
	}
	public String getCPH() {
		return CPH;
	}
	public void setCPH(String cPH) {
		CPH = cPH;
	}
	public String getCLYS() {
		return CLYS;
	}
	public void setCLYS(String cLYS) {
		CLYS = cLYS;
	}


}
