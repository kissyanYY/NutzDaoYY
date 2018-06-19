package mysql.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;

@Table("e_user")
public class EUser {
    
    @Name
    private	String	USER_ID;
    @Column
	private	String	POSITION_ID;
    @Column
	private	String	LOGIN_NAME;
    @Column
	private	String	POLICE_NO;
    @Column
	private	String	ORG_ID;
    @Column
	private	String	USER_NAME;
    @Column
	private	String	USER_PASSWORD;
    @Column
	private	String	USER_ID_NO;

    
    public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getPOSITION_ID() {
		return POSITION_ID;
	}
	public void setPOSITION_ID(String pOSITION_ID) {
		POSITION_ID = pOSITION_ID;
	}
	public String getLOGIN_NAME() {
		return LOGIN_NAME;
	}
	public void setLOGIN_NAME(String lOGIN_NAME) {
		LOGIN_NAME = lOGIN_NAME;
	}
	public String getPOLICE_NO() {
		return POLICE_NO;
	}
	public void setPOLICE_NO(String pOLICE_NO) {
		POLICE_NO = pOLICE_NO;
	}
	public String getORG_ID() {
		return ORG_ID;
	}
	public void setORG_ID(String oRG_ID) {
		ORG_ID = oRG_ID;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getUSER_PASSWOd() {
		return USER_PASSWORD;
	}
	public void setUSER_PASSWO(String uSER_PASSWOD) {
		USER_PASSWORD = uSER_PASSWOD;
	}
	public String getUSER_ID_NO() {
		return USER_ID_NO;
	}
	public void setUSER_ID_NO(String uSER_ID_NO) {
		USER_ID_NO = uSER_ID_NO;
	}

	


}
