package com.code.design.demo001;

/**
 * @Author: paoPao
 * @Date: 2022/10/6 21:47
 * @Description:
 */
public class Hotel extends AbstractStrategy{
    public static final Hotel instance = new Hotel();

    private Hotel(){
        register();
    }

    public static Hotel getInstance() {
        return instance;
    }

    @Override
    public void issue(Object... params) {
        System.out.println("酒店订房策略！！！");
    }
}
