package com.ohgiraffers.section02.looping_and_branching.level02.normal;

public class Appilcation2 {
    public static void main(String[] args) {
        /* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요
         *
         * -- 출력 예시 --
         * abcdefghijklmnopqrstuvwxyz
         * */

        // 알파벳 'a'부터 'z'까지 출력!
        /* 초기값으로 ch를 'a'로 설정하고, 종료 조건으로 ch <= 'z'를 지정하여 'z'까지 반복합니다.
         * 반복문이 실행될 때마다 ch를 증가시켜 다음 알파벳으로 이동합니다. */
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch);
        }

        // 개행 없이 출력하였으므로, 개행을 추가하여 줄 바꿈
        System.out.println();
    }
}
