package com.code.mysql.service;

import com.code.mysql.domain.User;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @Author paoPao
 * @Date 2022/11/11
 * @Description
 */
@Slf4j
public class UserService {

    public void insertBatch() {
        int count = 1000;
        Long start = System.currentTimeMillis();
        for(int i = 0;i<count;i++){
            User user = new User();
            user.setCName("user"+randomInt(100000));
            college.setcName(collegeNames[i]);
            //随机生成状态,false概率为0.1%
            Boolean flag = randomInt(1000)>0?true:false;
            college.setStatus(flag);
            //随机生成手机号
            college.setcPhoneNumber(phoneNumberStarts[randomInt(phoneNumberStarts.length)]+getRandom(8));
            college.setcAddress(address[randomInt(address.length)]);
            college.setcCreateTime(new Date());
            int insert = collegeDao.insert(college);
            count +=insert;
        }
        Long end = System.currentTimeMillis();
        log.info("插入耗时：{} ms",end-start);
    }

    public static int randomInt(int n){
        Random random = new Random();
        return random.nextInt(n);
    }
}
