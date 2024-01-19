package com.ohgiraffers.section02.intermediate;

import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        /* 스트림의 중간 연산 중 하나인 map에 대해 이해하고 사용할 수 있다.
        * map은 스트림에 들어 있는 데이터를 특정 람다식을 통해 가공하고 새로운 스트림에 담아주는 역할을 한다.*/
        IntStream intStream = IntStream.range(1,10);
        /* map은 인트값으로 반환해준다.
        *        filter에서 짝수를 골라내고,  map에서 그 짝수에서 모두 5를 곱해줌 */
        intStream.filter(i -> i % 2 == 0).map(i -> i * 5).forEach(System.out::println);
    }
}
