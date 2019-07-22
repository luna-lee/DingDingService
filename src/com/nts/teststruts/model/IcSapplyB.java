package com.nts.teststruts.model;
// Generated 2015-7-24 10:07:22 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * IcSapplyB generated by hbm2java
 */
@Entity
@Table(name = "IC_SAPPLY_B", schema = "NC58")
public class IcSapplyB implements java.io.Serializable {

	private String sapplyBid;
	private BigDecimal appcastnum;
	private BigDecimal applynum;
	private String castunitid;
	private String cbilltypecode;
	private String ccostobjectid;
	private String cfirstbillbid;
	private String cfirstbillhid;
	private String cfirsttype;
	private String cinvbasid;
	private String cinventoryid;
	private String cprojectid;
	private String cqualitylevelid;
	private String crowno;
	private String csourcebillbid;
	private String csourcebillhid;
	private String csourcebodyts;
	private String csourceheadts;
	private String cunitid;
	private String cvendorid;
	private String dfirstbilldate;
	private Long dr;
	private BigDecimal hsl;
	private Character isclosed;
	private BigDecimal ncorrespondnum;
	private String pkCorp;
	private String pkDefdoc1;
	private String pkDefdoc10;
	private String pkDefdoc11;
	private String pkDefdoc12;
	private String pkDefdoc13;
	private String pkDefdoc14;
	private String pkDefdoc15;
	private String pkDefdoc16;
	private String pkDefdoc17;
	private String pkDefdoc18;
	private String pkDefdoc19;
	private String pkDefdoc2;
	private String pkDefdoc20;
	private String pkDefdoc3;
	private String pkDefdoc4;
	private String pkDefdoc5;
	private String pkDefdoc6;
	private String pkDefdoc7;
	private String pkDefdoc8;
	private String pkDefdoc9;
	private String planrecvdate;
	private String recvmaterwhid;
	private String sapplyHid;
	private String ts;
	private String vbatchcode;
	private String vfirstbillcode;
	private String vfirstrowno;
	private String vfree1;
	private String vfree2;
	private String vfree3;
	private String vfree4;
	private String vfree5;
	private String vnote;
	private String vproductbatch;
	private String vsourcebillcode;
	private String vsourcerowno;
	private String vsourcetype;
	private String vuserdef1;
	private String vuserdef10;
	private String vuserdef11;
	private String vuserdef12;
	private String vuserdef13;
	private String vuserdef14;
	private String vuserdef15;
	private String vuserdef16;
	private String vuserdef17;
	private String vuserdef18;
	private String vuserdef19;
	private String vuserdef2;
	private String vuserdef20;
	private String vuserdef3;
	private String vuserdef4;
	private String vuserdef5;
	private String vuserdef6;
	private String vuserdef7;
	private String vuserdef8;
	private String vuserdef9;
	private String workcenterid;

	public IcSapplyB() {
	}

	public IcSapplyB(String sapplyBid, String sapplyHid) {
		this.sapplyBid = sapplyBid;
		this.sapplyHid = sapplyHid;
	}

