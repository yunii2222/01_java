package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {
        /* 다른 클래스에 작성된 메소드를 호출할 수 있다. */
        int first = 100;
        int second = 50;

        /* 1. non-static 메소드 호출
         * 클래스가 다르더라도 사용하는 방법은 동일하다
         * 클래스명 사용할이름 = new 클래스명();
         * 사용할이름.메소드명();
         */
        Calulator calulator = new Calulator();
        int min = calulator.minNumberOf(first, second);
        System.out.println("두 수 중 최소값은? : " + min);

        /* 2. static 메소드 호출 */
        int max = Calulator.maxNumberOf(first, second);
        System.out.println("두 수 중 최대값은? : " + max);

        /* 주의사항
        * 노란색 줄 : 경고!! (에러는 나지 않음) */
        int max2 = calulator.maxNumberOf(first, second);
        System.out.println("두 수 중 최대값은? : " + max2);


    }
}
