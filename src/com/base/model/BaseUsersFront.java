package com.base.model;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUsersFront<M extends BaseUsersFront<M>> extends Model<M> implements IBean {

	public void setUserFrontId(java.math.BigDecimal userFrontId) {
		set("USER_FRONT_ID", userFrontId);
	}

	public java.math.BigDecimal getUserFrontId() {
		return get("USER_FRONT_ID");
	}

	public void setLoginName(java.lang.String loginName) {
		set("LOGIN_NAME", loginName);
	}

	public java.lang.String getLoginName() {
		return get("LOGIN_NAME");
	}

	public void setPASSWORD(java.lang.String PASSWORD) {
		set("PASSWORD", PASSWORD);
	}

	public java.lang.String getPASSWORD() {
		return get("PASSWORD");
	}

	public void setUserStatus(java.lang.String userStatus) {
		set("USER_STATUS", userStatus);
	}

	public java.lang.String getUserStatus() {
		return get("USER_STATUS");
	}

	public void setNAME(java.lang.String NAME) {
		set("NAME", NAME);
	}

	public java.lang.String getNAME() {
		return get("NAME");
	}

	public void setSEX(java.lang.String SEX) {
		set("SEX", SEX);
	}

	public java.lang.String getSEX() {
		return get("SEX");
	}

	public void setTELEPHONE(java.lang.String TELEPHONE) {
		set("TELEPHONE", TELEPHONE);
	}

	public java.lang.String getTELEPHONE() {
		return get("TELEPHONE");
	}

	public void setEMAIL(java.lang.String EMAIL) {
		set("EMAIL", EMAIL);
	}

	public java.lang.String getEMAIL() {
		return get("EMAIL");
	}

	public void setBIRTHDAY(java.util.Date BIRTHDAY) {
		set("BIRTHDAY", BIRTHDAY);
	}

	public java.util.Date getBIRTHDAY() {
		return get("BIRTHDAY");
	}

	public void setNICKNAME(java.lang.String NICKNAME) {
		set("NICKNAME", NICKNAME);
	}

	public java.lang.String getNICKNAME() {
		return get("NICKNAME");
	}

	public void setIMG(java.lang.String IMG) {
		set("IMG", IMG);
	}

	public java.lang.String getIMG() {
		return get("IMG");
	}

}