	public IcSapplyB(String sapplyBid, BigDecimal appcastnum, BigDecimal applynum, String castunitid,
			String cbilltypecode, String ccostobjectid, String cfirstbillbid, String cfirstbillhid, String cfirsttype,
			String cinvbasid, String cinventoryid, String cprojectid, String cqualitylevelid, String crowno,
			String csourcebillbid, String csourcebillhid, String csourcebodyts, String csourceheadts, String cunitid,
			String cvendorid, String dfirstbilldate, Long dr, BigDecimal hsl, Character isclosed,
			BigDecimal ncorrespondnum, String pkCorp, String pkDefdoc1, String pkDefdoc10, String pkDefdoc11,
			String pkDefdoc12, String pkDefdoc13, String pkDefdoc14, String pkDefdoc15, String pkDefdoc16,
			String pkDefdoc17, String pkDefdoc18, String pkDefdoc19, String pkDefdoc2, String pkDefdoc20,
			String pkDefdoc3, String pkDefdoc4, String pkDefdoc5, String pkDefdoc6, String pkDefdoc7, String pkDefdoc8,
			String pkDefdoc9, String planrecvdate, String recvmaterwhid, String sapplyHid, String ts, String vbatchcode,
			String vfirstbillcode, String vfirstrowno, String vfree1, String vfree2, String vfree3, String vfree4,
			String vfree5, String vnote, String vproductbatch, String vsourcebillcode, String vsourcerowno,
			String vsourcetype, String vuserdef1, String vuserdef10, String vuserdef11, String vuserdef12,
			String vuserdef13, String vuserdef14, String vuserdef15, String vuserdef16, String vuserdef17,
			String vuserdef18, String vuserdef19, String vuserdef2, String vuserdef20, String vuserdef3,
			String vuserdef4, String vuserdef5, String vuserdef6, String vuserdef7, String vuserdef8, String vuserdef9,
			String workcenterid) {
		this.sapplyBid = sapplyBid;
		this.appcastnum = appcastnum;
		this.applynum = applynum;
		this.castunitid = castunitid;
		this.cbilltypecode = cbilltypecode;
		this.ccostobjectid = ccostobjectid;
		this.cfirstbillbid = cfirstbillbid;
		this.cfirstbillhid = cfirstbillhid;
		this.cfirsttype = cfirsttype;
		this.cinvbasid = cinvbasid;
		this.cinventoryid = cinventoryid;
		this.cprojectid = cprojectid;
		this.cqualitylevelid = cqualitylevelid;
		this.crowno = crowno;
		this.csourcebillbid = csourcebillbid;
		this.csourcebillhid = csourcebillhid;
		this.csourcebodyts = csourcebodyts;
		this.csourceheadts = csourceheadts;
		this.cunitid = cunitid;
		this.cvendorid = cvendorid;
		this.dfirstbilldate = dfirstbilldate;
		this.dr = dr;
		this.hsl = hsl;
		this.isclosed = isclosed;
		this.ncorrespondnum = ncorrespondnum;
		this.pkCorp = pkCorp;
		this.pkDefdoc1 = pkDefdoc1;
		this.pkDefdoc10 = pkDefdoc10;
		this.pkDefdoc11 = pkDefdoc11;
		this.pkDefdoc12 = pkDefdoc12;
		this.pkDefdoc13 = pkDefdoc13;
		this.pkDefdoc14 = pkDefdoc14;
		this.pkDefdoc15 = pkDefdoc15;
		this.pkDefdoc16 = pkDefdoc16;
		this.pkDefdoc17 = pkDefdoc17;
		this.pkDefdoc18 = pkDefdoc18;
		this.pkDefdoc19 = pkDefdoc19;
		this.pkDefdoc2 = pkDefdoc2;
		this.pkDefdoc20 = pkDefdoc20;
		this.pkDefdoc3 = pkDefdoc3;
		this.pkDefdoc4 = pkDefdoc4;
		this.pkDefdoc5 = pkDefdoc5;
		this.pkDefdoc6 = pkDefdoc6;
		this.pkDefdoc7 = pkDefdoc7;
		this.pkDefdoc8 = pkDefdoc8;
		this.pkDefdoc9 = pkDefdoc9;
		this.planrecvdate = planrecvdate;
		this.recvmaterwhid = recvmaterwhid;
		this.sapplyHid = sapplyHid;
		this.ts = ts;
		this.vbatchcode = vbatchcode;
		this.vfirstbillcode = vfirstbillcode;
		this.vfirstrowno = vfirstrowno;
		this.vfree1 = vfree1;
		this.vfree2 = vfree2;
		this.vfree3 = vfree3;
		this.vfree4 = vfree4;
		this.vfree5 = vfree5;
		this.vnote = vnote;
		this.vproductbatch = vproductbatch;
		this.vsourcebillcode = vsourcebillcode;
		this.vsourcerowno = vsourcerowno;
		this.vsourcetype = vsourcetype;
		this.vuserdef1 = vuserdef1;
		this.vuserdef10 = vuserdef10;
		this.vuserdef11 = vuserdef11;
		this.vuserdef12 = vuserdef12;
		this.vuserdef13 = vuserdef13;
		this.vuserdef14 = vuserdef14;
		this.vuserdef15 = vuserdef15;
		this.vuserdef16 = vuserdef16;
		this.vuserdef17 = vuserdef17;
		this.vuserdef18 = vuserdef18;
		this.vuserdef19 = vuserdef19;
		this.vuserdef2 = vuserdef2;
		this.vuserdef20 = vuserdef20;
		this.vuserdef3 = vuserdef3;
		this.vuserdef4 = vuserdef4;
		this.vuserdef5 = vuserdef5;
		this.vuserdef6 = vuserdef6;
		this.vuserdef7 = vuserdef7;
		this.vuserdef8 = vuserdef8;
		this.vuserdef9 = vuserdef9;
		this.workcenterid = workcenterid;
	}

