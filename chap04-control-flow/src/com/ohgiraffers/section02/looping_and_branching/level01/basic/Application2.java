package com.ohgiraffers.section02.looping_and_branching.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 1부터 5까지의 합 : 15
         *
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println(" 정수를 입력하세요 : ");
        int num = sc.nextInt();

        int total = 0;

        for ( int i = 1; i <= num; i++ ) {
            total += i;
        }
        System.out.println( " 1부터 " + num + " 까지의 합 : " + total );
    }
}
