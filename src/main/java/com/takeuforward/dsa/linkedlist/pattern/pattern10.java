package com.takeuforward.dsa.linkedlist.pattern;

public class pattern10 {
    static void main() {
        logic1();
        System.out.println("think about it with reminder output");
        logic2();

    }

    private static void logic2() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                    System.out.print((i+j+1)%2);
            }
            System.out.println();
        }
    }

    private static void logic1() {
        int n = 5;
        int start = 0;
        for (int i = 0; i < n; i++) {
            if(i%2==0) {
                start=1;
            }
                for (int j = 0; j <= i; j++) {
                    System.out.print(start);
                    start = 1 - start;
                }
                System.out.println();
            }
        }

    }