	@Id

	@Column(name = "SAPPLY_BID", unique = true, nullable = false, length = 20)
	public String getSapplyBid() {
		return this.sapplyBid;
	}

	public void setSapplyBid(String sapplyBid) {
		this.sapplyBid = sapplyBid;
	}

	@Column(name = "APPCASTNUM", precision = 20, scale = 8)
	public BigDecimal getAppcastnum() {
		return this.appcastnum;
	}

	public void setAppcastnum(BigDecimal appcastnum) {
		this.appcastnum = appcastnum;
	}

	@Column(name = "APPLYNUM", precision = 20, scale = 8)
	public BigDecimal getApplynum() {
		return this.applynum;
	}

	public void setApplynum(BigDecimal applynum) {
		this.applynum = applynum;
	}

	@Column(name = "CASTUNITID", length = 20)
	public String getCastunitid() {
		return this.castunitid;
	}

	public void setCastunitid(String castunitid) {
		this.castunitid = castunitid;
	}

	@Column(name = "CBILLTYPECODE", length = 4)
	public String getCbilltypecode() {
		return this.cbilltypecode;
	}

	public void setCbilltypecode(String cbilltypecode) {
		this.cbilltypecode = cbilltypecode;
	}

	@Column(name = "CCOSTOBJECTID", length = 20)
	public String getCcostobjectid() {
		return this.ccostobjectid;
	}

	public void setCcostobjectid(String ccostobjectid) {
		this.ccostobjectid = ccostobjectid;
	}

	@Column(name = "CFIRSTBILLBID", length = 20)
	public String getCfirstbillbid() {
		return this.cfirstbillbid;
	}

	public void setCfirstbillbid(String cfirstbillbid) {
		this.cfirstbillbid = cfirstbillbid;
	}

	@Column(name = "CFIRSTBILLHID", length = 20)
	public String getCfirstbillhid() {
		return this.cfirstbillhid;
	}

	public void setCfirstbillhid(String cfirstbillhid) {
		this.cfirstbillhid = cfirstbillhid;
	}

	@Column(name = "CFIRSTTYPE", length = 4)
	public String getCfirsttype() {
		return this.cfirsttype;
	}

	public void setCfirsttype(String cfirsttype) {
		this.cfirsttype = cfirsttype;
	}

	@Column(name = "CINVBASID", length = 20)
	public String getCinvbasid() {
		return this.cinvbasid;
	}

	public void setCinvbasid(String cinvbasid) {
		this.cinvbasid = cinvbasid;
	}

	@Column(name = "CINVENTORYID", length = 20)
	public String getCinventoryid() {
		return this.cinventoryid;
	}

	public void setCinventoryid(String cinventoryid) {
		this.cinventoryid = cinventoryid;
	}

	@Column(name = "CPROJECTID", length = 20)
	public String getCprojectid() {
		return this.cprojectid;
	}

	public void setCprojectid(String cprojectid) {
		this.cprojectid = cprojectid;
	}

	@Column(name = "CQUALITYLEVELID", length = 20)
	public String getCqualitylevelid() {
		return this.cqualitylevelid;
	}

	public void setCqualitylevelid(String cqualitylevelid) {
		this.cqualitylevelid = cqualitylevelid;
	}

	@Column(name = "CROWNO", length = 20)
	public String getCrowno() {
		return this.crowno;
	}

	public void setCrowno(String crowno) {
		this.crowno = crowno;
	}

	@Column(name = "CSOURCEBILLBID", length = 20)
	public String getCsourcebillbid() {
		return this.csourcebillbid;
	}

	public void setCsourcebillbid(String csourcebillbid) {
		this.csourcebillbid = csourcebillbid;
	}

