package com.nts.teststruts.model;
// Generated 2015-8-26 16:47:23 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BdPsnbasdoc generated by hbm2java
 */
@Entity
@Table(name = "BD_PSNBASDOC", schema = "NC58")
public class BdPsnbasdoc implements java.io.Serializable {

	private String pkPsnbasdoc;
	private String addr;
	private String birthdate;
	private String bp;
	private String createtime;
	private String creator;
	private Long dr;
	private String email;
	private String homephone;
	private String id;
	private String joinworkdate;
	private String mobile;
	private String modifier;
	private String modifytime;
	private String officephone;
	private String pkCorp;
	private String postalcode;
	private String psnname;
	private String sex;
	private String ssnum;
	private String ts;
	private String usedname;
	private String vdef1;
	private String vdef10;
	private String vdef11;
	private String vdef12;
	private String vdef13;
	private String vdef14;
	private String vdef15;
	private String vdef16;
	private String vdef17;
	private String vdef18;
	private String vdef19;
	private String vdef2;
	private String vdef20;
	private String vdef3;
	private String vdef4;
	private String vdef5;
	private String vdef6;
	private String vdef7;
	private String vdef8;
	private String vdef9;
	private BigDecimal approveflag;
	private String basgroupdef1;
	private String basgroupdef10;
	private String basgroupdef11;
	private String basgroupdef12;
	private String basgroupdef13;
	private String basgroupdef14;
	private String basgroupdef15;
	private String basgroupdef16;
	private String basgroupdef17;
	private String basgroupdef18;
	private String basgroupdef19;
	private String basgroupdef2;
	private String basgroupdef20;
	private String basgroupdef3;
	private String basgroupdef4;
	private String basgroupdef5;
	private String basgroupdef6;
	private String basgroupdef7;
	private String basgroupdef8;
	private String basgroupdef9;
	private String bloodtype;
	private String characterrpr;
	private String city;
	private String computerlevel;
	private String country;
	private String dataoperator;
	private String deaddate;
	private String deadmemo;
	private String employform;
	private String fileCode;
	private String fileaddress;
	private String froeignlang;
	private String frolanlevel;
	private String functiontype;
	private String health;
	private String hroperator;
	private Character indocflag;
	private String interest;
	private String joinpolitydate;
	private String joinsysdate;
	private String marital;
	private String marriagedate;
	private String nationality;
	private String nativeplace;
	private String penelauth;
	private String permanreside;
	private Blob photo;
	private String pkFileorg;
	private String polity;
	private String province;
	private String skilllevel;
	private String titletechpost;

	public BdPsnbasdoc() {
	}

	public BdPsnbasdoc(String pkPsnbasdoc, String pkCorp, String psnname) {
		this.pkPsnbasdoc = pkPsnbasdoc;
		this.pkCorp = pkCorp;
		this.psnname = psnname;
	}

