package com.nts.teststruts.model;
// Generated 2015-7-24 10:07:22 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * BdMeasdoc generated by hbm2java
 */
@Entity
@Table(name = "BD_MEASDOC", schema = "NC58", uniqueConstraints = { @UniqueConstraint(columnNames = "MEASNAME"),
		@UniqueConstraint(columnNames = "SHORTNAME") })
public class BdMeasdoc implements java.io.Serializable {

	private String pkMeasdoc;
	private char basecodeflag;
	private Long dr;
	private String measname;
	private String oppdimen;
	private BigDecimal scalefactor;
	private String shortname;
	private String ts;
	private Character isint;

	public BdMeasdoc() {
	}

	public BdMeasdoc(String pkMeasdoc, char basecodeflag, String measname, String oppdimen, String shortname) {
		this.pkMeasdoc = pkMeasdoc;
		this.basecodeflag = basecodeflag;
		this.measname = measname;
		this.oppdimen = oppdimen;
		this.shortname = shortname;
	}

	public BdMeasdoc(String pkMeasdoc, char basecodeflag, Long dr, String measname, String oppdimen,
			BigDecimal scalefactor, String shortname, String ts, Character isint) {
		this.pkMeasdoc = pkMeasdoc;
		this.basecodeflag = basecodeflag;
		this.dr = dr;
		this.measname = measname;
		this.oppdimen = oppdimen;
		this.scalefactor = scalefactor;
		this.shortname = shortname;
		this.ts = ts;
		this.isint = isint;
	}

	@Id

	@Column(name = "PK_MEASDOC", unique = true, nullable = false, length = 20)
	public String getPkMeasdoc() {
		return this.pkMeasdoc;
	}

	public void setPkMeasdoc(String pkMeasdoc) {
		this.pkMeasdoc = pkMeasdoc;
	}

	@Column(name = "BASECODEFLAG", nullable = false, length = 1)
	public char getBasecodeflag() {
		return this.basecodeflag;
	}

	public void setBasecodeflag(char basecodeflag) {
		this.basecodeflag = basecodeflag;
	}

	@Column(name = "DR", precision = 10, scale = 0)
	public Long getDr() {
		return this.dr;
	}

	public void setDr(Long dr) {
		this.dr = dr;
	}

	@Column(name = "MEASNAME", unique = true, nullable = false, length = 200)
	public String getMeasname() {
		return this.measname;
	}

	public void setMeasname(String measname) {
		this.measname = measname;
	}

	@Column(name = "OPPDIMEN", nullable = false, length = 20)
	public String getOppdimen() {
		return this.oppdimen;
	}

	public void setOppdimen(String oppdimen) {
		this.oppdimen = oppdimen;
	}

	@Column(name = "SCALEFACTOR", precision = 20, scale = 8)
	public BigDecimal getScalefactor() {
		return this.scalefactor;
	}

	public void setScalefactor(BigDecimal scalefactor) {
		this.scalefactor = scalefactor;
	}

	@Column(name = "SHORTNAME", unique = true, nullable = false, length = 40)
	public String getShortname() {
		return this.shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	@Column(name = "TS", length = 19)
	public String getTs() {
		return this.ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	@Column(name = "ISINT", length = 1)
	public Character getIsint() {
		return this.isint;
	}

	public void setIsint(Character isint) {
		this.isint = isint;
	}

}