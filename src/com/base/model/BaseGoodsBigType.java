package com.base.model;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGoodsBigType<M extends BaseGoodsBigType<M>> extends Model<M> implements IBean {

	public void setGoodsBigTypeId(java.math.BigDecimal goodsBigTypeId) {
		set("GOODS_BIG_TYPE_ID", goodsBigTypeId);
	}

	public java.math.BigDecimal getGoodsBigTypeId() {
		return get("GOODS_BIG_TYPE_ID");
	}

	public void setGoodsBiglTypeName(java.lang.String goodsBiglTypeName) {
		set("GOODS_BIGL_TYPE_NAME", goodsBiglTypeName);
	}

	public java.lang.String getGoodsBiglTypeName() {
		return get("GOODS_BIGL_TYPE_NAME");
	}

}
