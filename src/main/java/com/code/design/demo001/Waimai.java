package com.code.design.demo001;

/**
 * @Author: paoPao
 * @Date: 2022/10/6 20:34
 * @Description:
 */
public class Waimai extends AbstractStrategy {
    public static final Waimai instance = new Waimai();

    private Waimai(){
        register();
    }

    public static Waimai getInstance() {
        return instance;
    }

    @Override
    public void issue(Object... params) {
        System.out.println("外卖方案策略！！");
    }
}
