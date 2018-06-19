package com.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;


@Table("B_TZ_ASJGL_QZWJ")
public class QzwjBean {
   @Name
   public String 	QZBH;

   @Column
   public String 	WJBS;

   @Column
   public String 	WJLX;
   
   @Column
   public String 	YLZD1;
	   
   @Column
	public String 	YLZD2;
	   
	@Column 
	public String 	YLZD3;
	
	
	public String getQZBH() {
		return QZBH;
	}
	public void setQZBH(String qZBH) {
		QZBH = qZBH;
	}
	public String getWJBS() {
		return WJBS;
	}
	public void setWJBS(String wJBS) {
		WJBS = wJBS;
	}
	public String getWJLX() {
		return WJLX;
	}
	public void setWJLX(String wJLX) {
		WJLX = wJLX;
	}
	public String getYLZD1() {
		return YLZD1;
	}
	public void setYLZD1(String yLZD1) {
		YLZD1 = yLZD1;
	}
	public String getYLZD2() {
		return YLZD2;
	}
	public void setYLZD2(String yLZD2) {
		YLZD2 = yLZD2;
	}
	public String getYLZD3() {
		return YLZD3;
	}
	public void setYLZD3(String yLZD3) {
		YLZD3 = yLZD3;
	}

}