	@Column(name = "CSOURCEBILLHID", length = 20)
	public String getCsourcebillhid() {
		return this.csourcebillhid;
	}

	public void setCsourcebillhid(String csourcebillhid) {
		this.csourcebillhid = csourcebillhid;
	}

	@Column(name = "CSOURCEBODYTS", length = 20)
	public String getCsourcebodyts() {
		return this.csourcebodyts;
	}

	public void setCsourcebodyts(String csourcebodyts) {
		this.csourcebodyts = csourcebodyts;
	}

	@Column(name = "CSOURCEHEADTS", length = 20)
	public String getCsourceheadts() {
		return this.csourceheadts;
	}

	public void setCsourceheadts(String csourceheadts) {
		this.csourceheadts = csourceheadts;
	}

	@Column(name = "CUNITID", length = 20)
	public String getCunitid() {
		return this.cunitid;
	}

	public void setCunitid(String cunitid) {
		this.cunitid = cunitid;
	}

	@Column(name = "CVENDORID", length = 20)
	public String getCvendorid() {
		return this.cvendorid;
	}

	public void setCvendorid(String cvendorid) {
		this.cvendorid = cvendorid;
	}

	@Column(name = "DFIRSTBILLDATE", length = 10)
	public String getDfirstbilldate() {
		return this.dfirstbilldate;
	}

	public void setDfirstbilldate(String dfirstbilldate) {
		this.dfirstbilldate = dfirstbilldate;
	}

	@Column(name = "DR", precision = 10, scale = 0)
	public Long getDr() {
		return this.dr;
	}

	public void setDr(Long dr) {
		this.dr = dr;
	}

	@Column(name = "HSL", precision = 20, scale = 8)
	public BigDecimal getHsl() {
		return this.hsl;
	}

	public void setHsl(BigDecimal hsl) {
		this.hsl = hsl;
	}

	@Column(name = "ISCLOSED", length = 1)
	public Character getIsclosed() {
		return this.isclosed;
	}

	public void setIsclosed(Character isclosed) {
		this.isclosed = isclosed;
	}

	@Column(name = "NCORRESPONDNUM", precision = 20, scale = 8)
	public BigDecimal getNcorrespondnum() {
		return this.ncorrespondnum;
	}

	public void setNcorrespondnum(BigDecimal ncorrespondnum) {
		this.ncorrespondnum = ncorrespondnum;
	}

	@Column(name = "PK_CORP", length = 4)
	public String getPkCorp() {
		return this.pkCorp;
	}

	public void setPkCorp(String pkCorp) {
		this.pkCorp = pkCorp;
	}

	@Column(name = "PK_DEFDOC1", length = 20)
	public String getPkDefdoc1() {
		return this.pkDefdoc1;
	}

	public void setPkDefdoc1(String pkDefdoc1) {
		this.pkDefdoc1 = pkDefdoc1;
	}

	@Column(name = "PK_DEFDOC10", length = 20)
	public String getPkDefdoc10() {
		return this.pkDefdoc10;
	}

	public void setPkDefdoc10(String pkDefdoc10) {
		this.pkDefdoc10 = pkDefdoc10;
	}

	@Column(name = "PK_DEFDOC11", length = 20)
	public String getPkDefdoc11() {
		return this.pkDefdoc11;
	}

	public void setPkDefdoc11(String pkDefdoc11) {
		this.pkDefdoc11 = pkDefdoc11;
	}

	@Column(name = "PK_DEFDOC12", length = 20)
	public String getPkDefdoc12() {
		return this.pkDefdoc12;
	}

	public void setPkDefdoc12(String pkDefdoc12) {
		this.pkDefdoc12 = pkDefdoc12;
	}

	@Column(name = "PK_DEFDOC13", length = 20)
	public String getPkDefdoc13() {
		return this.pkDefdoc13;
	}

	public void setPkDefdoc13(String pkDefdoc13) {
		this.pkDefdoc13 = pkDefdoc13;
	}

	@Column(name = "PK_DEFDOC14", length = 20)
	public String getPkDefdoc14() {
		return this.pkDefdoc14;
	}

	public void setPkDefdoc14(String pkDefdoc14) {
		this.pkDefdoc14 = pkDefdoc14;
	}

