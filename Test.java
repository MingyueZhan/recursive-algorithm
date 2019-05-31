package com.shiyuesoft.microservice.test.api;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jeri
 * @version 1.0.0
 * @company www.shiyuesoft.com
 * @date 2019/5/31 11:02
 * @see
 */
public class Test {

    public static void main(String[] args) {
            List<Menu> menuList = new ArrayList<>();
            menuList.add(new Menu("GN001D000","0","系统管理","/admin","Y"));
            menuList.add(new Menu("GN001D100","GN001D000","权限管理","/admin","Y"));
            menuList.add(new Menu("GN001D110","GN001D100","密码修改","/admin","Y"));
            menuList.add(new Menu("GN001D120","GN001D100","新加用户","/admin","Y"));
            menuList.add(new Menu("GN001D200","GN001D000","系统监控","/admin","Y"));
            menuList.add(new Menu("GN001D210","GN001D200","在线用户","/admin","Y"));
            menuList.add(new Menu("GN002D000","0","订阅区","/admin","Y"));
            menuList.add(new Menu("GN003D000","0","未知领域","/admin","Y"));
            MenuTree menuTree = new MenuTree(menuList);
            List<Menu> menuList1 = menuTree.buildTree();
            for (Menu m:menuList1){
                System.out.println(m);
            }
    }
}
