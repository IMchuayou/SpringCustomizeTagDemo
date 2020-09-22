package com.demo.handler;


import com.demo.parser.ProductBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNameHander extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("product",new ProductBeanDefinitionParser());
    }
}
