package com.ohgiraffers.section02.intermediate;

import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        /* 스트림의 중간 연산 중 하나인 filter에 대해 이해하고 사용할 수 있다.
        * IntStream이 가지고 있는 range를 intStream에 넣고,  */
        IntStream intStream = IntStream.range(0,10);
        /* 필터는 스트림에서 특정 데이터만 걸러내는 메소드로
         매개변수로 받는 predicate는 boolean을 리턴하는 함수형 인터페이스이다
         내가 가지고 있는 i 값을 i에서 2를 나눈 값을 필터링 해주고 결과를 가져온다 */
        intStream.filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));
    }
}
