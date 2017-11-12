package com.cxd.aop;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/10/23
 * Description:
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add(){

    }
}
