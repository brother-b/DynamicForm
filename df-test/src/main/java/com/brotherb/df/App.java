package com.brotherb.df;

import com.brotherb.df.core.model.web.Page;
import com.brotherb.df.core.model.web.TextBox;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring-context.xml");

        Page page = new Page();
        TextBox text = new TextBox();
        text.setId("discountRate");
        text.setName("discountRate");
        text.setText("input");
        page.addControl(text);

        System.out.println(page.render());

    }
}