	@Column(name = "PK_DEFDOC15", length = 20)
	public String getPkDefdoc15() {
		return this.pkDefdoc15;
	}

	public void setPkDefdoc15(String pkDefdoc15) {
		this.pkDefdoc15 = pkDefdoc15;
	}

	@Column(name = "PK_DEFDOC16", length = 20)
	public String getPkDefdoc16() {
		return this.pkDefdoc16;
	}

	public void setPkDefdoc16(String pkDefdoc16) {
		this.pkDefdoc16 = pkDefdoc16;
	}

	@Column(name = "PK_DEFDOC17", length = 20)
	public String getPkDefdoc17() {
		return this.pkDefdoc17;
	}

	public void setPkDefdoc17(String pkDefdoc17) {
		this.pkDefdoc17 = pkDefdoc17;
	}

	@Column(name = "PK_DEFDOC18", length = 20)
	public String getPkDefdoc18() {
		return this.pkDefdoc18;
	}

	public void setPkDefdoc18(String pkDefdoc18) {
		this.pkDefdoc18 = pkDefdoc18;
	}

	@Column(name = "PK_DEFDOC19", length = 20)
	public String getPkDefdoc19() {
		return this.pkDefdoc19;
	}

	public void setPkDefdoc19(String pkDefdoc19) {
		this.pkDefdoc19 = pkDefdoc19;
	}

	@Column(name = "PK_DEFDOC2", length = 20)
	public String getPkDefdoc2() {
		return this.pkDefdoc2;
	}

	public void setPkDefdoc2(String pkDefdoc2) {
		this.pkDefdoc2 = pkDefdoc2;
	}

	@Column(name = "PK_DEFDOC20", length = 20)
	public String getPkDefdoc20() {
		return this.pkDefdoc20;
	}

	public void setPkDefdoc20(String pkDefdoc20) {
		this.pkDefdoc20 = pkDefdoc20;
	}

	@Column(name = "PK_DEFDOC3", length = 20)
	public String getPkDefdoc3() {
		return this.pkDefdoc3;
	}

	public void setPkDefdoc3(String pkDefdoc3) {
		this.pkDefdoc3 = pkDefdoc3;
	}

	@Column(name = "PK_DEFDOC4", length = 20)
	public String getPkDefdoc4() {
		return this.pkDefdoc4;
	}

	public void setPkDefdoc4(String pkDefdoc4) {
		this.pkDefdoc4 = pkDefdoc4;
	}

	@Column(name = "PK_DEFDOC5", length = 20)
	public String getPkDefdoc5() {
		return this.pkDefdoc5;
	}

	public void setPkDefdoc5(String pkDefdoc5) {
		this.pkDefdoc5 = pkDefdoc5;
	}

	@Column(name = "PK_DEFDOC6", length = 20)
	public String getPkDefdoc6() {
		return this.pkDefdoc6;
	}

	public void setPkDefdoc6(String pkDefdoc6) {
		this.pkDefdoc6 = pkDefdoc6;
	}

	@Column(name = "PK_DEFDOC7", length = 20)
	public String getPkDefdoc7() {
		return this.pkDefdoc7;
	}

	public void setPkDefdoc7(String pkDefdoc7) {
		this.pkDefdoc7 = pkDefdoc7;
	}

	@Column(name = "PK_DEFDOC8", length = 20)
	public String getPkDefdoc8() {
		return this.pkDefdoc8;
	}

	public void setPkDefdoc8(String pkDefdoc8) {
		this.pkDefdoc8 = pkDefdoc8;
	}

	@Column(name = "PK_DEFDOC9", length = 20)
	public String getPkDefdoc9() {
		return this.pkDefdoc9;
	}

	public void setPkDefdoc9(String pkDefdoc9) {
		this.pkDefdoc9 = pkDefdoc9;
	}

	@Column(name = "PLANRECVDATE", length = 10)
	public String getPlanrecvdate() {
		return this.planrecvdate;
	}

	public void setPlanrecvdate(String planrecvdate) {
		this.planrecvdate = planrecvdate;
	}

	@Column(name = "RECVMATERWHID", length = 20)
	public String getRecvmaterwhid() {
		return this.recvmaterwhid;
	}

