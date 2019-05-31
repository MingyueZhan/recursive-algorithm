package com.shiyuesoft.microservice.test.api;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jeri
 * @version 1.0.0
 * @company www.shiyuesoft.com
 * @date 2019/5/31 10:29
 * @see
 */
public class MenuTree {

    private List<Menu> menuList;

    public MenuTree(List<Menu> menuList) {
        this.menuList = menuList;
    }


    // 建立树型结构
    // 获取根节点
    // 递归，建立子树型结构

    /** 生成菜单树
     * @Author jeri
     * @Description //TODO
     * @Date 10:55 2019/5/31
     * @Param []
     * @return java.util.List<com.shiyue.digui.Menu>
    **/

    public  List<Menu> buildTree(){
        List<Menu> treeMenu = new ArrayList<>();
        for (Menu menuNode:getRootNode()){
            menuNode = buildChildTree(menuNode);
            treeMenu.add(menuNode);
        }
        return treeMenu;
    }

    /** 生成单个菜单
     * @Author jeri
     * @Description //TODO
     * @Date 10:55 2019/5/31
     * @Param [menu]
     * @return com.shiyue.digui.Menu
    **/

    private Menu buildChildTree(Menu menu){
        List<Menu> childMenus = new ArrayList<>();
        for (Menu menuNode:menuList){
            if (menuNode.getParentId().equals(menu.getId())){
                childMenus.add(buildChildTree(menuNode));
            }
        }
        menu.setChild(childMenus);
        return menu;
    }
    /** 获取根节点
     * @Author jeri
     * @Description //TODO
     * @Date 10:45 2019/5/31
     * @Param []
     * @return java.util.List<com.shiyue.digui.Menu>
    **/

    private List<Menu> getRootNode(){
        List<Menu> rootMenu = new ArrayList<>();
        for (Menu menu:menuList){
            if (menu.getParentId().equals("0")){
                rootMenu.add(menu);
            }
        }
        return rootMenu;
    }
}
