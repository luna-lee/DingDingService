package com.nts.teststruts.model;
// Generated 2015-8-26 16:47:23 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BdPsndoc generated by hbm2java
 */
@Entity
@Table(name = "BD_PSNDOC", schema = "NC58")
public class BdPsndoc implements java.io.Serializable {

	private String pkPsndoc;
	private String amcode;
	private String clerkcode;
	private Character clerkflag;
	private String createtime;
	private String creator;
	private String def1;
	private String def10;
	private String def11;
	private String def12;
	private String def13;
	private String def14;
	private String def15;
	private String def16;
	private String def17;
	private String def18;
	private String def19;
	private String def2;
	private String def20;
	private String def3;
	private String def4;
	private String def5;
	private String def6;
	private String def7;
	private String def8;
	private String def9;
	private Long dr;
	private Character indocflag;
	private String indutydate;
	private String innercode;
	private String jobrank;
	private String jobseries;
	private String maxinnercode;
	private String modifier;
	private String modifytime;
	private String outdutydate;
	private String pkCorp;
	private String pkDeptdoc;
	private String pkOmJob;
	private String pkPsnbasdoc;
	private String pkPsncl;
	private BigDecimal psnclscope;
	private String psncode;
	private String psnname;
	private String sealdate;
	private String ts;
	private String directleader;
	private String dutyname;
	private String groupdef1;
	private String groupdef10;
	private String groupdef11;
	private String groupdef12;
	private String groupdef13;
	private String groupdef14;
	private String groupdef15;
	private String groupdef16;
	private String groupdef17;
	private String groupdef18;
	private String groupdef19;
	private String groupdef2;
	private String groupdef20;
	private String groupdef3;
	private String groupdef4;
	private String groupdef5;
	private String groupdef6;
	private String groupdef7;
	private String groupdef8;
	private String groupdef9;
	private String hroperator;
	private String insource;
	private Character iscalovertime;
	private Character isreferenced;
	private Character isreturn;
	private String onpostdate;
	private String outmethod;
	private String pkClerkclass;
	private String pkDutyrank;
	private String pkPsntype;
	private Character poststat;
	private String psnnamepinyin;
	private String recruitresource;
	private Character regular;
	private String regulardata;
	private String series;
	private BigDecimal showorder;
	private BigDecimal tbmProp;
	private String timecardid;
	private String wastopdate;

	public BdPsndoc() {
	}

	public BdPsndoc(String pkPsndoc, String pkPsnbasdoc, String pkPsncl) {
		this.pkPsndoc = pkPsndoc;
		this.pkPsnbasdoc = pkPsnbasdoc;
		this.pkPsncl = pkPsncl;
	}

