package main.java.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceTest {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("run 1===="+ System.currentTimeMillis());
            }
        }, 0, 2000, TimeUnit.MILLISECONDS);

        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("run 2====="+ System.currentTimeMillis());
            }
        }, 0, 1000, TimeUnit.MILLISECONDS);

        Thread.sleep(1000 * 15);

        //停止任务
        executorService.shutdown();
        System.out.println("停止任务");

        Thread.sleep(1000 * 5);

        executorService = Executors.newSingleThreadScheduledExecutor();
        //开始新任务
        System.out.println("开始新任务");
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("run 1===="+ System.currentTimeMillis());
            }
        }, 0, 1000, TimeUnit.MILLISECONDS);

        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("run 2===="+ System.currentTimeMillis());
            }
        }, 0, 500, TimeUnit.MILLISECONDS);

        Thread.sleep(1000 * 8);

        //停止任务
        executorService.shutdown();
        System.out.println("停止任务");

    }
}
