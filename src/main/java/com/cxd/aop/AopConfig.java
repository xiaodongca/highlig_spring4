package com.cxd.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/10/23
 * Description:
 */
@Configuration
@ComponentScan("com.cxd.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
