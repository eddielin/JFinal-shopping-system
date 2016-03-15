package com.base.model;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysRoleGroup<M extends BaseSysRoleGroup<M>> extends Model<M> implements IBean {

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
