package mysql.bean;

import java.util.Date;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;

@Table("e_case")
public class ECase {

    
    @Name
	private String CASE_ID;
    
    @Column
	private String CASE_AJMC;
    @Column
	private String IMG_ID;
    @Column
	private String CREATED_USER;
    @Column
	private Date CREATED_TIME;
    @Column
	private String MIDFIED_USER;
    @Column
	private Date MIDFIED_TIME;
    @Column
	private String CREATED_ORG;
    @Column
	private String JZ_CODE;
    @Column
	private String XK_CODE;
    
	
	public String getCASE_ID() {
		return CASE_ID;
	}
	public void setCASE_ID(String cASE_ID) {
		CASE_ID = cASE_ID;
	}
	public String getCASE_AJMC() {
		return CASE_AJMC;
	}
	public void setCASE_AJMC(String cASE_AJMC) {
		CASE_AJMC = cASE_AJMC;
	}
	public String getIMG_ID() {
		return IMG_ID;
	}
	public void setIMG_ID(String iMG_ID) {
		IMG_ID = iMG_ID;
	}
	public String getCREATED_USER() {
		return CREATED_USER;
	}
	public void setCREATED_USER(String cREATED_USER) {
		CREATED_USER = cREATED_USER;
	}
	public Date getCREATED_TIME() {
		return CREATED_TIME;
	}
	public void setCREATED_TIME(Date cREATED_TIME) {
		CREATED_TIME = cREATED_TIME;
	}
	public String getMIDFIED_USER() {
		return MIDFIED_USER;
	}
	public void setMIDFIED_USER(String mIDFIED_USER) {
		MIDFIED_USER = mIDFIED_USER;
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
	public String getJZ_CODE() {
		return JZ_CODE;
	}
	public void setJZ_CODE(String jZ_CODE) {
		JZ_CODE = jZ_CODE;
	}
	public String getXK_CODE() {
		return XK_CODE;
	}
	public void setXK_CODE(String xK_CODE) {
		XK_CODE = xK_CODE;
	}


}
