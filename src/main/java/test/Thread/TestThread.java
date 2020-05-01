package main.java.test.Thread;

//1,基础Thread，重写run方法，调用start()
//线程开启不一定立即执行，由CPU调度决定
public class TestThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <200 ; i++) {
            System.out.println("我在看代码===" + i);
        }

    }

    public static void main(String[] args) {

        TestThread testThread = new TestThread();

        //启动线程
        testThread.start();

//        testThread.run();

        for (int i = 0; i <200 ; i++) {
            System.out.println("我在学习多线程===" + i);
        }
    }

}
