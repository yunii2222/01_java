package com.ohgiraffers.section02.demensional;

public class Application4 {
    public static void main(String[] args) {
        /* 2차원 배열의 선언과 할당 및 초기화를 동시에 할 수 있다. */

        /* 정변배열 */
        int[][] iarr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        /* 가변배열 */
        int[][] iarr2 = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        /* 미리 할당 된 배열을 이용한 방식 */
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[][] iarr3 = {arr1, arr2};

        for ( int i = 0; i < iarr3.length; i++ ){
            // 그 1차원 배열의 길이 값을 알고
            for (int j = 0; j < iarr3[i].length; j++ ) {
                // 앞에는 '행' 뒤에는 '열'
                System.out.println(iarr3[i][j] + " " );
            }
        }
    }
}
