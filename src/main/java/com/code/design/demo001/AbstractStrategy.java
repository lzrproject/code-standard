package com.code.design.demo001;

/**
 * @Author: paoPao
 * @Date: 2022/10/7 10:52
 * @Description:
 */
public abstract class AbstractStrategy implements Strategy{

    // 类注册方法
    public void register() {
        StrategyContext.registerStrategy(getClass().getSimpleName(), this);
    }
}
