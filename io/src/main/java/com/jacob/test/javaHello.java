package com.jacob.test;

import java.util.Scanner;

public class javaHello {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        for (; ;) {
            System.out.println("你爱我吗:");
            String flag = in.next();
            if (flag.equals("爱")) {
                System.out.println("我也爱你.");
                break;
                } else {
                System.out.println("你在选一次");
            }
        }
    }
}