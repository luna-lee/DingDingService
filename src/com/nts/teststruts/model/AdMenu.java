package com.nts.teststruts.model;


// Generated 2015-10-14 16:30:00 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * AdMenu generated by hbm2java
 */
@Entity
@Table(name = "AD_MENU", schema = "NC58")
public class AdMenu implements java.io.Serializable {

	private String uuidMenu;
	private String menuname;
	private String menucode;
	private Integer menulevel;
	private String parentid;
	private String action;
	private String createTime;
	private int type;

	public AdMenu() {
	}

	public AdMenu(String uuidMenu, String createTime) {
		this.uuidMenu = uuidMenu;
		this.createTime = createTime;
	}

	public AdMenu(String uuidMenu, String menuname, String menucode, Integer menulevel, String parentid, String action,
			String createTime) {
		this.uuidMenu = uuidMenu;
		this.menuname = menuname;
		this.menucode = menucode;
		this.menulevel = menulevel;
		this.parentid = parentid;
		this.action = action;
		this.createTime = createTime;
	}

	@Id
	@GeneratedValue(generator="system-uuid") 
	@GenericGenerator(name="system-uuid", strategy = "uuid")	
	@Column(name = "UUID_MENU", unique = true, nullable = false, length = 36)
	public String getUuidMenu() {
		return this.uuidMenu;
	}

	public void setUuidMenu(String uuidMenu) {
		this.uuidMenu = uuidMenu;
	}

	@Column(name = "MENUNAME", length = 30)
	public String getMenuname() {
		return this.menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	@Column(name = "MENUCODE", length = 12)
	public String getMenucode() {
		return this.menucode;
	}

	public void setMenucode(String menucode) {
		this.menucode = menucode;
	}

	@Column(name = "MENULEVEL", precision = 5, scale = 0)
	public Integer getMenulevel() {
		return this.menulevel;
	}

	public void setMenulevel(Integer menulevel) {
		this.menulevel = menulevel;
	}

	@Column(name = "PARENTID", length = 36)
	public String getParentid() {
		return this.parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	@Column(name = "ACTION", length = 100)
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Column(name = "CREATE_TIME", nullable = false, length = 30)
	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Column(name = "TYPE", nullable = false, length = 1)
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	

}
