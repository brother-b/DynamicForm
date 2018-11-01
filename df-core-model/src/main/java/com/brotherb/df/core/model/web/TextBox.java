/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.brotherb.df.core.model.web;

import com.brotherb.df.core.model.Control;

/**
 * 文本输入控件
 *
 * @author dora
 * @version $Id: TextBox.java, v 0.1 2018年11月01日 16:05 dora Exp $
 */
public class TextBox extends Control {

    private static final long serialVersionUID = 2088319261360073514L;

    /**文本输入*/
    private String text;

    /**渲染*/
    @Override
    public String render() {
      return  "<input type=\"text\" id=\""+getId()+"\" name=\""+getName()+"\" text=\""+text+"\"/>\n";
    }

    @Override
    public boolean hasControls() {
        return false;
    }

    /**
     * Getter method for property <tt>text</tt>.
     *
     * @return property value of text
     */
    public String getText() {
        return text;
    }

    /**
     * Setter method for property <tt>text</tt>.
     *
     * @param text  value to be assigned to property text
     */
    public void setText(String text) {
        this.text = text;
    }

}