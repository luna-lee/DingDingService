package com.nts.teststruts.model;
// Generated 2016-9-26 9:36:23 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * AdPsndocscore generated by hbm2java
 */
@Entity
@Table(name = "AD_PSNDOCSCORE", schema = "NC58")
public class AdPsndocscore implements java.io.Serializable {

	private String uuidPs;
	private String pkPsndoc;
	private Boolean scoretype;
	private BigDecimal score;
	private String cknote;
	private String pkPsnbasdoc;

	public AdPsndocscore() {
	}

	public AdPsndocscore(String uuidPs, String pkPsndoc, BigDecimal score, String pkPsnbasdoc) {
		this.uuidPs = uuidPs;
		this.pkPsndoc = pkPsndoc;
		this.score = score;
		this.pkPsnbasdoc = pkPsnbasdoc;
	}

	public AdPsndocscore(String uuidPs, String pkPsndoc, Boolean scoretype, BigDecimal score, String cknote,
			String pkPsnbasdoc) {
		this.uuidPs = uuidPs;
		this.pkPsndoc = pkPsndoc;
		this.scoretype = scoretype;
		this.score = score;
		this.cknote = cknote;
		this.pkPsnbasdoc = pkPsnbasdoc;
	}

	@Id
	@GeneratedValue(generator="system-uuid") 
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "UUID_PS", unique = true, nullable = false, length = 36)
	public String getUuidPs() {
		return this.uuidPs;
	}

	public void setUuidPs(String uuidPs) {
		this.uuidPs = uuidPs;
	}

	@Column(name = "PK_PSNDOC", nullable = false, length = 20)
	public String getPkPsndoc() {
		return this.pkPsndoc;
	}

	public void setPkPsndoc(String pkPsndoc) {
		this.pkPsndoc = pkPsndoc;
	}

	@Column(name = "SCORETYPE", precision = 1, scale = 0)
	public Boolean getScoretype() {
		return this.scoretype;
	}

	public void setScoretype(Boolean scoretype) {
		this.scoretype = scoretype;
	}

	@Column(name = "SCORE", nullable = false, precision = 22, scale = 0)
	public BigDecimal getScore() {
		return this.score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	@Column(name = "CKNOTE", length = 100)
	public String getCknote() {
		return this.cknote;
	}

	public void setCknote(String cknote) {
		this.cknote = cknote;
	}

	@Column(name = "PK_PSNBASDOC", nullable = false, length = 20)
	public String getPkPsnbasdoc() {
		return this.pkPsnbasdoc;
	}

	public void setPkPsnbasdoc(String pkPsnbasdoc) {
		this.pkPsnbasdoc = pkPsnbasdoc;
	}

}