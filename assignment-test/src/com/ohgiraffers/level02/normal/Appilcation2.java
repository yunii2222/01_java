package com.ohgiraffers.level02.normal;

public class Appilcation2 {
    public static void main(String[] args) {

        double subject1 = 80.5;
        double subject2 = 50.6;
        double subject3 = 70.8;

        int subjeactAll = (int) (subject1 + subject2 + subject3);
        int subjeact = (int) (subject1 + subject2 + subject3) / 3;

        System.out.println( "총점 : " + subjeactAll );
        System.out.println( "평균 : " + subjeact );
        /* 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
         * 총점과 평균을 정수 형태로 출력하세요
         *
         * -- 출력 예시 --
         * 총점 : 201
         * 평균 : 67
         *  */
    }
}
