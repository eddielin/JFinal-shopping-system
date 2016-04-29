package com.mi2.model;

import com.base.model.BaseOtherGoodsView;
import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class OtherGoodsView extends BaseOtherGoodsView<OtherGoodsView> {
	public static final OtherGoodsView dao = new OtherGoodsView();

	@Override
	public List<OtherGoodsView> getAllData(OtherGoodsView t) {
		StringBuilder sbSql = new StringBuilder();
		sbSql.append("select * from other_goods_view ogv where 1=1 ");
		ArrayList<Object> values = new ArrayList<>();
		if(t!=null&&!t.getAttrs().isEmpty()) {
			if (t.getGoodsId() != null) {
				sbSql.append(" and ogv.goods_id=?");
				values.add(t.getGoodsId());
			}
			if (t.getAdaptPhoneTypeId() != null) {
				sbSql.append(" and ogv.adapt_phone_type_id=?");
				values.add(t.getAdaptPhoneTypeId());
			}
		}
		return this.find(sbSql.toString(),values.toArray());
	}

	public Page<OtherGoodsView> getAllDataByPageExistGoodsColor(int pageNumber, int pageSize, OtherGoodsView t){
		Page<OtherGoodsView> pageUtil = this.getAllDataByPage(pageNumber,pageSize,t);
		//查询商品颜色图片
		for(int i=0,size=pageUtil.getList().size();i<size;i++){
			GoodsColor gc = new GoodsColor();
			gc.setGoodsId(pageUtil.getList().get(i).getGoodsId());
			pageUtil.getList().get(i).put("goodsColorList",GoodsColor.dao.getAllData(gc));
		}
		return pageUtil;
	}

	@Override
	public Page<OtherGoodsView> getAllDataByPage(int pageNumber, int pageSize, OtherGoodsView t) {
		StringBuilder sbSql = new StringBuilder();
		sbSql.append("from other_goods_view ogv where 1=1 ");
		ArrayList<Object> values = new ArrayList<>();
		if(t!=null&&!t.getAttrs().isEmpty()){
			if(t.getGoodsId()!=null){
				sbSql.append(" and ogv.goods_id=?");
				values.add(t.getGoodsId());
			}
			if(t.getAdaptPhoneTypeId()!=null){
				sbSql.append(" and ogv.adapt_phone_type_id=?");
				values.add(t.getAdaptPhoneTypeId());
			}
			if(t.get("adaptPhoneTypeIdIsNull",false)){
				sbSql.append(" and ogv.adapt_phone_type_id is null");
			}
			if(t.get("adaptPhoneTypeIdIsNotNull",false)){
				sbSql.append(" and ogv.adapt_phone_type_id is not null");
			}

			//筛选全局商品
			String filterOverallKeys = t.get("filterOverallKeys");
			if(StrKit.notBlank(filterOverallKeys)){
				sbSql.append(" and (ogv.goods_small_type_name like ? or ogv.goods_name like ?)");
				values.add("%"+filterOverallKeys+"%");
				values.add("%"+filterOverallKeys+"%");
			}

			//筛选特定大类型的商品
			if(null!=t.get("filterGoodsBigTypeId")){
				sbSql.append(" and ogv.goods_big_type_id=?");
				values.add(t.get("filterGoodsBigTypeId"));
			}
			//筛选特定类型的商品
			if(null!=t.get("filterGoodsSmallTypeId")){
				sbSql.append(" and ogv.goods_small_type_id=?");
				values.add(t.get("filterGoodsSmallTypeId"));
			}
			//筛选特定几个类型的商品
			if(null!=t.get("filterGoodsSmallTypeIds")){
				sbSql.append(" and ogv.goods_small_type_id in ("+t.get("filterGoodsSmallTypeIds")+")");
			}
			//筛选匹配手机类型的商品
			if(null!=t.get("filterAdaptPhoneSmallTypeId")){
				sbSql.append(" and (ogv.adapter_all_phone='1' or ogv.adapt_phone_type_id=?)");
				values.add(t.get("filterAdaptPhoneSmallTypeId"));
			}
			//筛选出打折商品
			if(t.get("filterGoodsDiscountPrice",false)){
				sbSql.append(" and ogv.goods_new_price<ogv.goods_former_price");
			}
			//筛选出有货的商品
			if(t.get("filterGoodsExistSource",false)){
				sbSql.append(" and ogv.goods_stock>0");
			}

			//商品显示排序
			String orderBy = t.get("orderBy","").toString();
			if(StrKit.notBlank(orderBy)&&!"default".equals(orderBy)){
				if("newGoods".equals(orderBy)){
					sbSql.append(" order by ogv.goods_id desc,ogv.adapter_all_phone");
				}else if("priceUp".equals(orderBy)){
					sbSql.append(" order by ogv.goods_new_price desc,ogv.adapter_all_phone");
				}else if("priceDown".equals(orderBy)){
					sbSql.append(" order by ogv.goods_new_price,ogv.adapter_all_phone");
				}else if("salesNum".equals(orderBy)){
					sbSql.append(" order by ogv.goods_sales_num desc");
				}
			}
		}
		return this.paginate(pageNumber,pageSize,"select * ",sbSql.toString(),values.toArray());
	}
}
