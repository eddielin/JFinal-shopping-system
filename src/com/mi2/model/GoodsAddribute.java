package com.mi2.model;

import com.base.model.BaseGoodsAddribute;
import com.base.model.IService;
import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class GoodsAddribute extends BaseGoodsAddribute<GoodsAddribute> implements IService<GoodsAddribute> {
	public static final GoodsAddribute dao = new GoodsAddribute();

	@Override
	public List<GoodsAddribute> getAllData(GoodsAddribute goodsAddribute) {
		StringBuilder sbSql = new StringBuilder();
		sbSql.append("select * from goods_addribute ga where 1=1 ");
		return this.find(sbSql.toString());
	}

	@Override
	public Page<GoodsAddribute> getAllDataByPage(int pageNumber, int pageSize, GoodsAddribute goodsAddribute) {
		StringBuilder sbSql = new StringBuilder();
		sbSql.append("from goods_addribute ga where 1=1 ");
		ArrayList<Object> values = new ArrayList<>();
		if(goodsAddribute!=null&&!goodsAddribute.getAttrs().isEmpty()){
			if(StrKit.notBlank(goodsAddribute.getGoodsAddributeName())){
				sbSql.append(" and ga.goods_addribute_name like ?");
				values.add("%"+goodsAddribute.getGoodsAddributeName()+"%");
			}
		}
		return this.paginate(pageNumber,pageSize,"select * ",sbSql.toString(),values.toArray());
	}
}
