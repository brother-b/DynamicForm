/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.brotherb.df.core.model;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 控件基类
 * 所有控件继承于此
 * @author dora
 * @version $Id: Control.java, v 0.1 2018年10月31日 14:27 dora Exp $
 */
public abstract class Control implements Serializable {

    private static final long serialVersionUID = -5545392479727873970L;

    /**id*/
    private String id;

    /**名称*/
    private String name;

    /**子控件*/
    private List<Control> controls;

    /**控件可见性*/
    private boolean visible;

    /**
     * 渲染
     * @return
     */
    public abstract String render();


    /**
     * 添加子控件
     * @param control
     */
    public void addControl(Control control) {
        if (controls == null) {
            controls = new ArrayList<>();
        }
        controls.add(control);
    }

    /**
     * 是否有子控件
     * @return
     */
    public boolean hasControls() {
        return !CollectionUtils.isEmpty(controls);
    }

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id  value to be assigned to property id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name  value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>controls</tt>.
     *
     * @return property value of controls
     */
    public List<Control> getControls() {
        return controls;
    }

    /**
     * Setter method for property <tt>controls</tt>.
     *
     * @param controls  value to be assigned to property controls
     */
    public void setControls(List<Control> controls) {
        this.controls = controls;
    }

    /**
     * Getter method for property <tt>visible</tt>.
     *
     * @return property value of visible
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Setter method for property <tt>visible</tt>.
     *
     * @param visible  value to be assigned to property visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}