package com.demo.test;

import com.demo.beans.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("myspring.xml");
        Product product = (Product) context.getBean("product");
        System.out.println(product.getCode());
        System.out.println(product.getName());
    }
}
