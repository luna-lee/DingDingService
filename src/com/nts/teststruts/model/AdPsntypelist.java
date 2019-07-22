package com.nts.teststruts.model;
// Generated 2016-9-26 8:44:15 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * AdPsntypelist generated by hbm2java
 */
@Entity
@Table(name = "AD_PSNTYPELIST", schema = "NC58")
public class AdPsntypelist implements java.io.Serializable {

	private String uuid;
	private String psnname;
	private String parentpsndocpk;
	private String deptpk;
	private String parentdeptpk;
	private String area;
	private String project;
	private String psndocpk;
	private String psnbasdocpk;
	private String psntype;
	private String note;
	private Date createTime;
	private int dr;

	public AdPsntypelist() {
	}

	public AdPsntypelist(String uuid, String psnname, String deptpk, String psndocpk, String psnbasdocpk,
			String psntype, Date createTime) {
		this.uuid = uuid;
		this.psnname = psnname;
		this.deptpk = deptpk;
		this.psndocpk = psndocpk;
		this.psnbasdocpk = psnbasdocpk;
		this.psntype = psntype;
		this.createTime = createTime;
	}

	public AdPsntypelist(String uuid, String psnname, String parentpsndocpk, String deptpk, String parentdeptpk,
			String area, String project, String psndocpk, String psnbasdocpk, String psntype, String note,
			Date createTime, int dr) {
		this.uuid = uuid;
		this.psnname = psnname;
		this.parentpsndocpk = parentpsndocpk;
		this.deptpk = deptpk;
		this.parentdeptpk = parentdeptpk;
		this.area = area;
		this.project = project;
		this.psndocpk = psndocpk;
		this.psnbasdocpk = psnbasdocpk;
		this.psntype = psntype;
		this.note = note;
		this.createTime = createTime;
		this.dr = dr;
	}

	@Id
	@GeneratedValue(generator="system-uuid") 
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "UUID", unique = true, nullable = false, length = 32)
	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Column(name = "PSNNAME", nullable = false, length = 15)
	public String getPsnname() {
		return this.psnname;
	}

	public void setPsnname(String psnname) {
		this.psnname = psnname;
	}

	@Column(name = "PARENTPSNDOCPK", length = 20)
	public String getParentpsndocpk() {
		return this.parentpsndocpk;
	}

	public void setParentpsndocpk(String parentpsndocpk) {
		this.parentpsndocpk = parentpsndocpk;
	}

	@Column(name = "DEPTPK", nullable = false, length = 20)
	public String getDeptpk() {
		return this.deptpk;
	}

	public void setDeptpk(String deptpk) {
		this.deptpk = deptpk;
	}

	@Column(name = "PARENTDEPTPK", length = 20)
	public String getParentdeptpk() {
		return this.parentdeptpk;
	}

	public void setParentdeptpk(String parentdeptpk) {
		this.parentdeptpk = parentdeptpk;
	}

	@Column(name = "AREA", length = 30)
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "PROJECT", length = 20)
	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	@Column(name = "PSNDOCPK", nullable = false, length = 20)
	public String getPsndocpk() {
		return this.psndocpk;
	}

	public void setPsndocpk(String psndocpk) {
		this.psndocpk = psndocpk;
	}

	@Column(name = "PSNBASDOCPK", nullable = false, length = 20)
	public String getPsnbasdocpk() {
		return this.psnbasdocpk;
	}

	public void setPsnbasdocpk(String psnbasdocpk) {
		this.psnbasdocpk = psnbasdocpk;
	}

	@Column(name = "PSNTYPE", nullable = false, length = 30)
	public String getPsntype() {
		return this.psntype;
	}

	public void setPsntype(String psntype) {
		this.psntype = psntype;
	}

	@Column(name = "NOTE", length = 50)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", nullable = false, length = 7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "DR", precision = 22, scale = 0)
	public int getDr() {
		return this.dr;
	}

	public void setDr(int dr) {
		this.dr = dr;
	}

}
