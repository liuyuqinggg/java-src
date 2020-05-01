package main.java.test.Thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThread2 extends Thread{
    String url;
    String name;

    public TestThread2(String url,String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件："+ name);
    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("http://thinkfree.club/633922.jpg", "./download/1.jpg");
        TestThread2 t2 = new TestThread2("http://thinkfree.club/34-343222_4k-wallpaper-reddit-best-cool-wallpaper-hd-download.jpg", "./download/2.jpg");
        TestThread2 t3 = new TestThread2("http://thinkfree.club/idea%E6%96%87%E4%BB%B6%E9%87%8D%E5%AE%9A%E5%90%91%E8%BE%93%E5%85%A5.png", "./download/3.jpg");
        t1.start();
        t2.start();
        t3.start();
    }
}

class WebDownloader{
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
