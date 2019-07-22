package com.nts.teststruts.model;
// Generated 2015-9-5 8:16:39 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Equipck generated by hbm2java
 */
@Entity
@Table(name = "EQUIPCK", schema = "NC58")
public class Equipck implements java.io.Serializable {

	private Long pkEquipck;
	private String pkEquip;
	private String pkCkuser;
	private String pkCkdept;
	private Date ckdatetime;
	private String ckstatus;
	private String cknote;
	private String pkReckuser;
	private String reckstatus;
	private Date reckdatetime;
	private String recknote;
	private String pkReckdept;

	public Equipck() {
	}

	public Equipck(Long pkEquipck, String pkEquip) {
		this.pkEquipck = pkEquipck;
		this.pkEquip = pkEquip;
	}

	public Equipck(Long pkEquipck, String pkEquip, String pkCkuser, String pkCkdept, Date ckdatetime, String ckstatus,
			String cknote, String pkReckuser, String reckstatus, Date reckdatetime, String recknote,
			String pkReckdept) {
		this.pkEquipck = pkEquipck;
		this.pkEquip = pkEquip;
		this.pkCkuser = pkCkuser;
		this.pkCkdept = pkCkdept;
		this.ckdatetime = ckdatetime;
		this.ckstatus = ckstatus;
		this.cknote = cknote;
		this.pkReckuser = pkReckuser;
		this.reckstatus = reckstatus;
		this.reckdatetime = reckdatetime;
		this.recknote = recknote;
		this.pkReckdept = pkReckdept;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "PK_EQUIPCK", unique = true, nullable = false, length = 20)
	public Long getPkEquipck() {
		return this.pkEquipck;
	}

	public void setPkEquipck(Long pkEquipck) {
		this.pkEquipck = pkEquipck;
	}

	@Column(name = "PK_EQUIP", nullable = false, length = 20)
	public String getPkEquip() {
		return this.pkEquip;
	}

	public void setPkEquip(String pkEquip) {
		this.pkEquip = pkEquip;
	}

	@Column(name = "PK_CKUSER", length = 20)
	public String getPkCkuser() {
		return this.pkCkuser;
	}

	public void setPkCkuser(String pkCkuser) {
		this.pkCkuser = pkCkuser;
	}

	@Column(name = "PK_CKDEPT", length = 20)
	public String getPkCkdept() {
		return this.pkCkdept;
	}

	public void setPkCkdept(String pkCkdept) {
		this.pkCkdept = pkCkdept;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CKDATETIME", length = 7)
	public Date getCkdatetime() {
		return this.ckdatetime;
	}

	public void setCkdatetime(Date ckdatetime) {
		this.ckdatetime = ckdatetime;
	}

	@Column(name = "CKSTATUS", length = 100)
	public String getCkstatus() {
		return this.ckstatus;
	}

	public void setCkstatus(String ckstatus) {
		this.ckstatus = ckstatus;
	}

	@Column(name = "CKNOTE", length = 200)
	public String getCknote() {
		return this.cknote;
	}

	public void setCknote(String cknote) {
		this.cknote = cknote;
	}

	@Column(name = "PK_RECKUSER", length = 20)
	public String getPkReckuser() {
		return this.pkReckuser;
	}

	public void setPkReckuser(String pkReckuser) {
		this.pkReckuser = pkReckuser;
	}

	@Column(name = "RECKSTATUS", length = 100)
	public String getReckstatus() {
		return this.reckstatus;
	}

	public void setReckstatus(String reckstatus) {
		this.reckstatus = reckstatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RECKDATETIME", length = 7)
	public Date getReckdatetime() {
		return this.reckdatetime;
	}

	public void setReckdatetime(Date reckdatetime) {
		this.reckdatetime = reckdatetime;
	}

	@Column(name = "RECKNOTE", length = 200)
	public String getRecknote() {
		return this.recknote;
	}

	public void setRecknote(String recknote) {
		this.recknote = recknote;
	}

	@Column(name = "PK_RECKDEPT", length = 20)
	public String getPkReckdept() {
		return this.pkReckdept;
	}

	public void setPkReckdept(String pkReckdept) {
		this.pkReckdept = pkReckdept;
	}

}