/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.brotherb.df.core.model.instance;

import com.brotherb.df.core.model.Control;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 *  控件实例
 *
 * @author dora
 * @version $Id: ControlInstance.java, v 0.1 2018年10月31日 15:35 dora Exp $
 */
public class ControlInstance implements Serializable {

    private static final long serialVersionUID = -7294504521264275777L;

    private Control control;

    /**
     * Getter method for property <tt>control</tt>.
     *
     * @return property value of control
     */
    public Control getControl() {
        return control;
    }

    /**
     * Setter method for property <tt>control</tt>.
     *
     * @param control  value to be assigned to property control
     */
    public void setControl(Control control) {
        this.control = control;
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