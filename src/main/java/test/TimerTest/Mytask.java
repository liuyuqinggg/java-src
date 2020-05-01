package main.java.test.TimerTest;


import java.util.TimerTask;

public class Mytask extends TimerTask {
    String name;

    public Mytask(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("当前执行的任务是："+ name);
    }
}
