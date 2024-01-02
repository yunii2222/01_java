package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* java.util.Scanner 를 이용한 다양한 자료형 값 입력 받기 */

        /* 1. Scanner 객체 생성 */
        Scanner sc = new Scanner(System.in);

        /* 2. 자료형별 값 입력 받기 */
        /* 2-1. 문자열 입력 받기 : nextLine() - 입력 받은 값을 문자열로 반환 */
        /* print 뒤에 ln을 붙여주면 줄바꿈 된다. */
        System.out.print( "이름을 입력하세요 : " );
        String name = sc.nextLine();
        System.out.println( "입력하신 이름은 : " + name + "입니다" );
        
        /* 2-2. 정수형 입력 받기: nextInt() - 입력 받은 값을 int형으로 반환 */
        System.out.print( "나이를 입력하세요 : " );
        int age = sc.nextInt();
        System.out.println( "입력하신 나이를 : " + age + "세 입니다" );
    }
}
