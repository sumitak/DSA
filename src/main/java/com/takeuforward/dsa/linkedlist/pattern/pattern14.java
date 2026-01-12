package com.takeuforward.dsa.linkedlist.pattern;

public class pattern14 {
    static void main() {

        logic1(4);
        System.out.println();
        logic1(5);

    }

    private static void logic1( int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A'+i; j++) {
                    System.out.print(j);
            }

            System.out.println();
        }
    }


    }





