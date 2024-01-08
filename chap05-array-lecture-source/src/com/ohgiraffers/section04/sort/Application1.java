package com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        /* 배열 정렬하기 */
        int[] arr = { 2, 3, 4, 6, 1, 5 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        /* 정렬 알고리즘 학습에 앞서 변수의 두 값을 변경하는 방법에 대해 먼저 학습한다. */
        int num1 = 10;
        int num2 = 20;

        System.out.println( " num1 : " + num1 );
        System.out.println( " num2 : " + num2 );

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println( " num1 : " + num1 );
        System.out.println( " num2 : " + num2 );

        /* 배열의 인덱스에 있는 값도 서로 변경할 수 있다. */

        int[] arr2 = {2, 1, 3};

        // 2를 temp2라는 공간에 저장해두고,
        int temp2 = arr2[0];

        arr2[0] = arr2[1];

        arr2[1] = temp2;

        System.out.println(Arrays.toString(arr2));

    }
}
