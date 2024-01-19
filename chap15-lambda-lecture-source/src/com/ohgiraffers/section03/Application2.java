package com.ohgiraffers.section03;

import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {
        /* 생성자 메소드 참조를 이해하고 사용할 수 있다. */

        /* 매개변수 있고, 반환형도 있다 매개변수는 문자열이고, 반환값은 Member*/
        Function<String, Member> function = Member ::new;
        Member member1 = function.apply("Function Lambda1");
        Member member2 = function.apply("Function Lambda2");

        System.out.println(member1);
        System.out.println(member2);
    }

}
