package mysql.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;

@Table("e_org")
public class EOrg {
	
	public String getORG_ID() {
		return ORG_ID;
	}
	public void setORG_ID(String oRG_ID) {
		ORG_ID = oRG_ID;
	}
	public String getORG_NAME() {
		return ORG_NAME;
	}
	public void setORG_NAME(String oRG_NAME) {
		ORG_NAME = oRG_NAME;
	}
	public String getPARENT_ORG_ID() {
		return PARENT_ORG_ID;
	}
	public void setPARENT_ORG_ID(String pARENT_ORG_ID) {
		PARENT_ORG_ID = pARENT_ORG_ID;
	}
	public String getORG_DESCRIPTION() {
		return ORG_DESCRIPTION;
	}
	public void setORG_DESCRIPTION(String oRG_DESCRIPTION) {
		ORG_DESCRIPTION = oRG_DESCRIPTION;
	}
	public String getORG_TEL() {
		return ORG_TEL;
	}
	public void setORG_TEL(String oRG_TEL) {
		ORG_TEL = oRG_TEL;
	}
	public String getORG_ADDRESS() {
		return ORG_ADDRESS;
	}
	public void setORG_ADDRESS(String oRG_ADDRESS) {
		ORG_ADDRESS = oRG_ADDRESS;
	}
	public String getORG_CONTACT() {
		return ORG_CONTACT;
	}
	public void setORG_CONTACT(String oRG_CONTACT) {
		ORG_CONTACT = oRG_CONTACT;
	}
	public String getORG_PATH() {
		return ORG_PATH;
	}
	public void setORG_PATH(String oRG_PATH) {
		ORG_PATH = oRG_PATH;
	}
	public Integer getORG_LEVEL() {
		return ORG_LEVEL;
	}
	public void setORG_LEVEL(Integer oRG_LEVEL) {
		ORG_LEVEL = oRG_LEVEL;
	}
	
	
	public int getORG_ORDER() {
		return ORG_ORDER;
	}
	public void setORG_ORDER(int oRG_ORDER) {
		ORG_ORDER = oRG_ORDER;
	}
	public int getORG_VERSION() {
		return ORG_VERSION;
	}
	public void setORG_VERSION(int oRG_VERSION) {
		ORG_VERSION = oRG_VERSION;
	}
	public java.sql.Date getORG_CREATED() {
		return ORG_CREATED;
	}
	public void setORG_CREATED(java.sql.Date oRG_CREATED) {
		ORG_CREATED = oRG_CREATED;
	}
	public String getORG_CREATOR() {
		return ORG_CREATOR;
	}
	public void setORG_CREATOR(String oRG_CREATOR) {
		ORG_CREATOR = oRG_CREATOR;
	}
	public String getORG_MODIFIER() {
		return ORG_MODIFIER;
	}
	public void setORG_MODIFIER(String oRG_MODIFIER) {
		ORG_MODIFIER = oRG_MODIFIER;
	}
	public String getORG_MODIFIED() {
		return ORG_MODIFIED;
	}
	public void setORG_MODIFIED(String oRG_MODIFIED) {
		ORG_MODIFIED = oRG_MODIFIED;
	}
	public String getORG_SHORT_NAME() {
		return ORG_SHORT_NAME;
	}
	public void setORG_SHORT_NAME(String oRG_SHORT_NAME) {
		ORG_SHORT_NAME = oRG_SHORT_NAME;
	}
	public String getORG_TYPE() {
		return ORG_TYPE;
	}
	public void setORG_TYPE(String oRG_TYPE) {
		ORG_TYPE = oRG_TYPE;
	}
	public String getORG_PROPERTY() {
		return ORG_PROPERTY;
	}
	public void setORG_PROPERTY(String oRG_PROPERTY) {
		ORG_PROPERTY = oRG_PROPERTY;
	}
	public Boolean getORG_ENABLED() {
		return ORG_ENABLED;
	}
	public void setORG_ENABLED(Boolean oRG_ENABLED) {
		ORG_ENABLED = oRG_ENABLED;
	}
	@Name
    @Column
    private	String	ORG_ID;
    @Column
	private	String	ORG_NAME;
    @Column
	private	String	PARENT_ORG_ID;
    @Column
	private	String	ORG_DESCRIPTION;
    @Column
	private	String	ORG_TEL;
    @Column
	private	String	ORG_ADDRESS;
    @Column
	private	String	ORG_CONTACT;
    @Column
	private	String	ORG_PATH;
    
    
    @Column
	private	Integer	ORG_LEVEL;
    @Column
	private	Boolean ORG_ENABLED;
    @Column
	private	int	ORG_ORDER;
    @Column
	private	int	ORG_VERSION;
    
    @Column
	private	java.sql.Date	ORG_CREATED;
    
    @Column
	private	String	ORG_CREATOR;

    @Column
	private	String	ORG_MODIFIER;
    @Column
	private	String	ORG_MODIFIED;
    @Column
	private	String	ORG_SHORT_NAME;
    
    @Column
	private	String	ORG_TYPE;
    @Column
	private	String	ORG_PROPERTY;
	

}
