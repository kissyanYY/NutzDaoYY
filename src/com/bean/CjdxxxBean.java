package com.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;


@Table("B_TZ_ASJGL_CJDXXX")
public class CjdxxxBean {
	@Name
	  public String MXBS;
	
	@Column public String QZBH;
	@Column public String ZJMS;
	@Column public String  CSFL;
	@Column public String  TQQKFL;
	@Column public String   DLLXFL;
	@Column public String  DLXXFL;
	@Column public String   DLDXFL;
	@Column public String  DLLMFL;
	@Column public String  DLQKFL;
	@Column public String  ZMQKFL;
	@Column public String  RQJJCD;
	@Column public String  CJZYCD;
	
	
//	t.clue_id||SQ_CJ.NEXTVAL,
//	  t.clue_id,
//	  t.feature,
//	   '4',
//	   '2',
//	   '23',
//	   '1',
//	   '1',
//	   '2',
//	   '1',
//	   '1',
//	   '2',
//	   '2'
	
	
	public String getMXBS() {
		return MXBS;
	}
	public String getQZBH() {
		return QZBH;
	}
	public String getZJMS() {
		return ZJMS;
	}
	public String getCSFL() {
		return CSFL;
	}
	public String getTQQKFL() {
		return TQQKFL;
	}
	public String getDLLXFL() {
		return DLLXFL;
	}
	public String getDLXXFL() {
		return DLXXFL;
	}
	public String getDLDXFL() {
		return DLDXFL;
	}
	public String getDLLMFL() {
		return DLLMFL;
	}
	public String getDLQKFL() {
		return DLQKFL;
	}
	public String getZMQKFL() {
		return ZMQKFL;
	}
	public String getRQJJCD() {
		return RQJJCD;
	}
	public String getCJZYCD() {
		return CJZYCD;
	}
	public void setMXBS(String mXBS) {
		MXBS = mXBS;
	}
	public void setQZBH(String qZBH) {
		QZBH = qZBH;
	}
	public void setZJMS(String zJMS) {
		ZJMS = zJMS;
	}
	public void setCSFL(String cSFL) {
		CSFL = cSFL;
	}
	public void setTQQKFL(String tQQKFL) {
		TQQKFL = tQQKFL;
	}
	public void setDLLXFL(String dLLXFL) {
		DLLXFL = dLLXFL;
	}
	public void setDLXXFL(String dLXXFL) {
		DLXXFL = dLXXFL;
	}
	public void setDLDXFL(String dLDXFL) {
		DLDXFL = dLDXFL;
	}
	public void setDLLMFL(String dLLMFL) {
		DLLMFL = dLLMFL;
	}
	public void setDLQKFL(String dLQKFL) {
		DLQKFL = dLQKFL;
	}
	public void setZMQKFL(String zMQKFL) {
		ZMQKFL = zMQKFL;
	}
	public void setRQJJCD(String rQJJCD) {
		RQJJCD = rQJJCD;
	}
	public void setCJZYCD(String cJZYCD) {
		CJZYCD = cJZYCD;
	}
}
