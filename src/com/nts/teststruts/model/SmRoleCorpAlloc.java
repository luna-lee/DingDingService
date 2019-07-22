package com.nts.teststruts.model;
// Generated 2015-7-26 20:25:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SmRoleCorpAlloc generated by hbm2java
 */
@Entity
@Table(name = "SM_ROLE_CORP_ALLOC", schema = "NC58")
public class SmRoleCorpAlloc implements java.io.Serializable {

	private String pkRoleCorpAlloc;
	private Long dr;
	private String pkCorp;
	private String pkRole;
	private char roleAssignFlag;
	private String ts;
	private BigDecimal usercount;

	public SmRoleCorpAlloc() {
	}

	public SmRoleCorpAlloc(String pkRoleCorpAlloc, String pkCorp, String pkRole, char roleAssignFlag) {
		this.pkRoleCorpAlloc = pkRoleCorpAlloc;
		this.pkCorp = pkCorp;
		this.pkRole = pkRole;
		this.roleAssignFlag = roleAssignFlag;
	}

	public SmRoleCorpAlloc(String pkRoleCorpAlloc, Long dr, String pkCorp, String pkRole, char roleAssignFlag,
			String ts, BigDecimal usercount) {
		this.pkRoleCorpAlloc = pkRoleCorpAlloc;
		this.dr = dr;
		this.pkCorp = pkCorp;
		this.pkRole = pkRole;
		this.roleAssignFlag = roleAssignFlag;
		this.ts = ts;
		this.usercount = usercount;
	}

	@Id

	@Column(name = "PK_ROLE_CORP_ALLOC", unique = true, nullable = false, length = 20)
	public String getPkRoleCorpAlloc() {
		return this.pkRoleCorpAlloc;
	}

	public void setPkRoleCorpAlloc(String pkRoleCorpAlloc) {
		this.pkRoleCorpAlloc = pkRoleCorpAlloc;
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

	@Column(name = "ROLE_ASSIGN_FLAG", nullable = false, length = 1)
	public char getRoleAssignFlag() {
		return this.roleAssignFlag;
	}

	public void setRoleAssignFlag(char roleAssignFlag) {
		this.roleAssignFlag = roleAssignFlag;
	}

	@Column(name = "TS", length = 19)
	public String getTs() {
		return this.ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	@Column(name = "USERCOUNT", precision = 38, scale = 0)
	public BigDecimal getUsercount() {
		return this.usercount;
	}

	public void setUsercount(BigDecimal usercount) {
		this.usercount = usercount;
	}

}