	public BdPsndoc(String pkPsndoc, String amcode, String clerkcode, Character clerkflag, String createtime,
			String creator, String def1, String def10, String def11, String def12, String def13, String def14,
			String def15, String def16, String def17, String def18, String def19, String def2, String def20,
			String def3, String def4, String def5, String def6, String def7, String def8, String def9, Long dr,
			Character indocflag, String indutydate, String innercode, String jobrank, String jobseries,
			String maxinnercode, String modifier, String modifytime, String outdutydate, String pkCorp,
			String pkDeptdoc, String pkOmJob, String pkPsnbasdoc, String pkPsncl, BigDecimal psnclscope, String psncode,
			String psnname, String sealdate, String ts, String directleader, String dutyname, String groupdef1,
			String groupdef10, String groupdef11, String groupdef12, String groupdef13, String groupdef14,
			String groupdef15, String groupdef16, String groupdef17, String groupdef18, String groupdef19,
			String groupdef2, String groupdef20, String groupdef3, String groupdef4, String groupdef5, String groupdef6,
			String groupdef7, String groupdef8, String groupdef9, String hroperator, String insource,
			Character iscalovertime, Character isreferenced, Character isreturn, String onpostdate, String outmethod,
			String pkClerkclass, String pkDutyrank, String pkPsntype, Character poststat, String psnnamepinyin,
			String recruitresource, Character regular, String regulardata, String series, BigDecimal showorder,
			BigDecimal tbmProp, String timecardid, String wastopdate) {
		this.pkPsndoc = pkPsndoc;
		this.amcode = amcode;
		this.clerkcode = clerkcode;
		this.clerkflag = clerkflag;
		this.createtime = createtime;
		this.creator = creator;
		this.def1 = def1;
		this.def10 = def10;
		this.def11 = def11;
		this.def12 = def12;
		this.def13 = def13;
		this.def14 = def14;
		this.def15 = def15;
		this.def16 = def16;
		this.def17 = def17;
		this.def18 = def18;
		this.def19 = def19;
		this.def2 = def2;
		this.def20 = def20;
		this.def3 = def3;
		this.def4 = def4;
		this.def5 = def5;
		this.def6 = def6;
		this.def7 = def7;
		this.def8 = def8;
		this.def9 = def9;
		this.dr = dr;
		this.indocflag = indocflag;
		this.indutydate = indutydate;
		this.innercode = innercode;
		this.jobrank = jobrank;
		this.jobseries = jobseries;
		this.maxinnercode = maxinnercode;
		this.modifier = modifier;
		this.modifytime = modifytime;
		this.outdutydate = outdutydate;
		this.pkCorp = pkCorp;
		this.pkDeptdoc = pkDeptdoc;
		this.pkOmJob = pkOmJob;
		this.pkPsnbasdoc = pkPsnbasdoc;
		this.pkPsncl = pkPsncl;
		this.psnclscope = psnclscope;
		this.psncode = psncode;
		this.psnname = psnname;
		this.sealdate = sealdate;
		this.ts = ts;
		this.directleader = directleader;
		this.dutyname = dutyname;
		this.groupdef1 = groupdef1;
		this.groupdef10 = groupdef10;
		this.groupdef11 = groupdef11;
		this.groupdef12 = groupdef12;
		this.groupdef13 = groupdef13;
		this.groupdef14 = groupdef14;
		this.groupdef15 = groupdef15;
		this.groupdef16 = groupdef16;
		this.groupdef17 = groupdef17;
		this.groupdef18 = groupdef18;
		this.groupdef19 = groupdef19;
		this.groupdef2 = groupdef2;
		this.groupdef20 = groupdef20;
		this.groupdef3 = groupdef3;
		this.groupdef4 = groupdef4;
		this.groupdef5 = groupdef5;
		this.groupdef6 = groupdef6;
		this.groupdef7 = groupdef7;
		this.groupdef8 = groupdef8;
		this.groupdef9 = groupdef9;
		this.hroperator = hroperator;
		this.insource = insource;
		this.iscalovertime = iscalovertime;
		this.isreferenced = isreferenced;
		this.isreturn = isreturn;
		this.onpostdate = onpostdate;
		this.outmethod = outmethod;
		this.pkClerkclass = pkClerkclass;
		this.pkDutyrank = pkDutyrank;
		this.pkPsntype = pkPsntype;
		this.poststat = poststat;
		this.psnnamepinyin = psnnamepinyin;
		this.recruitresource = recruitresource;
		this.regular = regular;
		this.regulardata = regulardata;
		this.series = series;
		this.showorder = showorder;
		this.tbmProp = tbmProp;
		this.timecardid = timecardid;
		this.wastopdate = wastopdate;
	}

	@Id

	@Column(name = "PK_PSNDOC", unique = true, nullable = false, length = 20)
	public String getPkPsndoc() {
		return this.pkPsndoc;
	}

	public void setPkPsndoc(String pkPsndoc) {
		this.pkPsndoc = pkPsndoc;
	}

	@Column(name = "AMCODE", length = 50)
	public String getAmcode() {
		return this.amcode;
	}

	public void setAmcode(String amcode) {
		this.amcode = amcode;
	}

	@Column(name = "CLERKCODE", length = 25)
	public String getClerkcode() {
		return this.clerkcode;
	}

	public void setClerkcode(String clerkcode) {
		this.clerkcode = clerkcode;
	}

	@Column(name = "CLERKFLAG", length = 1)
	public Character getClerkflag() {
		return this.clerkflag;
	}

