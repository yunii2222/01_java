package com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Applicaton6 {
    public static void main(String[] args) {
        /* 중복제거
        * 5개 길이의 배열에 1~10 사이의 랜덤 값을 "중복 값 없이" 담기 */

        //5개 길이의 배열에
        int[] arr = new int[5];

        for ( int i = 0; i < arr.length; i++ ){
            //1~10 사이의 랜덤 값을
            arr[i] = (int) (Math.random() * 10) + 1;

            //i가 0번일때는 돌지않고(i가 0이기 때문), 1번일때부터 돈다.
            for ( int j = 0; j < i; j++ ) {
                if( arr[i] == arr[j] ) {
                    System.out.println( j + "인덱스와" + i + " 인덱스의 값 " + arr[i] + " 로 중복 발생 " );
                    //--를 해주면 다시 돈다
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
