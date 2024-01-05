package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        /* 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램 */

        // 5명의 배열
        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);

        // 배열의 길이만큼까지 점수 작성 질문이 반복된다.
        for ( int i = 0; i < scores.length; i++ ){
            System.out.print( ( i + 1 ) + " 번째 학생의 자바 점수 입력 : " );
            scores[i] = sc.nextInt();
        }

/*      //다른 방법
        for ( int i = 1; i <= scores.length; i++ ){
            System.out.print( (i) + " 번째 학생의 자바 점수 입력 : " );
            scores[i] = sc.nextInt();
        }*/
        
        // 합계의 초기값 설정
        int sum = 0;
        // 평균의 초기값 설정
        double avg = 0.0;

        //5명의 점수 합계 구하는 for문 공식
        for ( int i = 0; i < scores.length; i++ ) {
            sum += scores[i];
        }
        //5명의 점수 평균을 구하는 공식
        avg = (double) sum / scores.length ;

        // 5명의 합계와 평균을 구한 sout!!
        System.out.print( " 합계는 : " + sum + "점 이고, 평균은 : " + avg + "점 이다."  );
    }
}
