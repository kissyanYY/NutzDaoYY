package mysql.bean;

import java.util.Date;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;


@Table("b_object_files")
public class EBojectFiles {
	
    @Name
    private	String	FILES_ID;
    @Column
	private	String	SERVER_ID;
    @Column
	private	String	OBJ_PATH;
    @Column
	private	String	FILE_TYPE;
    @Column
    private	String	OBJ_ID ;
    @Column
    private	String	OBJ_TYPE ;

	@Column
    private String CREATED_USER;
    
    @Column
    private Date  CREATED_TIME;
    
    @Column
    private String  CREATED_ORG;
    
	public String getFILES_ID() {
		return FILES_ID;
	}
	public void setFILES_ID(String fILES_ID) {
		FILES_ID = fILES_ID;
	}
	public String getSERVER_ID() {
		return SERVER_ID;
	}
	public void setSERVER_ID(String sERVER_ID) {
		SERVER_ID = sERVER_ID;
	}
	public String getOBJ_PATH() {
		return OBJ_PATH;
	}
	public void setOBJ_PATH(String oBJ_PATH) {
		OBJ_PATH = oBJ_PATH;
	}
	public String getFILE_TYPE() {
		return FILE_TYPE;
	}
	public void setFILE_TYPE(String fILE_TYPE) {
		FILE_TYPE = fILE_TYPE;
	}
	public String getOBJ_ID() {
		return OBJ_ID;
	}
	public void setOBJ_ID(String oBJ_ID) {
		OBJ_ID = oBJ_ID;
	}
	public String getOBJ_TYPE() {
		return OBJ_TYPE;
	}
	public void setOBJ_TYPE(String oBJ_TYPE) {
		OBJ_TYPE = oBJ_TYPE;
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
	public String getCREATED_ORG() {
		return CREATED_ORG;
	}
	public void setCREATED_ORG(String cREATED_ORG) {
		CREATED_ORG = cREATED_ORG;
	}



}
