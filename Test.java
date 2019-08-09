package com.example.list2treeandtree2list;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jeri
 * @version 1.0.0
 * @date 2019/8/9 15:44
 * @see
 */
public class Test {

    private static ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
    }

    public static void main(String[] args) throws JsonProcessingException {

        List<TreeNode> list = new ArrayList<>();

        TreeNode treeNode1 = new TreeNode("1", "广州", null);
        TreeNode treeNode2 = new TreeNode("2", "深圳", null);

        TreeNode treeNode3 = new TreeNode("3", "天河区", treeNode1.getId());
        TreeNode treeNode4 = new TreeNode("4", "越秀区", treeNode1.getId());
        TreeNode treeNode5 = new TreeNode("5", "黄埔区", treeNode1.getId());
        TreeNode treeNode6 = new TreeNode("6", "石牌", treeNode3.getId());
        TreeNode treeNode7 = new TreeNode("7", "百脑汇", treeNode6.getId());


        TreeNode treeNode8 = new TreeNode("8", "南山区", treeNode2.getId());
        TreeNode treeNode9 = new TreeNode("9", "宝安区", treeNode2.getId());
        TreeNode treeNode10 = new TreeNode("10", "科技园", treeNode8.getId());

        list.add(treeNode1);
        list.add(treeNode2);
        list.add(treeNode3);
        list.add(treeNode4);
        list.add(treeNode5);
        list.add(treeNode6);
        list.add(treeNode7);
        list.add(treeNode8);
        list.add(treeNode9);
        list.add(treeNode10);

        List<TreeNode> treeNodes = TreeBuild.toTree01(list);


        List<TreeNode> treeNodes1 = TreeSS.tree2List(treeNodes);
        String s1 = objectMapper.writeValueAsString(treeNodes1);
        System.out.println(s1);

    }




}
