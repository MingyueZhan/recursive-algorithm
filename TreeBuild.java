package com.example.list2treeandtree2list;

import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @author jeri
 * @version 1.0.0
 * @date 2019/8/9 14:48
 * @see
 */
public class TreeBuild {
    /**
     * 使用两层循环实现
     *
     * @param
     * @return
     */
    public static List<TreeNode> toTree01(List<TreeNode> treeNodeList) {
        List<TreeNode> relist = new ArrayList<>();
        for (TreeNode parent : treeNodeList) {
            if (Objects.equals(null, parent.getParentId())) {
                relist.add(parent);
            }
            for (TreeNode child : treeNodeList) {
                if (child.getParentId()== parent.getId()){
                    if (parent.getChild()==null){
                        parent.setChild(new ArrayList<>());
                    }
                    parent.getChild().add(child);
                }
            }
        }
        return relist;
    }


    // 通过递归实现普通list转树
    public static List<TreeNode> toTree02(List<TreeNode> treeNodes) {
        List<TreeNode> retList = new ArrayList<>();
        for (TreeNode parent : treeNodes) {
            if (parent.getParentId()==null) {
                retList.add(findChildren(parent, treeNodes));
            }
        }
        return retList;
    }

    //递归找出父节点下面的子节点
    private static TreeNode findChildren(TreeNode parent, List<TreeNode> treeNodes) {
        for (TreeNode child : treeNodes) {
            if (parent.getId().equals(child.getParentId())) {
                if (parent.getChild() == null) {
                    parent.setChild(new ArrayList<>());
                }
                parent.getChild().add(findChildren(child, treeNodes));
            }
        }
        return parent;
    }

    /**
     * list 转树的第三种方式
     * @param list
     * @return
     */
    public static List<TreeNode> toTree03(List<TreeNode> list) {
        List<TreeNode> root = new ArrayList<>(list.size());
        if (CollectionUtils.isEmpty(list)) {
            return root;
        }
        Map<String, TreeNode> map = new HashMap<>(list.size());
        List<TreeNode> list1 = new ArrayList<>(list.size());

        for (TreeNode treeNode : list) {
            treeNode.setChild(new ArrayList<>());
            list1.add(treeNode);
            map.put(treeNode.getId(), treeNode);
        }

        for (TreeNode treeNode : list1) {
            if (treeNode.getParentId() == null) {
                root.add(treeNode);
            } else {
                TreeNode top = map.get(treeNode.getParentId());
                top.getChild().add(treeNode);
            }
        }
        return root;
    }
}
