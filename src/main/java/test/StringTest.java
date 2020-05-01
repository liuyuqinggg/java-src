package main.java.test;

public class StringTest {
    public static void main(String[] args) {
        String a = "ab";
        int hashcode = a.hashCode();
        int hashcode2 = a.hashCode();
        System.out.println(hashcode);
        System.out.println(hashcode2);
    }
}
