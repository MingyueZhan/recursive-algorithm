package com.shiyuesoft.microservice.test.api;

import java.util.List;

/**
 * @author jeri
 * @version 1.0.0
 * @company www.shiyuesoft.com
 * @date 2019/5/31 10:25
 * @see
 */
public class Menu {

    private String id;
    private String parentId;
    private String text;
    private String url;
    private String yxbz;
    private List<Menu> child;

    public Menu(String id, String parentId, String text, String url, String yxbz) {
        this.id = id;
        this.parentId = parentId;
        this.text = text;
        this.url = url;
        this.yxbz = yxbz;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }

    public List<Menu> getChild() {
        return child;
    }

    public void setChild(List<Menu> child) {
        this.child = child;
    }
}
