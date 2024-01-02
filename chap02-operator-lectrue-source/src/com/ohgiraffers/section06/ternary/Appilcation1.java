package com.ohgiraffers.section06.ternary;

public class Appilcation1 {
    public static void main(String[] args) {
        /* 삼항 연산자에 대해 이해하고 활용할 수 있다. */
        int num1 = 10;
        int num2 = -10;
        // num1은 0보다 크기 때문에 result1는 "양수다"가 나오고,
        String result1 = ( num1 > 0 ) ? "양수다." : "양수가 아니다.";
        // num2은 0보다 작기 때문에 result2는 "양수가 아니다"가 나온다.
        String result2 = ( num2 > 0 ) ? "양수다." : "양수가 아니다.";

        System.out.println( "num1은" + result1);
        System.out.println( "num2은" + result2);

        /* 중첩 사용도 가능하다. */
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = ( num3 > 0 ) ? "양수다." : ( num3 == 0 ) ? "0이다.": "음수다.";
        String result4 = ( num4 > 0 ) ? "양수다." : ( num4 == 0 ) ? "0이다.": "음수다.";
        String result5 = ( num5 > 0 ) ? "양수다." : ( num5 == 0 ) ? "0이다.": "음수다.";

        System.out.println( "num3는" + result3);
        System.out.println( "num4는" + result4);
        System.out.println( "num5는" + result5);

    }
}
