/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.brotherb.df.core.model.web;

import com.brotherb.df.core.model.Control;

/**
 * 页面组合控件
 *
 * @author dora
 * @version $Id: Page.java, v 0.1 2018年11月01日 16:36 dora Exp $
 */
public class Page extends Control {

    private static final long serialVersionUID = -1145098851096312244L;

    /**
     * 渲染
     * @return
     */
    @Override
    public String render() {
        final StringBuffer buffer = new StringBuffer();
        if (this.hasControls()) {
            this.getControls().forEach(control -> buffer.append(control.render()));
        }
        return buffer.toString();
    }

}