package mysql.bean;

import java.math.BigDecimal;
import java.util.Date;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;



@Table("e_criminal")
public class ECriminal {

    @Name
	private	String	CASE_ID; 
    @Column
	private	String	JZ_CODE;
    @Column
	private	String	JJ_CODE;
    @Column
	private	String	JYAQ;
    @Column
	private	Date	SFSJSX;
    
    @Column
	private	Date	SFSJXX;
    
	@Column
	private	BigDecimal	SFDJD;
    
    @Column
	private	BigDecimal	SFDWD;
    
    @Column
	private	String	CASES_UNDER_UNIT;
    
    @Column
	private	String	CASES_AUDIT_FLAG;
    @Column
	private	String	CASES_EDIT_STATUS;
    @Column
	private	String	CASES_REGISTER_UNIT;
    @Column
	private	String	CASES_SOVLE_UNIT;
    @Column
	private	Date	CASES_SOVLE_TIME;
    @Column
	private	String	CASES_BASE_SORT;
    
	@Column
	private	String	SFDD_QHNXXDZ;
    @Column
	private	String	CASES_STATUS;
    @Column
	private	Date CASES_REGISTER_TIME;
    
    @Column
    private String CASES_STYLE_TIME;//作案时间
    @Column
    private String CASES_STYLE_ZARS;//作案人数
    
	
    public String getSFDD_QHNXXDZ() {
		return SFDD_QHNXXDZ;
	}
	public void setSFDD_QHNXXDZ(String sFDD_QHNXXDZ) {
		SFDD_QHNXXDZ = sFDD_QHNXXDZ;
	}
	public String getCASES_STATUS() {
		return CASES_STATUS;
	}
	public void setCASES_STATUS(String cASES_STATUS) {
		CASES_STATUS = cASES_STATUS;
	}
    
	public String getJZ_CODE() {
		return JZ_CODE;
	}
	public void setJZ_CODE(String jZ_CODE) {
		JZ_CODE = jZ_CODE;
	}
	public String getJJ_CODE() {
		return JJ_CODE;
	}
	public void setJJ_CODE(String jJ_CODE) {
		JJ_CODE = jJ_CODE;
	}
	public String getJYAQ() {
		return JYAQ;
	}
	public void setJYAQ(String jYAQ) {
		JYAQ = jYAQ;
	}
	public Date getSFSJSX() {
		return SFSJSX;
	}
	public void setSFSJSX(Date sFSJSX) {
		SFSJSX = sFSJSX;
	}
	public Date getSFSJXX() {
		return SFSJXX;
	}
	public void setSFSJXX(Date sFSJXX) {
		SFSJXX = sFSJXX;
	}
	public String getCASES_UNDER_UNIT() {
		return CASES_UNDER_UNIT;
	}
	public void setCASES_UNDER_UNIT(String cASES_UNDER_UNIT) {
		CASES_UNDER_UNIT = cASES_UNDER_UNIT;
	}
	public String getCASES_AUDIT_FLAG() {
		return CASES_AUDIT_FLAG;
	}
	public void setCASES_AUDIT_FLAG(String cASES_AUDIT_FLAG) {
		CASES_AUDIT_FLAG = cASES_AUDIT_FLAG;
	}
	public String getCASES_EDIT_STATUS() {
		return CASES_EDIT_STATUS;
	}
	public void setCASES_EDIT_STATUS(String cASES_EDIT_STATUS) {
		CASES_EDIT_STATUS = cASES_EDIT_STATUS;
	}
	public String getCASES_REGISTER_UNIT() {
		return CASES_REGISTER_UNIT;
	}
	public void setCASES_REGISTER_UNIT(String cASES_REGISTER_UNIT) {
		CASES_REGISTER_UNIT = cASES_REGISTER_UNIT;
	}
	public String getCASES_SOVLE_UNIT() {
		return CASES_SOVLE_UNIT;
	}
	public void setCASES_SOVLE_UNIT(String cASES_SOVLE_UNIT) {
		CASES_SOVLE_UNIT = cASES_SOVLE_UNIT;
	}
	public Date getCASES_SOVLE_TIME() {
		return CASES_SOVLE_TIME;
	}
	public void setCASES_SOVLE_TIME(Date cASES_SOVLE_TIME) {
		CASES_SOVLE_TIME = cASES_SOVLE_TIME;
	}
	public String getCASES_BASE_SORT() {
		return CASES_BASE_SORT;
	}
	public void setCASES_BASE_SORT(String cASES_BASE_SORT) {
		CASES_BASE_SORT = cASES_BASE_SORT;
	}

    public BigDecimal getSFDJD() {
		return SFDJD;
	}
	public void setSFDJD(BigDecimal sFDJD) {
		SFDJD = sFDJD;
	}
	public BigDecimal getSFDWD() {
		return SFDWD;
	}
	public void setSFDWD(BigDecimal sFDWD) {
		SFDWD = sFDWD;
	}
	public String getCASE_ID() {
		return CASE_ID;
	}
	public void setCASE_ID(String cASE_ID) {
		CASE_ID = cASE_ID;
	}
	public Date getCASES_REGISTER_TIME() {
		return CASES_REGISTER_TIME;
	}
	public void setCASES_REGISTER_TIME(Date cASES_REGISTER_TIME) {
		CASES_REGISTER_TIME = cASES_REGISTER_TIME;
	}
	public String getCASES_STYLE_TIME() {
		return CASES_STYLE_TIME;
	}
	public String getCASES_STYLE_ZARS() {
		return CASES_STYLE_ZARS;
	}
	public void setCASES_STYLE_TIME(String cASES_STYLE_TIME) {
		CASES_STYLE_TIME = cASES_STYLE_TIME;
	}
	public void setCASES_STYLE_ZARS(String cASES_STYLE_ZARS) {
		CASES_STYLE_ZARS = cASES_STYLE_ZARS;
	}
	
}
