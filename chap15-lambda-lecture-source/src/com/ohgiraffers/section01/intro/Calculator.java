package com.ohgiraffers.section01.intro;
/* 내부에 하나의 추상 메소드가 선언 된 인터페이스만 람다식의 타깃이 될 수 있다.
* 내부에 인터페이스가 하나만 생성되어 있는걸 FunctionalInterface라고 한다.*/
@FunctionalInterface
public interface Calculator {
    
    public int sumTwoNumber(int a, int b);

//    public int minusTwoNumber(int a, int b); -> 추상 메소드가 2개 이상이면 컴파일 에러 발생
}
