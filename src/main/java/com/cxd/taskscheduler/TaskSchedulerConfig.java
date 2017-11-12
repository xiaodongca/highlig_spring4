package com.cxd.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/11/08
 * Description:
 */
@Configuration
@ComponentScan("com.cxd.taskscheduler")
@EnableScheduling  //注解开启对计划任务的支持
public class TaskSchedulerConfig {


}
