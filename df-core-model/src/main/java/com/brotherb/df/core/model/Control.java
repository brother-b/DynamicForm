/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.brotherb.df.core.model;

import com.brotherb.df.core.model.enums.ControlTypeEnum;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 控件基类
 * 所有控件继承于此
 * @author dora
 * @version $Id: Control.java, v 0.1 2018年10月31日 14:27 dora Exp $
 */
public abstract class Control implements Serializable {

    private static final long serialVersionUID = -5545392479727873970L;

    private String name;

    private ControlTypeEnum controlType;

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
     * Getter method for property <tt>controlType</tt>.
     *
     * @return property value of controlType
     */
    public ControlTypeEnum getControlType() {
        return controlType;
    }

    /**
     * Setter method for property <tt>controlType</tt>.
     *
     * @param controlType  value to be assigned to property controlType
     */
    public void setControlType(ControlTypeEnum controlType) {
        this.controlType = controlType;
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString(){
        return ReflectionToStringBuilder.toString(this,ToStringStyle.SHORT_PREFIX_STYLE);
    }

}