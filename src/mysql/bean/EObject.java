package mysql.bean;

import java.util.Date;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;

@Table("e_object")
public class EObject {
	
	  @Name
	  private String OBJECT_ID	;//	varchar	50	主键

	  @Column	private String 	CASE_ID	;//	varchar	50	案件id	
	  @Column	private String 	OBJ_NAME	;//	varchar	300	目标名称	
	  @Column	private String 	OBJ_XYLB	;//	varchar	2	嫌疑类别	
	  @Column	private String 	OBJ_TYPE	;//	varchar	10	目标类型(1:目标人 2：目标车 3：目标人和目标车)	
	  @Column	private Date	OBJ_BJ_TIME	;//	datetime	0	目标出现北京时间	
	  @Column	private String 	OBJ_SUMMARY	;//	varchar	1000	目标描述	
	  @Column	private String 	OBJ_SEMANTIC	;//	text		目标语义	
	  @Column	private double 	OBJ_LONGITUDE	;//	double	12	经度	
	  @Column	private double 	OBJ_LATITUDE	;//	double	12	纬度	
	  @Column	private String 	OBJ_WHETHER_SUSPICIOUS	;//	varchar	2	是否监巡目标	
	  @Column	private String 	IMG_ID	;//	varchar	50	目标代表图	
	  @Column	private String 	CREATED_USER	;//	varchar	40	创建者	
	  @Column	private String 	MIDFIED_USER	;//	varchar	40	修改者	
	  @Column	private Date 	CREATED_TIME	;//	datetime	0	创建时间	
	  @Column	private Date 	MIDFIED_TIME	;//	datetime	0	修改时间	
	  @Column	private String 	CREATED_ORG	;//	varchar	50	创建机构	
	  @Column	private String 	VIDEO_ADDRESS	;//	时间校准
	  @Column	private String 	DEVICE_DEP	;//	varchar	500	设备负责人	
	  @Column	private String 	DEVICE_USER	;//	varchar	100	负责人联系方式	
	  @Column	private String 	DEVICE_TEL	;//	varchar	100	目标车ID	
	  @Column	private String 	HUMAN_ID	;//	varchar	50	目标人id	
	  @Column	private String 	CAR_ID	;//	varchar	50	目标车id	
	public String getOBJECT_ID() {
		return OBJECT_ID;
	}
	public String getCASE_ID() {
		return CASE_ID;
	}
	public String getOBJ_NAME() {
		return OBJ_NAME;
	}
	public String getOBJ_XYLB() {
		return OBJ_XYLB;
	}
	public String getOBJ_TYPE() {
		return OBJ_TYPE;
	}
	public Date getOBJ_BJ_TIME() {
		return OBJ_BJ_TIME;
	}
	public String getOBJ_SUMMARY() {
		return OBJ_SUMMARY;
	}
	public String getOBJ_SEMANTIC() {
		return OBJ_SEMANTIC;
	}
	public double getOBJ_LONGITUDE() {
		return OBJ_LONGITUDE;
	}
	public double getOBJ_LATITUDE() {
		return OBJ_LATITUDE;
	}
	public String getOBJ_WHETHER_SUSPICIOUS() {
		return OBJ_WHETHER_SUSPICIOUS;
	}
	public String getIMG_ID() {
		return IMG_ID;
	}
	public String getCREATED_USER() {
		return CREATED_USER;
	}
	public String getMIDFIED_USER() {
		return MIDFIED_USER;
	}
	public Date getCREATED_TIME() {
		return CREATED_TIME;
	}
	public Date getMIDFIED_TIME() {
		return MIDFIED_TIME;
	}
	public String getCREATED_ORG() {
		return CREATED_ORG;
	}
	public String getDEVICE_DEP() {
		return DEVICE_DEP;
	}
	public String getDEVICE_USER() {
		return DEVICE_USER;
	}
	public String getDEVICE_TEL() {
		return DEVICE_TEL;
	}
	public String getHUMAN_ID() {
		return HUMAN_ID;
	}
	public String getCAR_ID() {
		return CAR_ID;
	}
	public void setOBJECT_ID(String oBJECT_ID) {
		OBJECT_ID = oBJECT_ID;
	}
	public void setCASE_ID(String cASE_ID) {
		CASE_ID = cASE_ID;
	}
	public void setOBJ_NAME(String oBJ_NAME) {
		OBJ_NAME = oBJ_NAME;
	}
	public void setOBJ_XYLB(String oBJ_XYLB) {
		OBJ_XYLB = oBJ_XYLB;
	}
	public void setOBJ_TYPE(String oBJ_TYPE) {
		OBJ_TYPE = oBJ_TYPE;
	}
	public void setOBJ_BJ_TIME(Date oBJ_BJ_TIME) {
		OBJ_BJ_TIME = oBJ_BJ_TIME;
	}
	public void setOBJ_SUMMARY(String oBJ_SUMMARY) {
		OBJ_SUMMARY = oBJ_SUMMARY;
	}
	public void setOBJ_SEMANTIC(String oBJ_SEMANTIC) {
		OBJ_SEMANTIC = oBJ_SEMANTIC;
	}
	public void setOBJ_LONGITUDE(double oBJ_LONGITUDE) {
		OBJ_LONGITUDE = oBJ_LONGITUDE;
	}
	public void setOBJ_LATITUDE(double oBJ_LATITUDE) {
		OBJ_LATITUDE = oBJ_LATITUDE;
	}
	public void setOBJ_WHETHER_SUSPICIOUS(String oBJ_WHETHER_SUSPICIOUS) {
		OBJ_WHETHER_SUSPICIOUS = oBJ_WHETHER_SUSPICIOUS;
	}
	public void setIMG_ID(String iMG_ID) {
		IMG_ID = iMG_ID;
	}
	public void setCREATED_USER(String cREATED_USER) {
		CREATED_USER = cREATED_USER;
	}
	public void setMIDFIED_USER(String mIDFIED_USER) {
		MIDFIED_USER = mIDFIED_USER;
	}
	public void setCREATED_TIME(Date cREATED_TIME) {
		CREATED_TIME = cREATED_TIME;
	}
	public void setMIDFIED_TIME(Date mIDFIED_TIME) {
		MIDFIED_TIME = mIDFIED_TIME;
	}
	public void setCREATED_ORG(String cREATED_ORG) {
		CREATED_ORG = cREATED_ORG;
	}
	public void setDEVICE_DEP(String dEVICE_DEP) {
		DEVICE_DEP = dEVICE_DEP;
	}
	public void setDEVICE_USER(String dEVICE_USER) {
		DEVICE_USER = dEVICE_USER;
	}
	public void setDEVICE_TEL(String dEVICE_TEL) {
		DEVICE_TEL = dEVICE_TEL;
	}
	public void setHUMAN_ID(String hUMAN_ID) {
		HUMAN_ID = hUMAN_ID;
	}
	public void setCAR_ID(String cAR_ID) {
		CAR_ID = cAR_ID;
	}
	public String getVIDEO_ADDRESS() {
		return VIDEO_ADDRESS;
	}
	public void setVIDEO_ADDRESS(String vIDEO_ADDRESS) {
		VIDEO_ADDRESS = vIDEO_ADDRESS;
	}

}
