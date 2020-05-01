package main.java.test.nettest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
    public static void main(String[] args) {
        try {
            InetAddress byName1 = InetAddress.getByName("127.0.0.1");
            System.out.println(byName1);
            InetAddress byName2 = InetAddress.getByName("localhost");
            System.out.println(byName2);
            InetAddress byName3 = InetAddress.getLocalHost();
            System.out.println(byName3);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            InetAddress byName = InetAddress.getByName("www.baidu.com");
            System.out.println(byName);

            System.out.println(byName.getAddress());
            System.out.println(byName.getHostAddress());
            System.out.println(byName.getHostName());
            System.out.println(byName.getCanonicalHostName());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }



    }
}
