package mysql.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;


@Table("e_human")
public class EHumen {

    
    @Name
    private	String	OBJECT_ID;
    @Column
	private	String	XB;
    
    @Column
	private	String	NL;
    
    @Column
	private	String	SG;
	
    @Column
	private	String	TX;
    
    
    public String getOBJECT_ID() {
		return OBJECT_ID;
	}

	public void setOBJECT_ID(String oBJECT_ID) {
		OBJECT_ID = oBJECT_ID;
	}

	public String getXB() {
		return XB;
	}

	public void setXB(String xB) {
		XB = xB;
	}

	public String getNL() {
		return NL;
	}

	public void setNL(String nL) {
		NL = nL;
	}

	public String getSG() {
		return SG;
	}

	public void setSG(String sG) {
		SG = sG;
	}

	public String getTX() {
		return TX;
	}

	public void setTX(String tX) {
		TX = tX;
	}


}
