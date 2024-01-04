package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {
    public void printGugudanFromTwoToNine() {
        /* 2단부터 단을 1씩 증가시켜서 9단까지 출력하는 중첩 for문 */

        for ( int gugu = 2; gugu < 10; gugu++) {
            System.out.println( "=====" + gugu + "=====" );

            for ( int su = 1; su < 10; su++ ) {
                System.out.println( gugu + "*" + su + "=" + ( gugu * su ) );
            }
        }
    }

    public void printStarInputRowTimes() {
        /* 키보드 정수를 하나 입력 받아 해당 정수만큼 한 행에 "*"을 5개씩 출력하기 */

        Scanner sc =  new Scanner(System.in);
        System.out.println("출력할 행 수 입력 : ");
        int row = sc.nextInt();

        for ( int i = 1; i <= row; i++ ) {
            /* 별을 5개 출력하는 것을 반복 */
            for ( int j = 1; j <= 5; j++ ) {
                System.out.print("*");
            }
            /* 개행 */
            System.out.println();
        }
    }

    public void printTriangeStar(){
        /* 키보드로 정수를 하나 입력 받아 해당 정수만큼 한 행에 "*"을 번호개씩 출력 */

        Scanner sc =  new Scanner(System.in);
        System.out.println( "출력할 행 수 입력 : " );
        int star = sc.nextInt();

        for ( int i = 1; i <= star; i++ ) {
            /* 행 수만큼 별을 출력하는 반복문 */
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            /* 개행 */
            System.out.println();
        }
    }
}
