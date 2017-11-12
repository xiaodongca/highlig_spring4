package com.cxd.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/10/23
 * Description:
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionService userFunctionSercice = context.getBean(UseFunctionService.class);

        System.out.println(userFunctionSercice.SayHello("java config"));

        context.close();
    }
}
