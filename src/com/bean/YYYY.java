package com.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Readonly;
import org.nutz.dao.entity.annotation.Table;
import org.nutz.dao.entity.annotation.View;


@Table("yy_test")
@View("yy_test")
public class YYYY {
	   @Column @Readonly private String 	AJBH;
	   @Column @Readonly private String 	SCRY;
	   @Column @Readonly private String 	SCSJ;
	   @Column @Readonly private String 	MXBS;
	   @Column @Readonly private String 	QZBH;
	   @Column @Readonly private String 	RC_TYPE;
	   @Column @Readonly private String 	WJBS;
	   @Column @Readonly private String 	T_TYPE;
	   @Column @Readonly private String 	CCLJ;
	   @Column @Readonly private String 	SLTLJ;
	   @Column @Readonly private String     CREATE_ORG;
	   
	   
	public String getAJBH() {
		return AJBH;
	}
	public void setAJBH(String aJBH) {
		AJBH = aJBH;
	}
	public String getSCRY() {
		return SCRY;
	}
	public void setSCRY(String sCRY) {
		SCRY = sCRY;
	}
	public String getSCSJ() {
		return SCSJ;
	}
	public void setSCSJ(String sCSJ) {
		SCSJ = sCSJ;
	}
	public String getMXBS() {
		return MXBS;
	}
	public void setMXBS(String mXBS) {
		MXBS = mXBS;
	}
	public String getQZBH() {
		return QZBH;
	}
	public void setQZBH(String qZBH) {
		QZBH = qZBH;
	}
	public String getRC_TYPE() {
		return RC_TYPE;
	}
	public void setRC_TYPE(String rC_TYPE) {
		RC_TYPE = rC_TYPE;
	}
	public String getWJBS() {
		return WJBS;
	}
	public void setWJBS(String wJBS) {
		WJBS = wJBS;
	}
	public String getT_TYPE() {
		return T_TYPE;
	}
	public void setT_TYPE(String t_TYPE) {
		T_TYPE = t_TYPE;
	}
	public String getCCLJ() {
		return CCLJ;
	}
	public void setCCLJ(String cCLJ) {
		CCLJ = cCLJ;
	}
	public String getSLTLJ() {
		return SLTLJ;
	}
	public void setSLTLJ(String sLTLJ) {
		SLTLJ = sLTLJ;
	}
	public String getCREATE_ORG() {
		return CREATE_ORG;
	}
	public void setCREATE_ORG(String cREATE_ORG) {
		CREATE_ORG = cREATE_ORG;
	}

}
