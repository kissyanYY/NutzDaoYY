package com.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;

@Table("B_TZ_ASJGL_AJXX")
public class AjxxBean {
	@Name
	public String 	AJBH	;//	VARCHAR2(64)	N
	
	@Column public String 	YSBH	;//	VARCHAR2(64)	Y
	@Column public String 	AJMC	;//	VARCHAR2(256)	N
	@Column public String 	AJLB	;//	VARCHAR2(8)	Y
	@Column public String 	AJZT	;//	VARCHAR2(8)	Y
	@Column public String 	AJDL	;//	VARCHAR2(8)	Y
	@Column public String 	AJLX	;//	VARCHAR2(8)	Y
	@Column public String 	WHCD	;//	VARCHAR2(8)	Y
	@Column public String 	AFKSSJ	;//	VARCHAR2(32)	Y
	@Column public String 	AFJSSJ	;//	VARCHAR2(32)	Y
	@Column public String 	AFDD	;//	VARCHAR2(256)	Y
	@Column public double 	JD	;//	NUMBER(12,6)	Y
	@Column public double 	WD	;//	NUMBER(12,6)	Y
	@Column public String 	SSXQ	;//	VARCHAR2(32)	Y
	@Column public String 	GL	;//	VARCHAR2(128)	Y
	@Column public String 	SSQK	;//	VARCHAR2(256)	Y
	@Column public String 	BJSJ	;//	VARCHAR2(32)	Y
	@Column public String 	BJRY	;//	VARCHAR2(32)	Y
	@Column public String 	BJDW	;//	VARCHAR2(128)	Y
	@Column public String 	BJDH	;//	VARCHAR2(32)	Y
	@Column public String 	BJTJ	;//	VARCHAR2(64)	Y
	@Column public String 	BJSY	;//	VARCHAR2(256)	Y
	@Column public String 	BJRCS	;//	VARCHAR2(4000)	Y
	@Column public String 	JBRY	;//	VARCHAR2(32)	Y
	@Column public String 	JBDW	;//	VARCHAR2(128)	Y
	@Column public String 	SLRY	;//	VARCHAR2(32)	Y
	@Column public String 	SLDW	;//	VARCHAR2(128)	Y
	@Column public String 	YPSM	;//	VARCHAR2(4000)	Y
	@Column public String 	AJMS	;//	VARCHAR2(4000)	Y
	@Column public String 	ZASJ	;//	VARCHAR2(256)	Y
	@Column public String 	XZCS	;//	VARCHAR2(256)	Y
	@Column public String 	SHBW	;//	VARCHAR2(256)	Y
	@Column public String 	ZARS	;//	VARCHAR2(8)	Y
	@Column public String 	XZDX	;//	VARCHAR2(256)	Y
	@Column public String 	SDTD	;//	VARCHAR2(256)	Y
	@Column public String 	SCYH	;//	VARCHAR2(32)	Y
	@Column public String 	SCSJ	;//	VARCHAR2(32)	Y
	@Column public String 	YLZD1	;//	VARCHAR2(128)	Y
	@Column public String 	YLZD2	;//	VARCHAR2(128)	Y
	@Column public String 	YLZD3	;//	VARCHAR2(128)	Y
	@Column public String 	YLZD4	;//	VARCHAR2(256)	Y
	@Column public String 	YLZD5	;//	VARCHAR2(512)	Y
	@Column public String 	YLZD6	;//	VARCHAR2(1024)	Y
	@Column public String 	SCRY	;//	VARCHAR2(32)	Y
	@Column public String 	GXSJ	;//	VARCHAR2(32)	Y
	@Column public String 	GXYH	;//	VARCHAR2(32)	Y
	@Column public String 	GXRY	;//	VARCHAR2(32)	Y
	@Column public String 	XCKYH	;//	VARCHAR2(64)	Y
	public String getAJBH() {
		return AJBH;
	}
	public String getYSBH() {
		return YSBH;
	}
	public String getAJMC() {
		return AJMC;
	}
	public String getAJLB() {
		return AJLB;
	}
	public String getAJZT() {
		return AJZT;
	}
	public String getAJDL() {
		return AJDL;
	}
	public String getAJLX() {
		return AJLX;
	}
	public String getWHCD() {
		return WHCD;
	}
	public String getAFKSSJ() {
		return AFKSSJ;
	}
	public String getAFJSSJ() {
		return AFJSSJ;
	}
	public String getAFDD() {
		return AFDD;
	}
	public double getJD() {
		return JD;
	}
	public double getWD() {
		return WD;
	}
	public String getSSXQ() {
		return SSXQ;
	}
	public String getGL() {
		return GL;
	}
	public String getSSQK() {
		return SSQK;
	}
	public String getBJSJ() {
		return BJSJ;
	}
	public String getBJRY() {
		return BJRY;
	}
	public String getBJDW() {
		return BJDW;
	}
	public String getBJDH() {
		return BJDH;
	}
	public String getBJTJ() {
		return BJTJ;
	}
	public String getBJSY() {
		return BJSY;
	}
	public String getBJRCS() {
		return BJRCS;
	}
	public String getJBRY() {
		return JBRY;
	}
	public String getJBDW() {
		return JBDW;
	}
	public String getSLRY() {
		return SLRY;
	}
	public String getSLDW() {
		return SLDW;
	}
	public String getYPSM() {
		return YPSM;
	}
	public String getAJMS() {
		return AJMS;
	}
	public String getZASJ() {
		return ZASJ;
	}
	public String getXZCS() {
		return XZCS;
	}
	public String getSHBW() {
		return SHBW;
	}
	public String getZARS() {
		return ZARS;
	}
	public String getXZDX() {
		return XZDX;
	}
	public String getSDTD() {
		return SDTD;
	}
	public String getSCYH() {
		return SCYH;
	}
	public String getSCSJ() {
		return SCSJ;
	}
	public String getYLZD1() {
		return YLZD1;
	}
	public String getYLZD2() {
		return YLZD2;
	}
	public String getYLZD3() {
		return YLZD3;
	}
	public String getYLZD4() {
		return YLZD4;
	}
	public String getYLZD5() {
		return YLZD5;
	}
	public String getYLZD6() {
		return YLZD6;
	}
	public String getSCRY() {
		return SCRY;
	}
	public String getGXSJ() {
		return GXSJ;
	}
	public String getGXYH() {
		return GXYH;
	}
	public String getGXRY() {
		return GXRY;
	}
	public String getXCKYH() {
		return XCKYH;
	}
	public void setAJBH(String aJBH) {
		AJBH = aJBH;
	}
	public void setYSBH(String ySBH) {
		YSBH = ySBH;
	}
	public void setAJMC(String aJMC) {
		AJMC = aJMC;
	}
	public void setAJLB(String aJLB) {
		AJLB = aJLB;
	}
	public void setAJZT(String aJZT) {
		AJZT = aJZT;
	}
	public void setAJDL(String aJDL) {
		AJDL = aJDL;
	}
	public void setAJLX(String aJLX) {
		AJLX = aJLX;
	}
	public void setWHCD(String wHCD) {
		WHCD = wHCD;
	}
	public void setAFKSSJ(String aFKSSJ) {
		AFKSSJ = aFKSSJ;
	}
	public void setAFJSSJ(String aFJSSJ) {
		AFJSSJ = aFJSSJ;
	}
	public void setAFDD(String aFDD) {
		AFDD = aFDD;
	}
	public void setJD(double jD) {
		JD = jD;
	}
	public void setWD(double wD) {
		WD = wD;
	}
	public void setSSXQ(String sSXQ) {
		SSXQ = sSXQ;
	}
	public void setGL(String gL) {
		GL = gL;
	}
	public void setSSQK(String sSQK) {
		SSQK = sSQK;
	}
	public void setBJSJ(String bJSJ) {
		BJSJ = bJSJ;
	}
	public void setBJRY(String bJRY) {
		BJRY = bJRY;
	}
	public void setBJDW(String bJDW) {
		BJDW = bJDW;
	}
	public void setBJDH(String bJDH) {
		BJDH = bJDH;
	}
	public void setBJTJ(String bJTJ) {
		BJTJ = bJTJ;
	}
	public void setBJSY(String bJSY) {
		BJSY = bJSY;
	}
	public void setBJRCS(String bJRCS) {
		BJRCS = bJRCS;
	}
	public void setJBRY(String jBRY) {
		JBRY = jBRY;
	}
	public void setJBDW(String jBDW) {
		JBDW = jBDW;
	}
	public void setSLRY(String sLRY) {
		SLRY = sLRY;
	}
	public void setSLDW(String sLDW) {
		SLDW = sLDW;
	}
	public void setYPSM(String yPSM) {
		YPSM = yPSM;
	}
	public void setAJMS(String aJMS) {
		AJMS = aJMS;
	}
	public void setZASJ(String zASJ) {
		ZASJ = zASJ;
	}
	public void setXZCS(String xZCS) {
		XZCS = xZCS;
	}
	public void setSHBW(String sHBW) {
		SHBW = sHBW;
	}
	public void setZARS(String zARS) {
		ZARS = zARS;
	}
	public void setXZDX(String xZDX) {
		XZDX = xZDX;
	}
	public void setSDTD(String sDTD) {
		SDTD = sDTD;
	}
	public void setSCYH(String sCYH) {
		SCYH = sCYH;
	}
	public void setSCSJ(String sCSJ) {
		SCSJ = sCSJ;
	}
	public void setYLZD1(String yLZD1) {
		YLZD1 = yLZD1;
	}
	public void setYLZD2(String yLZD2) {
		YLZD2 = yLZD2;
	}
	public void setYLZD3(String yLZD3) {
		YLZD3 = yLZD3;
	}
	public void setYLZD4(String yLZD4) {
		YLZD4 = yLZD4;
	}
	public void setYLZD5(String yLZD5) {
		YLZD5 = yLZD5;
	}
	public void setYLZD6(String yLZD6) {
		YLZD6 = yLZD6;
	}
	public void setSCRY(String sCRY) {
		SCRY = sCRY;
	}
	public void setGXSJ(String gXSJ) {
		GXSJ = gXSJ;
	}
	public void setGXYH(String gXYH) {
		GXYH = gXYH;
	}
	public void setGXRY(String gXRY) {
		GXRY = gXRY;
	}
	public void setXCKYH(String xCKYH) {
		XCKYH = xCKYH;
	}

}
