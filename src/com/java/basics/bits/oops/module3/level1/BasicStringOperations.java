package com.java.basics.bits.oops.module3.level1;
import java.lang.String;

public class BasicStringOperations {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";
        String s5 = new String("Hello there");
        if (s1.equals(s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if(s3.equals(s5)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println(s5);
        char[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String s6 = new String(charArray);
        System.out.println(s6);

        byte[] bytes = {72, 101, 108, 108, 111};
        String s7 = new String(bytes);
        System.out.println(s7);

        StringBuilder sb = new StringBuilder();
        sb.append("Hell-");
        sb.append("o");
        String s8 = sb.toString();
        System.out.println(s8);

        String s9 = "hello and";
        s9 = s9.concat(" hi");
        System.out.println(s9);

        String x = ":";
        String s10 = ""+x;
        System.out.println(String.valueOf(s10));

        String csv = "apple, guava, mango";
        String[] list = csv.split(",");

        String joined = String.join(" , ", list);
        System.out.println(joined);

        String phoneNo = "91-8223-21333";
        System.out.println(phoneNo.matches("\\d{2}-\\d{4}-\\d{5}"));

    }
}
