package com.ohgiraffers.section01.intro;

/* 외부 인터페이스 */
public interface OuterCalculator {
    /* 외부안에 있는 내부 인터페이스
    *  내가 하나의 외부인터페이스를 만들고, 내부인터페이스를 여러개를 만들어서 쉽게 관리하겠다. */
    @FunctionalInterface
    public interface Sum {
        
        /* 꼭 선언해주어야 에러가 안뜸 */
        int sumTeoNumber(int a, int b);
    }
    @FunctionalInterface
    public interface Minus{
        int minusTeoNumber(int a, int b);
    }
    @FunctionalInterface
    public interface Multiple{
        int multipleTeoNumber(int a, int b);
    }
    @FunctionalInterface
    public interface Divide{
        int divideTeoNumber(int a, int b);
    }

}
