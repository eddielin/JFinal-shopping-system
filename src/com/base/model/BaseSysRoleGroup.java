package com.base.model;

import com.jfinal.plugin.activerecord.IBean;

/**
 * MyGenerated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysRoleGroup<M extends BaseSysRoleGroup<M>> extends BaseModel<M> implements IBean {

	public final static String TABLE_NAME = "SYS_ROLE_GROUP";

	public final static String SQL = "SELECT * FROM SYS_ROLE_GROUP WHERE 1=1 ";

	public void setRoleGroupId(java.math.BigDecimal roleGroupId) {
		set("ROLE_GROUP_ID", roleGroupId);
	}

	public java.math.BigDecimal getRoleGroupId() {
		return get("ROLE_GROUP_ID");
	}

	public void setRoleGroupName(java.lang.String roleGroupName) {
		set("ROLE_GROUP_NAME", roleGroupName);
	}

	public java.lang.String getRoleGroupName() {
		return get("ROLE_GROUP_NAME");
	}

	public void setRoleGroupDesc(java.lang.String roleGroupDesc) {
		set("ROLE_GROUP_DESC", roleGroupDesc);
	}

	public java.lang.String getRoleGroupDesc() {
		return get("ROLE_GROUP_DESC");
	}

}
