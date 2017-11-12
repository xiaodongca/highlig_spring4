package com.cxd.annotation;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/11/09
 * Description:
 */
@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解配置照样获得的bean");
    }
}
