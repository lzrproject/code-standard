//package com.code.mysql.service.impl;
//
//import com.code.mysql.service.AsyncService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//import java.util.concurrent.CountDownLatch;
//
///**
// * @Author paoPao
// * @Date 2022/11/11
// * @Description
// */
//
//@Slf4j
//public class AsyncServiceImpl {
//
//    public void executeAsync(List<LogOutputResult> logOutputResults, LogOutputResultMapper logOutputResultMapper, CountDownLatch countDownLatch) {
//        try{
//            log.warn("start executeAsync");
//            //异步线程要做的事情
//            logOutputResultMapper.addLogOutputResultBatch(logOutputResults);
//            log.warn("end executeAsync");
//        }finally {
//            countDownLatch.countDown();// 很关键, 无论上面程序是否异常必须执行countDown,否则await无法释放
//        }
//    }
//
//    public int testMultiThread() {
//        List<LogOutputResult> logOutputResults = getTestData();
//        //测试每100条数据插入开一个线程
//        List<List<LogOutputResult>> lists = ConvertHandler.splitList(logOutputResults, 100);
//        CountDownLatch countDownLatch = new CountDownLatch(lists.size());
//        for (List<LogOutputResult> listSub:lists) {
//            asyncService.executeAsync(listSub, logOutputResultMapper,countDownLatch);
//        }
//        try {
//            countDownLatch.await(); //保证之前的所有的线程都执行完成，才会走下面的；
//            // 这样就可以在下面拿到所有线程执行完的集合结果
//        } catch (Exception e) {
//            log.error("阻塞异常:"+e.getMessage());
//        }
//        return logOutputResults.size();
//    }
//}
