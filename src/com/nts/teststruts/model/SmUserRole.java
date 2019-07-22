package com.nts.teststruts.model;
// Generated 2015-7-26 20:25:59 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SmUserRole generated by hbm2java
 */
@Entity
@Table(name = "SM_USER_ROLE", schema = "NC58")
public class SmUserRole implements java.io.Serializable {

	private String pkUserRole;
	private String cuserid;
	private Long dr;
	private String pkCorp;
	private String pkRole;
	private String ts;

	public SmUserRole() {
	}

	public SmUserRole(String pkUserRole, String cuserid, String pkCorp, String pkRole) {
		this.pkUserRole = pkUserRole;
		this.cuserid = cuserid;
		this.pkCorp = pkCorp;
		this.pkRole = pkRole;
	}

	public SmUserRole(String pkUserRole, String cuserid, Long dr, String pkCorp, String pkRole, String ts) {
		this.pkUserRole = pkUserRole;
		this.cuserid = cuserid;
		this.dr = dr;
		this.pkCorp = pkCorp;
		this.pkRole = pkRole;
		this.ts = ts;
	}

	@Id

	@Column(name = "PK_USER_ROLE", unique = true, nullable = false, length = 20)
	public String getPkUserRole() {
		return this.pkUserRole;
	}

	public void setPkUserRole(String pkUserRole) {
		this.pkUserRole = pkUserRole;
	}

	@Column(name = "CUSERID", nullable = false, length = 20)
	public String getCuserid() {
		return this.cuserid;
	}

	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}

	@Column(name = "DR", precision = 10, scale = 0)
	public Long getDr() {
		return this.dr;
	}

	public void setDr(Long dr) {
		this.dr = dr;
	}

	@Column(name = "PK_CORP", nullable = false, length = 4)
	public String getPkCorp() {
		return this.pkCorp;
	}

	public void setPkCorp(String pkCorp) {
		this.pkCorp = pkCorp;
	}

	@Column(name = "PK_ROLE", nullable = false, length = 20)
	public String getPkRole() {
		return this.pkRole;
	}

	public void setPkRole(String pkRole) {
		this.pkRole = pkRole;
	}

	@Column(name = "TS", length = 19)
	public String getTs() {
		return this.ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

}