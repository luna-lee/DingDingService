package com.nts.teststruts.model;
// Generated 2015-9-1 14:43:23 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SmUserandclerk generated by hbm2java
 */
@Entity
@Table(name = "SM_USERANDCLERK", schema = "NC58")
public class SmUserandclerk implements java.io.Serializable {

	private String pkUserandclerk;
	private Long dr;
	private String pkCorp;
	private String pkPsndoc;
	private String ts;
	private String userid;

	public SmUserandclerk() {
	}

	public SmUserandclerk(String pkUserandclerk, String pkCorp) {
		this.pkUserandclerk = pkUserandclerk;
		this.pkCorp = pkCorp;
	}

	public SmUserandclerk(String pkUserandclerk, Long dr, String pkCorp, String pkPsndoc, String ts, String userid) {
		this.pkUserandclerk = pkUserandclerk;
		this.dr = dr;
		this.pkCorp = pkCorp;
		this.pkPsndoc = pkPsndoc;
		this.ts = ts;
		this.userid = userid;
	}

	@Id

	@Column(name = "PK_USERANDCLERK", unique = true, nullable = false, length = 20)
	public String getPkUserandclerk() {
		return this.pkUserandclerk;
	}

	public void setPkUserandclerk(String pkUserandclerk) {
		this.pkUserandclerk = pkUserandclerk;
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

	@Column(name = "PK_PSNDOC", length = 20)
	public String getPkPsndoc() {
		return this.pkPsndoc;
	}

	public void setPkPsndoc(String pkPsndoc) {
		this.pkPsndoc = pkPsndoc;
	}

	@Column(name = "TS", length = 19)
	public String getTs() {
		return this.ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	@Column(name = "USERID", length = 20)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}
