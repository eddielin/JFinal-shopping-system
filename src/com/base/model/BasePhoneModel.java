package com.base.model;

import com.jfinal.plugin.activerecord.IBean;

/**
 * MyGenerated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePhoneModel<M extends BasePhoneModel<M>> extends BaseModel<M> implements IBean {

	public final static String TABLE_NAME = "PHONE_MODEL";

	public final static String SQL = "SELECT * FROM PHONE_MODEL WHERE 1=1 ";

	public void setModelId(java.math.BigDecimal modelId) {
		set("MODEL_ID", modelId);
	}

	public java.math.BigDecimal getModelId() {
		return get("MODEL_ID");
	}

	public void setGoodsAddributeValId(java.math.BigDecimal goodsAddributeValId) {
		set("GOODS_ADDRIBUTE_VAL_ID", goodsAddributeValId);
	}

	public java.math.BigDecimal getGoodsAddributeValId() {
		return get("GOODS_ADDRIBUTE_VAL_ID");
	}

	public void setGoodsSmallTypeId(java.math.BigDecimal goodsSmallTypeId) {
		set("GOODS_SMALL_TYPE_ID", goodsSmallTypeId);
	}

	public java.math.BigDecimal getGoodsSmallTypeId() {
		return get("GOODS_SMALL_TYPE_ID");
	}

}