	public BdPsnbasdoc(String pkPsnbasdoc, String addr, String birthdate, String bp, String createtime, String creator,
			Long dr, String email, String homephone, String id, String joinworkdate, String mobile, String modifier,
			String modifytime, String officephone, String pkCorp, String postalcode, String psnname, String sex,
			String ssnum, String ts, String usedname, String vdef1, String vdef10, String vdef11, String vdef12,
			String vdef13, String vdef14, String vdef15, String vdef16, String vdef17, String vdef18, String vdef19,
			String vdef2, String vdef20, String vdef3, String vdef4, String vdef5, String vdef6, String vdef7,
			String vdef8, String vdef9, BigDecimal approveflag, String basgroupdef1, String basgroupdef10,
			String basgroupdef11, String basgroupdef12, String basgroupdef13, String basgroupdef14,
			String basgroupdef15, String basgroupdef16, String basgroupdef17, String basgroupdef18,
			String basgroupdef19, String basgroupdef2, String basgroupdef20, String basgroupdef3, String basgroupdef4,
			String basgroupdef5, String basgroupdef6, String basgroupdef7, String basgroupdef8, String basgroupdef9,
			String bloodtype, String characterrpr, String city, String computerlevel, String country,
			String dataoperator, String deaddate, String deadmemo, String employform, String fileCode,
			String fileaddress, String froeignlang, String frolanlevel, String functiontype, String health,
			String hroperator, Character indocflag, String interest, String joinpolitydate, String joinsysdate,
			String marital, String marriagedate, String nationality, String nativeplace, String penelauth,
			String permanreside, Blob photo, String pkFileorg, String polity, String province, String skilllevel,
			String titletechpost) {
		this.pkPsnbasdoc = pkPsnbasdoc;
		this.addr = addr;
		this.birthdate = birthdate;
		this.bp = bp;
		this.createtime = createtime;
		this.creator = creator;
		this.dr = dr;
		this.email = email;
		this.homephone = homephone;
		this.id = id;
		this.joinworkdate = joinworkdate;
		this.mobile = mobile;
		this.modifier = modifier;
		this.modifytime = modifytime;
		this.officephone = officephone;
		this.pkCorp = pkCorp;
		this.postalcode = postalcode;
		this.psnname = psnname;
		this.sex = sex;
		this.ssnum = ssnum;
		this.ts = ts;
		this.usedname = usedname;
		this.vdef1 = vdef1;
		this.vdef10 = vdef10;
		this.vdef11 = vdef11;
		this.vdef12 = vdef12;
		this.vdef13 = vdef13;
		this.vdef14 = vdef14;
		this.vdef15 = vdef15;
		this.vdef16 = vdef16;
		this.vdef17 = vdef17;
		this.vdef18 = vdef18;
		this.vdef19 = vdef19;
		this.vdef2 = vdef2;
		this.vdef20 = vdef20;
		this.vdef3 = vdef3;
		this.vdef4 = vdef4;
		this.vdef5 = vdef5;
		this.vdef6 = vdef6;
		this.vdef7 = vdef7;
		this.vdef8 = vdef8;
		this.vdef9 = vdef9;
		this.approveflag = approveflag;
		this.basgroupdef1 = basgroupdef1;
		this.basgroupdef10 = basgroupdef10;
		this.basgroupdef11 = basgroupdef11;
		this.basgroupdef12 = basgroupdef12;
		this.basgroupdef13 = basgroupdef13;
		this.basgroupdef14 = basgroupdef14;
		this.basgroupdef15 = basgroupdef15;
		this.basgroupdef16 = basgroupdef16;
		this.basgroupdef17 = basgroupdef17;
		this.basgroupdef18 = basgroupdef18;
		this.basgroupdef19 = basgroupdef19;
		this.basgroupdef2 = basgroupdef2;
		this.basgroupdef20 = basgroupdef20;
		this.basgroupdef3 = basgroupdef3;
		this.basgroupdef4 = basgroupdef4;
		this.basgroupdef5 = basgroupdef5;
		this.basgroupdef6 = basgroupdef6;
		this.basgroupdef7 = basgroupdef7;
		this.basgroupdef8 = basgroupdef8;
		this.basgroupdef9 = basgroupdef9;
		this.bloodtype = bloodtype;
		this.characterrpr = characterrpr;
		this.city = city;
		this.computerlevel = computerlevel;
		this.country = country;
		this.dataoperator = dataoperator;
		this.deaddate = deaddate;
		this.deadmemo = deadmemo;
		this.employform = employform;
		this.fileCode = fileCode;
		this.fileaddress = fileaddress;
		this.froeignlang = froeignlang;
		this.frolanlevel = frolanlevel;
		this.functiontype = functiontype;
		this.health = health;
		this.hroperator = hroperator;
		this.indocflag = indocflag;
		this.interest = interest;
		this.joinpolitydate = joinpolitydate;
		this.joinsysdate = joinsysdate;
		this.marital = marital;
		this.marriagedate = marriagedate;
		this.nationality = nationality;
		this.nativeplace = nativeplace;
		this.penelauth = penelauth;
		this.permanreside = permanreside;
		this.photo = photo;
		this.pkFileorg = pkFileorg;
		this.polity = polity;
		this.province = province;
		this.skilllevel = skilllevel;
		this.titletechpost = titletechpost;
	}

	@Id

	@Column(name = "PK_PSNBASDOC", unique = true, nullable = false, length = 20)
	public String getPkPsnbasdoc() {
		return this.pkPsnbasdoc;
	}

	public void setPkPsnbasdoc(String pkPsnbasdoc) {
		this.pkPsnbasdoc = pkPsnbasdoc;
	}

	@Column(name = "ADDR", length = 120)
	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Column(name = "BIRTHDATE", length = 10)
	public String getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	@Column(name = "BP", length = 30)
	public String getBp() {
		return this.bp;
	}

