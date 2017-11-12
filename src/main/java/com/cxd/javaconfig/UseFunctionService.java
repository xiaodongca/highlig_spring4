package com.cxd.javaconfig;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/10/23
 * Description:
 */
public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
