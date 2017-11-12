package com.cxd.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/10/23
 * Description:
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }


    /**
     * 另一种注入的方式，直接将FunctionService作为参数给useFunctionService(),这也是Spring容器提供的极好的功能，
     * 在Spring容器中，只有容器中存在某个Bean.就可以在另外一个Bean的声明方法的参数中注入
     */
   /* @Bean
    public UseFunctionService useFunctionService(FunctionService functionService){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }*/

}
