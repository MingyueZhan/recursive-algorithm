package com.example.list2treeandtree2list;


import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jeri
 * @version 1.0.0
 * @date 2019/8/9 16:43
 * @see
 */
public class TreeSS {

    public static void main(String[] args) {

    }

    public static List<TreeNode> tree2List(List<TreeNode> treeNodeList) {
        List<TreeNode> treeNodes = new ArrayList<>();
        for (TreeNode treeNode:treeNodeList){
            List<TreeNode> child = treeNode.getChild();
            treeNodes.add(treeNode);
            if (!CollectionUtils.isEmpty(child)){
                treeNodes.addAll(tree2List(child));
                treeNode.setChild(null);
            }
        }
        return treeNodes;
    }
}
