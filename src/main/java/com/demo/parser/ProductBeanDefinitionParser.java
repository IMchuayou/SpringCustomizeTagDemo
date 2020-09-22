package com.demo.parser;

import com.demo.beans.Product;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

public class ProductBeanDefinitionParser  extends AbstractSingleBeanDefinitionParser {
    @Override
    protected Class<?> getBeanClass(Element element) {
        return Product.class;
    }

    @Override
    protected void doParse(Element element,  BeanDefinitionBuilder builder) {

        String code  = element.getAttribute("code");
        String name = element.getAttribute("name");
        builder.addPropertyValue("code",code);
        builder.addPropertyValue("name",name);
    }
}