	public void setClerkflag(Character clerkflag) {
		this.clerkflag = clerkflag;
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

	@Column(name = "DEF1", length = 100)
	public String getDef1() {
		return this.def1;
	}

	public void setDef1(String def1) {
		this.def1 = def1;
	}

	@Column(name = "DEF10", length = 100)
	public String getDef10() {
		return this.def10;
	}

	public void setDef10(String def10) {
		this.def10 = def10;
	}

	@Column(name = "DEF11", length = 100)
	public String getDef11() {
		return this.def11;
	}

	public void setDef11(String def11) {
		this.def11 = def11;
	}

	@Column(name = "DEF12", length = 100)
	public String getDef12() {
		return this.def12;
	}

	public void setDef12(String def12) {
		this.def12 = def12;
	}

	@Column(name = "DEF13", length = 100)
	public String getDef13() {
		return this.def13;
	}

	public void setDef13(String def13) {
		this.def13 = def13;
	}

	@Column(name = "DEF14", length = 100)
	public String getDef14() {
		return this.def14;
	}

	public void setDef14(String def14) {
		this.def14 = def14;
	}

	@Column(name = "DEF15", length = 100)
	public String getDef15() {
		return this.def15;
	}

	public void setDef15(String def15) {
		this.def15 = def15;
	}

	@Column(name = "DEF16", length = 100)
	public String getDef16() {
		return this.def16;
	}

	public void setDef16(String def16) {
		this.def16 = def16;
	}

	@Column(name = "DEF17", length = 100)
	public String getDef17() {
		return this.def17;
	}

	public void setDef17(String def17) {
		this.def17 = def17;
	}

	@Column(name = "DEF18", length = 100)
	public String getDef18() {
		return this.def18;
	}

	public void setDef18(String def18) {
		this.def18 = def18;
	}

	@Column(name = "DEF19", length = 100)
	public String getDef19() {
		return this.def19;
	}

	public void setDef19(String def19) {
		this.def19 = def19;
	}

	@Column(name = "DEF2", length = 100)
	public String getDef2() {
		return this.def2;
	}

	public void setDef2(String def2) {
		this.def2 = def2;
	}

	@Column(name = "DEF20", length = 100)
	public String getDef20() {
		return this.def20;
	}

	public void setDef20(String def20) {
		this.def20 = def20;
	}

	@Column(name = "DEF3", length = 100)
	public String getDef3() {
		return this.def3;
	}

	public void setDef3(String def3) {
		this.def3 = def3;
	}

	@Column(name = "DEF4", length = 100)
	public String getDef4() {
		return this.def4;
	}

	public void setDef4(String def4) {
		this.def4 = def4;
	}

	@Column(name = "DEF5", length = 100)
	public String getDef5() {
		return this.def5;
	}

	public void setDef5(String def5) {
		this.def5 = def5;
	}

	@Column(name = "DEF6", length = 100)
	public String getDef6() {
		return this.def6;
	}

	public void setDef6(String def6) {
		this.def6 = def6;
	}

	@Column(name = "DEF7", length = 100)
	public String getDef7() {
		return this.def7;
	}

	public void setDef7(String def7) {
		this.def7 = def7;
	}

	@Column(name = "DEF8", length = 100)
	public String getDef8() {
		return this.def8;
	}

	public void setDef8(String def8) {
		this.def8 = def8;
	}

	@Column(name = "DEF9", length = 100)
	public String getDef9() {
		return this.def9;
	}

	public void setDef9(String def9) {
		this.def9 = def9;
	}

	@Column(name = "DR", precision = 10, scale = 0)
	public Long getDr() {
		return this.dr;
	}

	public void setDr(Long dr) {
		this.dr = dr;
	}

	@Column(name = "INDOCFLAG", length = 1)
	public Character getIndocflag() {
		return this.indocflag;
	}

	public void setIndocflag(Character indocflag) {
		this.indocflag = indocflag;
	}

	@Column(name = "INDUTYDATE", length = 10)
	public String getIndutydate() {
		return this.indutydate;
	}

	public void setIndutydate(String indutydate) {
		this.indutydate = indutydate;
	}

	@Column(name = "INNERCODE", length = 60)
	public String getInnercode() {
		return this.innercode;
	}

	public void setInnercode(String innercode) {
		this.innercode = innercode;
	}

	@Column(name = "JOBRANK", length = 20)
	public String getJobrank() {
		return this.jobrank;
	}

	public void setJobrank(String jobrank) {
		this.jobrank = jobrank;
	}

	@Column(name = "JOBSERIES", length = 20)
	public String getJobseries() {
		return this.jobseries;
	}

	public void setJobseries(String jobseries) {
		this.jobseries = jobseries;
	}

	@Column(name = "MAXINNERCODE", length = 60)
	public String getMaxinnercode() {
		return this.maxinnercode;
	}

	public void setMaxinnercode(String maxinnercode) {
		this.maxinnercode = maxinnercode;
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

	@Column(name = "OUTDUTYDATE", length = 10)
	public String getOutdutydate() {
		return this.outdutydate;
	}

	public void setOutdutydate(String outdutydate) {
		this.outdutydate = outdutydate;
	}

	@Column(name = "PK_CORP", length = 4)
	public String getPkCorp() {
		return this.pkCorp;
	}

	public void setPkCorp(String pkCorp) {
		this.pkCorp = pkCorp;
	}

	@Column(name = "PK_DEPTDOC", length = 20)
	public String getPkDeptdoc() {
		return this.pkDeptdoc;
	}

	public void setPkDeptdoc(String pkDeptdoc) {
		this.pkDeptdoc = pkDeptdoc;
	}

	@Column(name = "PK_OM_JOB", length = 20)
	public String getPkOmJob() {
		return this.pkOmJob;
	}

	public void setPkOmJob(String pkOmJob) {
		this.pkOmJob = pkOmJob;
	}

	@Column(name = "PK_PSNBASDOC", nullable = false, length = 20)
	public String getPkPsnbasdoc() {
		return this.pkPsnbasdoc;
	}

	public void setPkPsnbasdoc(String pkPsnbasdoc) {
		this.pkPsnbasdoc = pkPsnbasdoc;
	}

	@Column(name = "PK_PSNCL", nullable = false, length = 20)
	public String getPkPsncl() {
		return this.pkPsncl;
	}

	public void setPkPsncl(String pkPsncl) {
		this.pkPsncl = pkPsncl;
	}

	@Column(name = "PSNCLSCOPE", precision = 38, scale = 0)
	public BigDecimal getPsnclscope() {
		return this.psnclscope;
	}

	public void setPsnclscope(BigDecimal psnclscope) {
		this.psnclscope = psnclscope;
	}

	@Column(name = "PSNCODE", length = 40)
	public String getPsncode() {
		return this.psncode;
	}

	public void setPsncode(String psncode) {
		this.psncode = psncode;
	}

	@Column(name = "PSNNAME", length = 200)
	public String getPsnname() {
		return this.psnname;
	}

	public void setPsnname(String psnname) {
		this.psnname = psnname;
	}

	@Column(name = "SEALDATE", length = 10)
	public String getSealdate() {
		return this.sealdate;
	}

	public void setSealdate(String sealdate) {
		this.sealdate = sealdate;
	}

	@Column(name = "TS", length = 19)
	public String getTs() {
		return this.ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	@Column(name = "DIRECTLEADER", length = 20)
	public String getDirectleader() {
		return this.directleader;
	}

	public void setDirectleader(String directleader) {
		this.directleader = directleader;
	}

	@Column(name = "DUTYNAME", length = 20)
	public String getDutyname() {
		return this.dutyname;
	}

	public void setDutyname(String dutyname) {
		this.dutyname = dutyname;
	}

	@Column(name = "GROUPDEF1", length = 128)
	public String getGroupdef1() {
		return this.groupdef1;
	}

	public void setGroupdef1(String groupdef1) {
		this.groupdef1 = groupdef1;
	}

	@Column(name = "GROUPDEF10", length = 128)
	public String getGroupdef10() {
		return this.groupdef10;
	}

	public void setGroupdef10(String groupdef10) {
		this.groupdef10 = groupdef10;
	}

	@Column(name = "GROUPDEF11", length = 128)
	public String getGroupdef11() {
		return this.groupdef11;
	}

	public void setGroupdef11(String groupdef11) {
		this.groupdef11 = groupdef11;
	}

	@Column(name = "GROUPDEF12", length = 128)
	public String getGroupdef12() {
		return this.groupdef12;
	}

	public void setGroupdef12(String groupdef12) {
		this.groupdef12 = groupdef12;
	}

	@Column(name = "GROUPDEF13", length = 128)
	public String getGroupdef13() {
		return this.groupdef13;
	}

	public void setGroupdef13(String groupdef13) {
		this.groupdef13 = groupdef13;
	}

	@Column(name = "GROUPDEF14", length = 128)
	public String getGroupdef14() {
		return this.groupdef14;
	}

	public void setGroupdef14(String groupdef14) {
		this.groupdef14 = groupdef14;
	}

	@Column(name = "GROUPDEF15", length = 128)
	public String getGroupdef15() {
		return this.groupdef15;
	}

	public void setGroupdef15(String groupdef15) {
		this.groupdef15 = groupdef15;
	}

	@Column(name = "GROUPDEF16", length = 128)
	public String getGroupdef16() {
		return this.groupdef16;
	}

	public void setGroupdef16(String groupdef16) {
		this.groupdef16 = groupdef16;
	}

	@Column(name = "GROUPDEF17", length = 128)
	public String getGroupdef17() {
		return this.groupdef17;
	}

	public void setGroupdef17(String groupdef17) {
		this.groupdef17 = groupdef17;
	}

	@Column(name = "GROUPDEF18", length = 128)
	public String getGroupdef18() {
		return this.groupdef18;
	}

	public void setGroupdef18(String groupdef18) {
		this.groupdef18 = groupdef18;
	}

	@Column(name = "GROUPDEF19", length = 128)
	public String getGroupdef19() {
		return this.groupdef19;
	}

	public void setGroupdef19(String groupdef19) {
		this.groupdef19 = groupdef19;
	}

	@Column(name = "GROUPDEF2", length = 128)
	public String getGroupdef2() {
		return this.groupdef2;
	}

	public void setGroupdef2(String groupdef2) {
		this.groupdef2 = groupdef2;
	}

	@Column(name = "GROUPDEF20", length = 128)
	public String getGroupdef20() {
		return this.groupdef20;
	}

	public void setGroupdef20(String groupdef20) {
		this.groupdef20 = groupdef20;
	}

	@Column(name = "GROUPDEF3", length = 128)
	public String getGroupdef3() {
		return this.groupdef3;
	}

	public void setGroupdef3(String groupdef3) {
		this.groupdef3 = groupdef3;
	}

	@Column(name = "GROUPDEF4", length = 128)
	public String getGroupdef4() {
		return this.groupdef4;
	}

	public void setGroupdef4(String groupdef4) {
		this.groupdef4 = groupdef4;
	}

	@Column(name = "GROUPDEF5", length = 128)
	public String getGroupdef5() {
		return this.groupdef5;
	}

	public void setGroupdef5(String groupdef5) {
		this.groupdef5 = groupdef5;
	}

	@Column(name = "GROUPDEF6", length = 128)
	public String getGroupdef6() {
		return this.groupdef6;
	}

	public void setGroupdef6(String groupdef6) {
		this.groupdef6 = groupdef6;
	}

	@Column(name = "GROUPDEF7", length = 128)
	public String getGroupdef7() {
		return this.groupdef7;
	}

	public void setGroupdef7(String groupdef7) {
		this.groupdef7 = groupdef7;
	}

	@Column(name = "GROUPDEF8", length = 128)
	public String getGroupdef8() {
		return this.groupdef8;
	}

	public void setGroupdef8(String groupdef8) {
		this.groupdef8 = groupdef8;
	}

	@Column(name = "GROUPDEF9", length = 128)
	public String getGroupdef9() {
		return this.groupdef9;
	}

	public void setGroupdef9(String groupdef9) {
		this.groupdef9 = groupdef9;
	}

	@Column(name = "HROPERATOR", length = 20)
	public String getHroperator() {
		return this.hroperator;
	}

	public void setHroperator(String hroperator) {
		this.hroperator = hroperator;
	}

	@Column(name = "INSOURCE", length = 20)
	public String getInsource() {
		return this.insource;
	}

	public void setInsource(String insource) {
		this.insource = insource;
	}

	@Column(name = "ISCALOVERTIME", length = 1)
	public Character getIscalovertime() {
		return this.iscalovertime;
	}

	public void setIscalovertime(Character iscalovertime) {
		this.iscalovertime = iscalovertime;
	}

	@Column(name = "ISREFERENCED", length = 1)
	public Character getIsreferenced() {
		return this.isreferenced;
	}

	public void setIsreferenced(Character isreferenced) {
		this.isreferenced = isreferenced;
	}

	@Column(name = "ISRETURN", length = 1)
	public Character getIsreturn() {
		return this.isreturn;
	}

	public void setIsreturn(Character isreturn) {
		this.isreturn = isreturn;
	}

	@Column(name = "ONPOSTDATE", length = 10)
	public String getOnpostdate() {
		return this.onpostdate;
	}

	public void setOnpostdate(String onpostdate) {
		this.onpostdate = onpostdate;
	}

	@Column(name = "OUTMETHOD", length = 20)
	public String getOutmethod() {
		return this.outmethod;
	}

	public void setOutmethod(String outmethod) {
		this.outmethod = outmethod;
	}

	@Column(name = "PK_CLERKCLASS", length = 20)
	public String getPkClerkclass() {
		return this.pkClerkclass;
	}

	public void setPkClerkclass(String pkClerkclass) {
		this.pkClerkclass = pkClerkclass;
	}

	@Column(name = "PK_DUTYRANK", length = 20)
	public String getPkDutyrank() {
		return this.pkDutyrank;
	}

	public void setPkDutyrank(String pkDutyrank) {
		this.pkDutyrank = pkDutyrank;
	}

	@Column(name = "PK_PSNTYPE", length = 20)
	public String getPkPsntype() {
		return this.pkPsntype;
	}

	public void setPkPsntype(String pkPsntype) {
		this.pkPsntype = pkPsntype;
	}

	@Column(name = "POSTSTAT", length = 1)
	public Character getPoststat() {
		return this.poststat;
	}

	public void setPoststat(Character poststat) {
		this.poststat = poststat;
	}

	@Column(name = "PSNNAMEPINYIN", length = 1000)
	public String getPsnnamepinyin() {
		return this.psnnamepinyin;
	}

	public void setPsnnamepinyin(String psnnamepinyin) {
		this.psnnamepinyin = psnnamepinyin;
	}

	@Column(name = "RECRUITRESOURCE", length = 20)
	public String getRecruitresource() {
		return this.recruitresource;
	}

	public void setRecruitresource(String recruitresource) {
		this.recruitresource = recruitresource;
	}

	@Column(name = "REGULAR", length = 1)
	public Character getRegular() {
		return this.regular;
	}

	public void setRegular(Character regular) {
		this.regular = regular;
	}

	@Column(name = "REGULARDATA", length = 10)
	public String getRegulardata() {
		return this.regulardata;
	}

	public void setRegulardata(String regulardata) {
		this.regulardata = regulardata;
	}

	@Column(name = "SERIES", length = 20)
	public String getSeries() {
		return this.series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	@Column(name = "SHOWORDER", precision = 38, scale = 0)
	public BigDecimal getShoworder() {
		return this.showorder;
	}

	public void setShoworder(BigDecimal showorder) {
		this.showorder = showorder;
	}

	@Column(name = "TBM_PROP", precision = 38, scale = 0)
	public BigDecimal getTbmProp() {
		return this.tbmProp;
	}

	public void setTbmProp(BigDecimal tbmProp) {
		this.tbmProp = tbmProp;
	}

	@Column(name = "TIMECARDID", length = 25)
	public String getTimecardid() {
		return this.timecardid;
	}

	public void setTimecardid(String timecardid) {
		this.timecardid = timecardid;
	}

	@Column(name = "WASTOPDATE", length = 10)
	public String getWastopdate() {
		return this.wastopdate;
	}

	public void setWastopdate(String wastopdate) {
		this.wastopdate = wastopdate;
	}

}