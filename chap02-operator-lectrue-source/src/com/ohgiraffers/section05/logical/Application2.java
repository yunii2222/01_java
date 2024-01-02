package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args) {
        /* 논리 연산자의 우선 순위에 대해 이해하고 이를 활용할 수 있다. */

        /* 1. 1부터 100사이의 값인지 확인 */
        int num1 = 50;

        System.out.println("1부터 100사이의 값인지 확인 :" + (num1 >=1 && num1 <= 100));

        /* 유니코드 확인!!! */
        /* 2. 영어 대문자인지 확인 */
        char ch1 = 'g';
        System.out.println("영어 대문자 인지 확인  : " + (ch1 >= 'A' && ch1 <= 'Z'));

        /* 3. 대소문자 상관 없이 영문자 y인지 확인 */
        char ch2 = 'Y';
        System.out.println("영문자 y인지 확인 :" + (ch2 == 'Y' || ch2 == 'y'));

        /* 4. 영문자인지 확인(대문자 또는 소문자)
        * && 는 || 보다 우선순위가 높다.
        * 괄호로 묶지 않아도 올바르게 연산되지만 논리적으로 먼저 실행 되는 내용을 괄호로 묶어주면 코드 파악이 쉽다. */
        char eng = 'a';
        System.out.println("영문자인지 확인 : " + (( eng >= 'A' && eng <= 'Z' ) || ( eng >='a' && eng <= 'z' )));

        char kor = '가';
        System.out.println("영문자인지 확인 : " + (( kor >= 'A' && kor <= 'Z' ) || ( kor >='a' && kor <= 'z' )));
    }
}
