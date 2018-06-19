package com.bean;

import java.util.Date;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;
@Table("yy_insert_recodes")
public class InsetRecodes {
	   @Name 
	   public String MXBS	;
	   
	   @Column 
	   public String AJBH	;
	   @Column 
	   public String RC_TYPE;
	   
	   @Column
	   public Date InsertTime;

	public String getMXBS() {
		return MXBS;
	}

	public Date getInsertTime() {
		return InsertTime;
	}

	public void setMXBS(String mXBS) {
		MXBS = mXBS;
	}

	public void setInsertTime(Date insertTime) {
		InsertTime = insertTime;
	}

	public String getAJBH() {
		return AJBH;
	}

	public String getRC_TYPE() {
		return RC_TYPE;
	}

	public void setAJBH(String aJBH) {
		AJBH = aJBH;
	}

	public void setRC_TYPE(String rC_TYPE) {
		RC_TYPE = rC_TYPE;
	}

}
