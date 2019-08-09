package com.example.list2treeandtree2list;

import java.util.List;

/**
 * @author jeri
 * @version 1.0.0
 * @date 2019/8/9 14:45
 * @see
 */
public class TreeNode {

    private String id;

    private String name;

    private String parentId;

    private List<TreeNode> child;


    public TreeNode() {
    }

    public TreeNode(String id, String name, String parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    public List<TreeNode> getChild() {
        return child;
    }

    public void setChild(List<TreeNode> child) {
        this.child = child;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
