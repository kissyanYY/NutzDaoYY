package mysql.bean;

import java.util.Date;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.EL;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Prev;
import org.nutz.dao.entity.annotation.Table;


@Table("b_preview_files")
public class EPreviewFiles {
	
//	@Prev(els=@EL("uuid(32)")) // 可以是 uuid() uuid(32)
	@Name
	private	String	FILES_ID	;
    @Column
	private	String	SERVER_ID	;
    @Column
	private	String	FILES_PATH	;
    @Column
    private String CREATED_USER;
    @Column
    private Date  CREATED_TIME;
    @Column
    private String  ITEM_IMG_ID;
    
    @Column
    private String OBJECT_TYPE;
//    @Column
//    private String IMG_ITEM_TYPE;
    
    
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
	public String getFILES_PATH() {
		return FILES_PATH;
	}
	public void setFILES_PATH(String fILES_PATH) {
		FILES_PATH = fILES_PATH;
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
	public String getOBJECT_TYPE() {
		return OBJECT_TYPE;
	}
	public void setOBJECT_TYPE(String oBJECT_TYPE) {
		OBJECT_TYPE = oBJECT_TYPE;
	}
	public String getITEM_IMG_ID() {
		return ITEM_IMG_ID;
	}
	public void setITEM_IMG_ID(String iTEM_IMG_ID) {
		ITEM_IMG_ID = iTEM_IMG_ID;
	}

	
}
