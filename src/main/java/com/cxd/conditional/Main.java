package com.cxd.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/11/08
 * Description:
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = configApplicationContext.getBean(ListService.class);
        System.out.println(configApplicationContext.getEnvironment().getProperty("os.name")+"系统下的列表命令为："+listService.showListCmd());
    }

}
