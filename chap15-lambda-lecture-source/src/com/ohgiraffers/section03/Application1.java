package com.ohgiraffers.section03;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.function.BiFunction;

public class Application1 {
    public static void main(String[] args) {
        /* 메소드 참조에 대해 이해하고 사용할 수 있다. */
        BiFunction<String, String, Boolean> biFunction;
        /* str1과 str2의 문자열이 같으면 true가 반환, 다르면 false를 반환 */
        String str1 = "냐냐";
        String str2 = "뇨뇨";
        biFunction = (x,y) -> x.equals(y);
        System.out.println(biFunction.apply(str1, str2));

        /*  */
        biFunction = String :: equals;
        System.out.println(biFunction.apply(str1,str2));
    }
}
