package com.takeuforward.dsa.linkedlist.pattern;

public class pattern5 {
    static void main() {
        logic1();
        logic2();
        logic3();
    }

    public static void logic1() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }

    public static void logic2() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }

    public static void logic3() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 1+n-i; j++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
}
