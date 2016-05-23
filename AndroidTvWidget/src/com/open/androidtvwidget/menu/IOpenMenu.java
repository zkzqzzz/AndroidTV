package com.open.androidtvwidget.menu;

import java.util.ArrayList;

import com.open.androidtvwidget.R;

import android.widget.AbsListView;

/**
 * 菜单接口.
 * @author hailongqiu
 *
 */
public interface IOpenMenu {
	
	static final int NONE = 0;
	static final int DEFAULT_LAYOUT_ID = R.layout.list_menu_item_layout;
	
	/**
	 * 添加菜单项.
	 */
	public IOpenMenuItem add(CharSequence title);

	public OpenSubMenu addSubMenu(int pos, OpenSubMenu openSubMenu); // 添加子菜单到某个位置的菜单上.

	public OpenMenu setTextSize(int size); // 全局设置菜单字体.

	public ArrayList<IOpenMenuItem> getMenuDatas(); // 获取菜单数据.

	/**
	 * 可以设置ListView, GridView.
	 * <p>
	 * 可以不设置，默认是ListView.
	 */
	public IOpenMenu setMenuView(AbsListView absListView);

	public AbsListView getMenuView();

	/**
	 * 设置--菜单宽度.
	 */
	public IOpenMenu setMenuWidth(int width);
	public IOpenMenu setMenuHeight(int height);
	public int getMenuWidth();
	public int getMenuHeight();
	
	/**
	 * 设置菜单item--ID.
	 * <p>
	 * 如果你想要写自己的布局. 可以参考 OpenMenuViewItem.java
	 */
	public IOpenMenu setLayoutID(int id);

	public int getLayoutID();

	/**
	 * 设置菜单-ID.
	 */
	public IOpenMenu setId(int id);

	public int getId();

}
