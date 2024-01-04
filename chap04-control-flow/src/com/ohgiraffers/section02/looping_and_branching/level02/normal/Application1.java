package com.ohgiraffers.section02.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* 문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요
         *
         * 참고) 문자열의 길이는 String 클래스의 length() 메소드를 이용할 수 있습니다.
         *
         * -- 입력 예시 --
         * 문자열을 입력하세요 : apple
         *
         * -- 출력 예시 --
         * 0 : a
         * 1 : p
         * 2 : p
         * 3 : l
         * 4 : e
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println( " 문자열을 입력하세요 : " );
        String str = sc.nextLine();

        for ( int i = 0; i < str.length(); i++ ) {
            /* str: 문자열 변수입니다.
            * i: 인덱스 변수로, 문자열에서 가져올 문자의 위치를 나타냅니다.
            * charAt(i): 문자열에서 i 위치에 있는 문자를 반환하는 메서드입니다.
            * char ch: 반환된 문자를 저장하는 변수입니다. */
            /* str: 문자열 변수입니다. */
            char ch = str.charAt(i);
            System.out.println( i + " : " + ch );
        }
    }
}
