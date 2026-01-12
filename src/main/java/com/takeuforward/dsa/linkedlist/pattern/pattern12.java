package com.takeuforward.dsa.linkedlist.pattern;

public class pattern12 {
    static void main() {

        logic1(4);
        System.out.println();
        logic1(5);

    }

    private static void logic1( int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
            }

            System.out.println();
        }
    }


    }





