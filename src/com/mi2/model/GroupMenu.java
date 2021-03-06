package com.mi2.model;

import com.base.model.BaseGroupMenu;
import com.jfinal.plugin.activerecord.Db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class GroupMenu extends BaseGroupMenu<GroupMenu> {
	public static final GroupMenu dao = new GroupMenu();

	//批量保存用户菜单组
	public int[] batchSave(BigDecimal roleGroupId,String menuIdsStr){
		String [] menuids = menuIdsStr.split(",");
		List<GroupMenu> groupMenuList = new ArrayList<>();
		for(String menuId : menuids){
			GroupMenu groupMenu = new GroupMenu();
			groupMenu.setRoleGroupId(roleGroupId);
			groupMenu.setMenuId(BigDecimal.valueOf(Long.parseLong(menuId)));
			groupMenuList.add(groupMenu);
		}
		return Db.batchSave(groupMenuList,groupMenuList.size());
	}

	//批量删除用户菜单组
	public int batchDelete(BigDecimal roleGroupId){
		String sql = "delete group_menu gm where gm.role_group_id=?";
		return Db.update(sql,roleGroupId);
	}
}
