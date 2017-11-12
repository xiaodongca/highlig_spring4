package com.cxd.conditional;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/11/08
 * Description:
 */
public class WindowsListService implements ListService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}