	public void setBp(String bp) {
		this.bp = bp;
	}

	@Column(name = "CREATETIME", length = 19)
	public String getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATOR", length = 20)
	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Column(name = "DR", precision = 10, scale = 0)
	public Long getDr() {
		return this.dr;
	}

	public void setDr(Long dr) {
		this.dr = dr;
	}

	@Column(name = "EMAIL", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "HOMEPHONE", length = 30)
	public String getHomephone() {
		return this.homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	@Column(name = "ID", length = 25)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "JOINWORKDATE", length = 10)
	public String getJoinworkdate() {
		return this.joinworkdate;
	}

	public void setJoinworkdate(String joinworkdate) {
		this.joinworkdate = joinworkdate;
	}

	@Column(name = "MOBILE", length = 30)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "MODIFIER", length = 20)
	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	@Column(name = "MODIFYTIME", length = 19)
	public String getModifytime() {
		return this.modifytime;
	}

	public void setModifytime(String modifytime) {
		this.modifytime = modifytime;
	}

	@Column(name = "OFFICEPHONE", length = 30)
	public String getOfficephone() {
		return this.officephone;
	}

	public void setOfficephone(String officephone) {
		this.officephone = officephone;
	}

	@Column(name = "PK_CORP", nullable = false, length = 4)
	public String getPkCorp() {
		return this.pkCorp;
	}

	public void setPkCorp(String pkCorp) {
		this.pkCorp = pkCorp;
	}

	@Column(name = "POSTALCODE", length = 6)
	public String getPostalcode() {
		return this.postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	@Column(name = "PSNNAME", nullable = false, length = 200)
	public String getPsnname() {
		return this.psnname;
	}

	public void setPsnname(String psnname) {
		this.psnname = psnname;
	}

	@Column(name = "SEX", length = 20)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "SSNUM", length = 25)
	public String getSsnum() {
		return this.ssnum;
	}

	public void setSsnum(String ssnum) {
		this.ssnum = ssnum;
	}

	@Column(name = "TS", length = 19)
	public String getTs() {
		return this.ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	@Column(name = "USEDNAME", length = 200)
	public String getUsedname() {
		return this.usedname;
	}

	public void setUsedname(String usedname) {
		this.usedname = usedname;
	}

	@Column(name = "VDEF1", length = 100)
	public String getVdef1() {
		return this.vdef1;
	}

	public void setVdef1(String vdef1) {
		this.vdef1 = vdef1;
	}

	@Column(name = "VDEF10", length = 100)
	public String getVdef10() {
		return this.vdef10;
	}

	public void setVdef10(String vdef10) {
		this.vdef10 = vdef10;
	}

	@Column(name = "VDEF11", length = 100)
	public String getVdef11() {
		return this.vdef11;
	}

	public void setVdef11(String vdef11) {
		this.vdef11 = vdef11;
	}

	@Column(name = "VDEF12", length = 100)
	public String getVdef12() {
		return this.vdef12;
	}

	public void setVdef12(String vdef12) {
		this.vdef12 = vdef12;
	}

	@Column(name = "VDEF13", length = 100)
	public String getVdef13() {
		return this.vdef13;
	}

	public void setVdef13(String vdef13) {
		this.vdef13 = vdef13;
	}

	@Column(name = "VDEF14", length = 100)
	public String getVdef14() {
		return this.vdef14;
	}

	public void setVdef14(String vdef14) {
		this.vdef14 = vdef14;
	}

	@Column(name = "VDEF15", length = 100)
	public String getVdef15() {
		return this.vdef15;
	}

	public void setVdef15(String vdef15) {
		this.vdef15 = vdef15;
	}

	@Column(name = "VDEF16", length = 100)
	public String getVdef16() {
		return this.vdef16;
	}

	public void setVdef16(String vdef16) {
		this.vdef16 = vdef16;
	}

	@Column(name = "VDEF17", length = 100)
	public String getVdef17() {
		return this.vdef17;
	}

	public void setVdef17(String vdef17) {
		this.vdef17 = vdef17;
	}

	@Column(name = "VDEF18", length = 100)
	public String getVdef18() {
		return this.vdef18;
	}

	public void setVdef18(String vdef18) {
		this.vdef18 = vdef18;
	}

	@Column(name = "VDEF19", length = 100)
	public String getVdef19() {
		return this.vdef19;
	}

	public void setVdef19(String vdef19) {
		this.vdef19 = vdef19;
	}

	@Column(name = "VDEF2", length = 100)
	public String getVdef2() {
		return this.vdef2;
	}

	public void setVdef2(String vdef2) {
		this.vdef2 = vdef2;
	}

	@Column(name = "VDEF20", length = 100)
	public String getVdef20() {
		return this.vdef20;
	}

	public void setVdef20(String vdef20) {
		this.vdef20 = vdef20;
	}

	@Column(name = "VDEF3", length = 100)
	public String getVdef3() {
		return this.vdef3;
	}

	public void setVdef3(String vdef3) {
		this.vdef3 = vdef3;
	}

	@Column(name = "VDEF4", length = 100)
	public String getVdef4() {
		return this.vdef4;
	}

	public void setVdef4(String vdef4) {
		this.vdef4 = vdef4;
	}

	@Column(name = "VDEF5", length = 100)
	public String getVdef5() {
		return this.vdef5;
	}

	public void setVdef5(String vdef5) {
		this.vdef5 = vdef5;
	}

	@Column(name = "VDEF6", length = 100)
	public String getVdef6() {
		return this.vdef6;
	}

	public void setVdef6(String vdef6) {
		this.vdef6 = vdef6;
	}

	@Column(name = "VDEF7", length = 100)
	public String getVdef7() {
		return this.vdef7;
	}

	public void setVdef7(String vdef7) {
		this.vdef7 = vdef7;
	}

	@Column(name = "VDEF8", length = 100)
	public String getVdef8() {
		return this.vdef8;
	}

	public void setVdef8(String vdef8) {
		this.vdef8 = vdef8;
	}

	@Column(name = "VDEF9", length = 100)
	public String getVdef9() {
		return this.vdef9;
	}

	public void setVdef9(String vdef9) {
		this.vdef9 = vdef9;
	}

	@Column(name = "APPROVEFLAG", precision = 38, scale = 0)
	public BigDecimal getApproveflag() {
		return this.approveflag;
	}

	public void setApproveflag(BigDecimal approveflag) {
		this.approveflag = approveflag;
	}

	@Column(name = "BASGROUPDEF1", length = 128)
	public String getBasgroupdef1() {
		return this.basgroupdef1;
	}

	public void setBasgroupdef1(String basgroupdef1) {
		this.basgroupdef1 = basgroupdef1;
	}

	@Column(name = "BASGROUPDEF10", length = 128)
	public String getBasgroupdef10() {
		return this.basgroupdef10;
	}

	public void setBasgroupdef10(String basgroupdef10) {
		this.basgroupdef10 = basgroupdef10;
	}

	@Column(name = "BASGROUPDEF11", length = 128)
	public String getBasgroupdef11() {
		return this.basgroupdef11;
	}

	public void setBasgroupdef11(String basgroupdef11) {
		this.basgroupdef11 = basgroupdef11;
	}

	@Column(name = "BASGROUPDEF12", length = 128)
	public String getBasgroupdef12() {
		return this.basgroupdef12;
	}

	public void setBasgroupdef12(String basgroupdef12) {
		this.basgroupdef12 = basgroupdef12;
	}

	@Column(name = "BASGROUPDEF13", length = 128)
	public String getBasgroupdef13() {
		return this.basgroupdef13;
	}

	public void setBasgroupdef13(String basgroupdef13) {
		this.basgroupdef13 = basgroupdef13;
	}

	@Column(name = "BASGROUPDEF14", length = 128)
	public String getBasgroupdef14() {
		return this.basgroupdef14;
	}

	public void setBasgroupdef14(String basgroupdef14) {
		this.basgroupdef14 = basgroupdef14;
	}

	@Column(name = "BASGROUPDEF15", length = 128)
	public String getBasgroupdef15() {
		return this.basgroupdef15;
	}

	public void setBasgroupdef15(String basgroupdef15) {
		this.basgroupdef15 = basgroupdef15;
	}

	@Column(name = "BASGROUPDEF16", length = 128)
	public String getBasgroupdef16() {
		return this.basgroupdef16;
	}

	public void setBasgroupdef16(String basgroupdef16) {
		this.basgroupdef16 = basgroupdef16;
	}

	@Column(name = "BASGROUPDEF17", length = 128)
	public String getBasgroupdef17() {
		return this.basgroupdef17;
	}

	public void setBasgroupdef17(String basgroupdef17) {
		this.basgroupdef17 = basgroupdef17;
	}

	@Column(name = "BASGROUPDEF18", length = 128)
	public String getBasgroupdef18() {
		return this.basgroupdef18;
	}

	public void setBasgroupdef18(String basgroupdef18) {
		this.basgroupdef18 = basgroupdef18;
	}

	@Column(name = "BASGROUPDEF19", length = 128)
	public String getBasgroupdef19() {
		return this.basgroupdef19;
	}

	public void setBasgroupdef19(String basgroupdef19) {
		this.basgroupdef19 = basgroupdef19;
	}

	@Column(name = "BASGROUPDEF2", length = 128)
	public String getBasgroupdef2() {
		return this.basgroupdef2;
	}

	public void setBasgroupdef2(String basgroupdef2) {
		this.basgroupdef2 = basgroupdef2;
	}

	@Column(name = "BASGROUPDEF20", length = 128)
	public String getBasgroupdef20() {
		return this.basgroupdef20;
	}

	public void setBasgroupdef20(String basgroupdef20) {
		this.basgroupdef20 = basgroupdef20;
	}

	@Column(name = "BASGROUPDEF3", length = 128)
	public String getBasgroupdef3() {
		return this.basgroupdef3;
	}

	public void setBasgroupdef3(String basgroupdef3) {
		this.basgroupdef3 = basgroupdef3;
	}

	@Column(name = "BASGROUPDEF4", length = 128)
	public String getBasgroupdef4() {
		return this.basgroupdef4;
	}

	public void setBasgroupdef4(String basgroupdef4) {
		this.basgroupdef4 = basgroupdef4;
	}

	@Column(name = "BASGROUPDEF5", length = 128)
	public String getBasgroupdef5() {
		return this.basgroupdef5;
	}

	public void setBasgroupdef5(String basgroupdef5) {
		this.basgroupdef5 = basgroupdef5;
	}

	@Column(name = "BASGROUPDEF6", length = 128)
	public String getBasgroupdef6() {
		return this.basgroupdef6;
	}

	public void setBasgroupdef6(String basgroupdef6) {
		this.basgroupdef6 = basgroupdef6;
	}

	@Column(name = "BASGROUPDEF7", length = 128)
	public String getBasgroupdef7() {
		return this.basgroupdef7;
	}

	public void setBasgroupdef7(String basgroupdef7) {
		this.basgroupdef7 = basgroupdef7;
	}

	@Column(name = "BASGROUPDEF8", length = 128)
	public String getBasgroupdef8() {
		return this.basgroupdef8;
	}

	public void setBasgroupdef8(String basgroupdef8) {
		this.basgroupdef8 = basgroupdef8;
	}

	@Column(name = "BASGROUPDEF9", length = 128)
	public String getBasgroupdef9() {
		return this.basgroupdef9;
	}

	public void setBasgroupdef9(String basgroupdef9) {
		this.basgroupdef9 = basgroupdef9;
	}

	@Column(name = "BLOODTYPE", length = 20)
	public String getBloodtype() {
		return this.bloodtype;
	}

	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}

	@Column(name = "CHARACTERRPR", length = 20)
	public String getCharacterrpr() {
		return this.characterrpr;
	}

	public void setCharacterrpr(String characterrpr) {
		this.characterrpr = characterrpr;
	}

	@Column(name = "CITY", length = 60)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "COMPUTERLEVEL", length = 60)
	public String getComputerlevel() {
		return this.computerlevel;
	}

	public void setComputerlevel(String computerlevel) {
		this.computerlevel = computerlevel;
	}

	@Column(name = "COUNTRY", length = 20)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "DATAOPERATOR", length = 20)
	public String getDataoperator() {
		return this.dataoperator;
	}

	public void setDataoperator(String dataoperator) {
		this.dataoperator = dataoperator;
	}

	@Column(name = "DEADDATE", length = 10)
	public String getDeaddate() {
		return this.deaddate;
	}

	public void setDeaddate(String deaddate) {
		this.deaddate = deaddate;
	}

	@Column(name = "DEADMEMO", length = 500)
	public String getDeadmemo() {
		return this.deadmemo;
	}

	public void setDeadmemo(String deadmemo) {
		this.deadmemo = deadmemo;
	}

	@Column(name = "EMPLOYFORM", length = 50)
	public String getEmployform() {
		return this.employform;
	}

	public void setEmployform(String employform) {
		this.employform = employform;
	}

	@Column(name = "FILE_CODE", length = 20)
	public String getFileCode() {
		return this.fileCode;
	}

	public void setFileCode(String fileCode) {
		this.fileCode = fileCode;
	}

	@Column(name = "FILEADDRESS", length = 128)
	public String getFileaddress() {
		return this.fileaddress;
	}

	public void setFileaddress(String fileaddress) {
		this.fileaddress = fileaddress;
	}

	@Column(name = "FROEIGNLANG", length = 60)
	public String getFroeignlang() {
		return this.froeignlang;
	}

	public void setFroeignlang(String froeignlang) {
		this.froeignlang = froeignlang;
	}

	@Column(name = "FROLANLEVEL", length = 60)
	public String getFrolanlevel() {
		return this.frolanlevel;
	}

	public void setFrolanlevel(String frolanlevel) {
		this.frolanlevel = frolanlevel;
	}

	@Column(name = "FUNCTIONTYPE", length = 20)
	public String getFunctiontype() {
		return this.functiontype;
	}

	public void setFunctiontype(String functiontype) {
		this.functiontype = functiontype;
	}

	@Column(name = "HEALTH", length = 20)
	public String getHealth() {
		return this.health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	@Column(name = "HROPERATOR", length = 20)
	public String getHroperator() {
		return this.hroperator;
	}

	public void setHroperator(String hroperator) {
		this.hroperator = hroperator;
	}

	@Column(name = "INDOCFLAG", length = 1)
	public Character getIndocflag() {
		return this.indocflag;
	}

	public void setIndocflag(Character indocflag) {
		this.indocflag = indocflag;
	}

	@Column(name = "INTEREST", length = 128)
	public String getInterest() {
		return this.interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	@Column(name = "JOINPOLITYDATE", length = 10)
	public String getJoinpolitydate() {
		return this.joinpolitydate;
	}

	public void setJoinpolitydate(String joinpolitydate) {
		this.joinpolitydate = joinpolitydate;
	}

	@Column(name = "JOINSYSDATE", length = 10)
	public String getJoinsysdate() {
		return this.joinsysdate;
	}

	public void setJoinsysdate(String joinsysdate) {
		this.joinsysdate = joinsysdate;
	}

	@Column(name = "MARITAL", length = 20)
	public String getMarital() {
		return this.marital;
	}

	public void setMarital(String marital) {
		this.marital = marital;
	}

	@Column(name = "MARRIAGEDATE", length = 10)
	public String getMarriagedate() {
		return this.marriagedate;
	}

	public void setMarriagedate(String marriagedate) {
		this.marriagedate = marriagedate;
	}

	@Column(name = "NATIONALITY", length = 20)
	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Column(name = "NATIVEPLACE", length = 20)
	public String getNativeplace() {
		return this.nativeplace;
	}

	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}

	@Column(name = "PENELAUTH", length = 20)
	public String getPenelauth() {
		return this.penelauth;
	}

	public void setPenelauth(String penelauth) {
		this.penelauth = penelauth;
	}

	@Column(name = "PERMANRESIDE", length = 20)
	public String getPermanreside() {
		return this.permanreside;
	}

	public void setPermanreside(String permanreside) {
		this.permanreside = permanreside;
	}

	@Column(name = "PHOTO")
	public Blob getPhoto() {
		return this.photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	@Column(name = "PK_FILEORG", length = 20)
	public String getPkFileorg() {
		return this.pkFileorg;
	}

	public void setPkFileorg(String pkFileorg) {
		this.pkFileorg = pkFileorg;
	}

	@Column(name = "POLITY", length = 20)
	public String getPolity() {
		return this.polity;
	}

	public void setPolity(String polity) {
		this.polity = polity;
	}

	@Column(name = "PROVINCE", length = 60)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "SKILLLEVEL", length = 20)
	public String getSkilllevel() {
		return this.skilllevel;
	}

	public void setSkilllevel(String skilllevel) {
		this.skilllevel = skilllevel;
	}

	@Column(name = "TITLETECHPOST", length = 20)
	public String getTitletechpost() {
		return this.titletechpost;
	}

	public void setTitletechpost(String titletechpost) {
		this.titletechpost = titletechpost;
	}

}
