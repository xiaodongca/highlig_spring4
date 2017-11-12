package com.cxd.bean;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/10/31
 * Description:
 */
public class BeanWayService {

    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy(){
        System.out.println("@Bean-destory-method");
    }
}
