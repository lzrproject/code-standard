package com.code.design.demo001;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: paoPao
 * @Date: 2022/10/6 21:48
 * @Description:
 */
public class StrategyContext {
    public static final Map<String, Strategy> registerMap = new HashMap<>();

    public static void registerStrategy(String rewardType, Strategy strategy) {
        registerMap.putIfAbsent(rewardType,strategy);
    }

    public static Strategy getStrategy(String rewardType) {
//        switch (rewardType) {
//            case "Waimai":
//                return new Waimai();
//            case "Hotel":
//                return new Hotel();
////            case "Food":
////                return new Food();
//            default:
//                throw new IllegalArgumentException("rewardType error!");
//        }
        return registerMap.get(rewardType);
    }
}
class RewardService {
    public void issueReward(String rewardType, Object ... params) {
        Strategy strategy = StrategyContext.getStrategy(rewardType);
        strategy.issue(params);
    }
}
