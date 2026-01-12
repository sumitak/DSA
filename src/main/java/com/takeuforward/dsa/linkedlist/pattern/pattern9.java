package com.takeuforward.dsa.linkedlist.pattern;

public class pattern9 {
    static void main() {
        logic1();
        System.out.println("second simple logic");
        logic2();

    }

    private static void logic2() {
        int n = 5;
        for(int i = 1; i <=2*n-1; i++) {
            int noOfStarsToPrint = i;
            if(i > n) {
                noOfStarsToPrint = 2*n - i;
            }
            for(int j = 1; j <= noOfStarsToPrint; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void logic1() {
        int n = 5;
        for (int i = 0; i < n*2; i++) {
            if(i < n) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int k = 0; k < 2*n-i-1  ; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }




}
