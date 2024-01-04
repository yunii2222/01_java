package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public static void main(String[] args) {
        /* if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* 정수 1개를 입력 받아 짝수면 "입력하신 숫자는 짝수입니다." 라고 출력한다.
         * 짝수가 아니면 출력하지 않는다. 단, 조건과 무관하게 종료 시 "프로그램을 종료합니다." 라고 출력한다. */
    }

    public void testSimpleIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력 : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다");
    }

    public void testNestedIfStatement() {
        /* 중첩 된 if문의 흐름을 이해하고 적용할 수 있다. */

        /* 정수 1개를 입력 받아 그 수가 양수인지를 확인하고 그 수가  짝수면 "입력하신 숫자는 짝수입니다." 라고 출력한다.
         * 짝수가 아니면 출력하지 않는다. 단, 조건과 무관하게 종료 시 "프로그램을 종료합니다." 라고 출력한다. */
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력 : ");
        int num = sc.nextInt();

        //만약 num이 0보다 크다 맞다면,
        if (num > 0) {
            // num 에서 2를 나눈 나머지 값이 0 과 같다면 아래 코드를 출력한다.
            if (num % 2 == 0) {
                System.out.println("입력하신 숫자는 짝수입니다.");

            }
        }
        //아니라면 아래 코드를 출력한다.
        System.out.println("프로그램을 종료합니다");
    }
}