	public void setRecvmaterwhid(String recvmaterwhid) {
		this.recvmaterwhid = recvmaterwhid;
	}

	@Column(name = "SAPPLY_HID", nullable = false, length = 20)
	public String getSapplyHid() {
		return this.sapplyHid;
	}

	public void setSapplyHid(String sapplyHid) {
		this.sapplyHid = sapplyHid;
	}

	@Column(name = "TS", length = 19)
	public String getTs() {
		return this.ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	@Column(name = "VBATCHCODE", length = 30)
	public String getVbatchcode() {
		return this.vbatchcode;
	}

	public void setVbatchcode(String vbatchcode) {
		this.vbatchcode = vbatchcode;
	}

	@Column(name = "VFIRSTBILLCODE", length = 30)
	public String getVfirstbillcode() {
		return this.vfirstbillcode;
	}

	public void setVfirstbillcode(String vfirstbillcode) {
		this.vfirstbillcode = vfirstbillcode;
	}

	@Column(name = "VFIRSTROWNO", length = 20)
	public String getVfirstrowno() {
		return this.vfirstrowno;
	}

	public void setVfirstrowno(String vfirstrowno) {
		this.vfirstrowno = vfirstrowno;
	}

	@Column(name = "VFREE1", length = 100)
	public String getVfree1() {
		return this.vfree1;
	}

	public void setVfree1(String vfree1) {
		this.vfree1 = vfree1;
	}

	@Column(name = "VFREE2", length = 100)
	public String getVfree2() {
		return this.vfree2;
	}

	public void setVfree2(String vfree2) {
		this.vfree2 = vfree2;
	}

	@Column(name = "VFREE3", length = 100)
	public String getVfree3() {
		return this.vfree3;
	}

	public void setVfree3(String vfree3) {
		this.vfree3 = vfree3;
	}

	@Column(name = "VFREE4", length = 100)
	public String getVfree4() {
		return this.vfree4;
	}

	public void setVfree4(String vfree4) {
		this.vfree4 = vfree4;
	}

	@Column(name = "VFREE5", length = 100)
	public String getVfree5() {
		return this.vfree5;
	}

	public void setVfree5(String vfree5) {
		this.vfree5 = vfree5;
	}

	@Column(name = "VNOTE", length = 181)
	public String getVnote() {
		return this.vnote;
	}

	public void setVnote(String vnote) {
		this.vnote = vnote;
	}

	@Column(name = "VPRODUCTBATCH", length = 40)
	public String getVproductbatch() {
		return this.vproductbatch;
	}

	public void setVproductbatch(String vproductbatch) {
		this.vproductbatch = vproductbatch;
	}

	@Column(name = "VSOURCEBILLCODE", length = 30)
	public String getVsourcebillcode() {
		return this.vsourcebillcode;
	}

	public void setVsourcebillcode(String vsourcebillcode) {
		this.vsourcebillcode = vsourcebillcode;
	}

	@Column(name = "VSOURCEROWNO", length = 20)
	public String getVsourcerowno() {
		return this.vsourcerowno;
	}

	public void setVsourcerowno(String vsourcerowno) {
		this.vsourcerowno = vsourcerowno;
	}

	@Column(name = "VSOURCETYPE", length = 4)
	public String getVsourcetype() {
		return this.vsourcetype;
	}

	public void setVsourcetype(String vsourcetype) {
		this.vsourcetype = vsourcetype;
	}

	@Column(name = "VUSERDEF1", length = 100)
	public String getVuserdef1() {
		return this.vuserdef1;
	}

	public void setVuserdef1(String vuserdef1) {
		this.vuserdef1 = vuserdef1;
	}

	@Column(name = "VUSERDEF10", length = 100)
	public String getVuserdef10() {
		return this.vuserdef10;
	}

	public void setVuserdef10(String vuserdef10) {
		this.vuserdef10 = vuserdef10;
	}

	@Column(name = "VUSERDEF11", length = 100)
	public String getVuserdef11() {
		return this.vuserdef11;
	}

	public void setVuserdef11(String vuserdef11) {
		this.vuserdef11 = vuserdef11;
	}

	@Column(name = "VUSERDEF12", length = 100)
	public String getVuserdef12() {
		return this.vuserdef12;
	}

	public void setVuserdef12(String vuserdef12) {
		this.vuserdef12 = vuserdef12;
	}

	@Column(name = "VUSERDEF13", length = 100)
	public String getVuserdef13() {
		return this.vuserdef13;
	}

	public void setVuserdef13(String vuserdef13) {
		this.vuserdef13 = vuserdef13;
	}

	@Column(name = "VUSERDEF14", length = 100)
	public String getVuserdef14() {
		return this.vuserdef14;
	}

	public void setVuserdef14(String vuserdef14) {
		this.vuserdef14 = vuserdef14;
	}

	@Column(name = "VUSERDEF15", length = 100)
	public String getVuserdef15() {
		return this.vuserdef15;
	}

	public void setVuserdef15(String vuserdef15) {
		this.vuserdef15 = vuserdef15;
	}

	@Column(name = "VUSERDEF16", length = 100)
	public String getVuserdef16() {
		return this.vuserdef16;
	}

	public void setVuserdef16(String vuserdef16) {
		this.vuserdef16 = vuserdef16;
	}

	@Column(name = "VUSERDEF17", length = 100)
	public String getVuserdef17() {
		return this.vuserdef17;
	}

	public void setVuserdef17(String vuserdef17) {
		this.vuserdef17 = vuserdef17;
	}

	@Column(name = "VUSERDEF18", length = 100)
	public String getVuserdef18() {
		return this.vuserdef18;
	}

	public void setVuserdef18(String vuserdef18) {
		this.vuserdef18 = vuserdef18;
	}

	@Column(name = "VUSERDEF19", length = 100)
	public String getVuserdef19() {
		return this.vuserdef19;
	}

	public void setVuserdef19(String vuserdef19) {
		this.vuserdef19 = vuserdef19;
	}

	@Column(name = "VUSERDEF2", length = 100)
	public String getVuserdef2() {
		return this.vuserdef2;
	}

	public void setVuserdef2(String vuserdef2) {
		this.vuserdef2 = vuserdef2;
	}

	@Column(name = "VUSERDEF20", length = 100)
	public String getVuserdef20() {
		return this.vuserdef20;
	}

	public void setVuserdef20(String vuserdef20) {
		this.vuserdef20 = vuserdef20;
	}

	@Column(name = "VUSERDEF3", length = 100)
	public String getVuserdef3() {
		return this.vuserdef3;
	}

	public void setVuserdef3(String vuserdef3) {
		this.vuserdef3 = vuserdef3;
	}

	@Column(name = "VUSERDEF4", length = 100)
	public String getVuserdef4() {
		return this.vuserdef4;
	}

	public void setVuserdef4(String vuserdef4) {
		this.vuserdef4 = vuserdef4;
	}

	@Column(name = "VUSERDEF5", length = 100)
	public String getVuserdef5() {
		return this.vuserdef5;
	}

	public void setVuserdef5(String vuserdef5) {
		this.vuserdef5 = vuserdef5;
	}

	@Column(name = "VUSERDEF6", length = 100)
	public String getVuserdef6() {
		return this.vuserdef6;
	}

	public void setVuserdef6(String vuserdef6) {
		this.vuserdef6 = vuserdef6;
	}

	@Column(name = "VUSERDEF7", length = 100)
	public String getVuserdef7() {
		return this.vuserdef7;
	}

	public void setVuserdef7(String vuserdef7) {
		this.vuserdef7 = vuserdef7;
	}

	@Column(name = "VUSERDEF8", length = 100)
	public String getVuserdef8() {
		return this.vuserdef8;
	}

	public void setVuserdef8(String vuserdef8) {
		this.vuserdef8 = vuserdef8;
	}

	@Column(name = "VUSERDEF9", length = 100)
	public String getVuserdef9() {
		return this.vuserdef9;
	}

	public void setVuserdef9(String vuserdef9) {
		this.vuserdef9 = vuserdef9;
	}

	@Column(name = "WORKCENTERID", length = 20)
	public String getWorkcenterid() {
		return this.workcenterid;
	}

	public void setWorkcenterid(String workcenterid) {
		this.workcenterid = workcenterid;
	}

}