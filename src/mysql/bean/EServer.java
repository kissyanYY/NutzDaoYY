package mysql.bean;

import java.util.Date;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;


@Table("s_server")
public class EServer {
	
	@Name
	private	String	SERVER_ID;
    @Column
	private	int	SERVER_VERSION;
    @Column
	private	int	SERVER_ORDER;
    @Column
    private	String	ORG_ID;
    @Column
    private	String	SERVER_NAME;
    @Column
    private	String	SERVER_DEFAULT;
    @Column
    private	String	SERVER_TYPE;
    @Column
    private	String	SERVER_USERNAME;
    @Column
    private	String	SERVER_PSW;
    @Column
    private	String	SERVER_HOST;
    @Column
    private	String	SERVER_PORT;
    @Column
    private	String	SERVER_URL;
    @Column
    private	String	SERVER_PATH;
    @Column
    private	String	REMARK;
    @Column
    private	String	CREATED_USER;
    @Column
    private	String	MIDFIED_USER;
    @Column
    private	Date	CREATED_TIME;
    @Column
    private	Date	MIDFIED_TIME;
    @Column
    private	String	CREATED_ORG;

	
    public String getSERVER_ID() {
		return SERVER_ID;
	}
	public void setSERVER_ID(String sERVER_ID) {
		SERVER_ID = sERVER_ID;
	}
	public int getSERVER_VERSION() {
		return SERVER_VERSION;
	}
	public void setSERVER_VERSION(int sERVER_VERSION) {
		SERVER_VERSION = sERVER_VERSION;
	}
	public int getSERVER_ORDER() {
		return SERVER_ORDER;
	}
	public void setSERVER_ORDER(int sERVER_ORDER) {
		SERVER_ORDER = sERVER_ORDER;
	}
	public String getORG_ID() {
		return ORG_ID;
	}
	public void setORG_ID(String oRG_ID) {
		ORG_ID = oRG_ID;
	}
	public String getSERVER_NAME() {
		return SERVER_NAME;
	}
	public void setSERVER_NAME(String sERVER_NAME) {
		SERVER_NAME = sERVER_NAME;
	}
	public String getSERVER_DEFAULT() {
		return SERVER_DEFAULT;
	}
	public void setSERVER_DEFAULT(String sERVER_DEFAULT) {
		SERVER_DEFAULT = sERVER_DEFAULT;
	}
	public String getSERVER_TYPE() {
		return SERVER_TYPE;
	}
	public void setSERVER_TYPE(String sERVER_TYPE) {
		SERVER_TYPE = sERVER_TYPE;
	}
	public String getSERVER_USERNAME() {
		return SERVER_USERNAME;
	}
	public void setSERVER_USERNAME(String sERVER_USERNAME) {
		SERVER_USERNAME = sERVER_USERNAME;
	}
	public String getSERVER_PSW() {
		return SERVER_PSW;
	}
	public void setSERVER_PSW(String sERVER_PSW) {
		SERVER_PSW = sERVER_PSW;
	}
	public String getSERVER_HOST() {
		return SERVER_HOST;
	}
	public void setSERVER_HOST(String sERVER_HOST) {
		SERVER_HOST = sERVER_HOST;
	}
	public String getSERVER_PORT() {
		return SERVER_PORT;
	}
	public void setSERVER_PORT(String sERVER_PORT) {
		SERVER_PORT = sERVER_PORT;
	}
	public String getSERVER_URL() {
		return SERVER_URL;
	}
	public void setSERVER_URL(String sERVER_URL) {
		SERVER_URL = sERVER_URL;
	}
	public String getSERVER_PATH() {
		return SERVER_PATH;
	}
	public void setSERVER_PATH(String sERVER_PATH) {
		SERVER_PATH = sERVER_PATH;
	}
	public String getREMARK() {
		return REMARK;
	}
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}
	public String getCREATED_USER() {
		return CREATED_USER;
	}
	public void setCREATED_USER(String cREATED_USER) {
		CREATED_USER = cREATED_USER;
	}
	public String getMIDFIED_USER() {
		return MIDFIED_USER;
	}
	public void setMIDFIED_USER(String mIDFIED_USER) {
		MIDFIED_USER = mIDFIED_USER;
	}
	public Date getCREATED_TIME() {
		return CREATED_TIME;
	}
	public void setCREATED_TIME(Date cREATED_TIME) {
		CREATED_TIME = cREATED_TIME;
	}
	public Date getMIDFIED_TIME() {
		return MIDFIED_TIME;
	}
	public void setMIDFIED_TIME(Date mIDFIED_TIME) {
		MIDFIED_TIME = mIDFIED_TIME;
	}
	public String getCREATED_ORG() {
		return CREATED_ORG;
	}
	public void setCREATED_ORG(String cREATED_ORG) {
		CREATED_ORG = cREATED_ORG;
	}
	
}
