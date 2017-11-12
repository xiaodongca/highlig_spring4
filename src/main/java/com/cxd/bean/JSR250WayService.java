package com.cxd.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/10/31
 * Description:
 */
public class JSR250WayService {

    @PostConstruct //在构造函数执行完之后执行
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化函数-JSR250WayService");
    }

    @PreDestroy  //在bean销毁之前执行
    public void destroy(){
        System.out.println("jsr250-destory-method");
    }

}
