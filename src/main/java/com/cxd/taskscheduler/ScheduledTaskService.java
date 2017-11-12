package com.cxd.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/11/08
 * Description:
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000) //声明方法是计划任务  每隔固定时间执行
    public void reportCurrentTime(){
        System.out.println("每隔五秒钟执行一次"+dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 28 11 ? * *") //指定时间执行
    public void fixTimeExecution(){
        System.out.println("在指定时间"+dateFormat.format(new Date())+ "执行");
    }
}
