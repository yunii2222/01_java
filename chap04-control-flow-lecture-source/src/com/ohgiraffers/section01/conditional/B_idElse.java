package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_idElse {
    public static void main(String[] args) {

    }

    public void testSimpleIfelseStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력 : ");
        int num = sc.nextInt();
        //num % 2 != 0
        if (num % 2 == 1) {
            System.out.println("입력하신 숫자는 홀수입니다.");
        } else {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다");
    }

    public void testNestedIfelseStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력 : ");
        int num = sc.nextInt();

        if ( num != 0 ) {
            //num % 2 != 0 와 같음
            if (num % 2 == 1) {
                // 짝수인경우에는 아래 프로그램이 출력됩니다.
                System.out.println("입력하신 숫자는 홀수입니다.");
                //// 홀수인경우에는 아래 프로그램이 출력됩니다.
            } else {
                System.out.println("입력하신 숫자는 짝수입니다.");
            }
            System.out.println("프로그램을 종료합니다");
            // 0인경우에는 아래 프로그램이 출력됩니다.
        } else {
            System.out.println(" 0입니다. ");
        }
    }
}
