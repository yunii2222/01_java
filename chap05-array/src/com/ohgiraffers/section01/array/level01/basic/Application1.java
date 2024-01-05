package com.ohgiraffers.section01.array.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        /* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
         * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
         * */

        int[] arr1 = new int[10];

        int value = 0;

        for ( int i = 0; i < arr1.length; i++ ) {
            arr1[i] = value++;
            System.out.print( value + " " );
        }
    }
}
