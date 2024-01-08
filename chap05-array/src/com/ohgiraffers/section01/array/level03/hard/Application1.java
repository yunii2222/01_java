package com.ohgiraffers.section01.array.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* 홀수인 양의 정수를 입력 받아 입력 받은 크기 만큼의 정수형 배열을 할당하고
         * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
         * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값 넣어 출력하세요
         *
         * 단, 홀수인 양의 정수를 입력하지 않은 경우에는 "양수 혹은 홀수만 입력해야 합니다."를 출력하세요
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 7
         *
         * -- 출력 예시 --
         * 1 2 3 4 3 2 1
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 8
         *
         * -- 출력 예시 --
         * 양수 혹은 홀수만 입력해야 합니다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println( " 홀수인 양의 정수를 입력하세요 : " );
        int num = sc.nextInt();

        if ( num % 2 == 1 ) {
            int[] arr1 = new int[num];
            /* 나누기한 값이 소수점이기때문에 int를 앞에 넣어주었다.
            * ex) 7 / 2 = 3.5 (3)  */
            int middle = (int) (num / 2 + 1);
            int total = 0;

            for ( int i = 0; i < middle; i++ ) {
                arr1[i] = ++total;
            }
            for ( int i = 0; i < arr1.length; i++ ) {
                arr1[i] = --total;
            }

            for ( int i = 0; i < arr1.length; i++ ) {
                System.out.print( arr1[i] + " " );
            }

        } else {
            System.out.println(" 양수 혹은 홀수만 입력해야 합니다. ");
        }

    }
}
