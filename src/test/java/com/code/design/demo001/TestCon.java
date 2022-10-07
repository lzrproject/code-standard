package com.code.design.demo001;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: paoPao
 * @Date: 2022/10/6 21:53
 * @Description:
 */
@SpringBootTest
public class TestCon {

    @Test
    public void demo001() {
        StrategyContext.registerStrategy("Waimai", Waimai.getInstance());
        StrategyContext.registerStrategy("Hotel", Hotel.getInstance());

        RewardService service = new RewardService();
        service.issueReward("Hotel");
    }
}
