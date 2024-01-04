package com.ohgiraffers.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* 국어, 영어, 수학 점수를 입력받아

         * 평균 점수가 60점 이상이면서 각 과목이 40점 이상인 조건이 만족하면 "합격입니다!" 를 출력하세요,

         * 단, 합격이 아닌 경우 불합격 사유가 무엇인지를 모두 출력해주어야 합니다.

         * 평균점수 미달인 경우 "평균점수 미달로 불합격입니다." 라고 출력하고,

         * 과목당 과락 점수가 있는 경우 "xx 과목의 점수 미달로 불합격 입니다." 출력하세요.
         *
         * -- 입력 예시 --
         * 국어 점수를 입력하세요 : 60
         * 영어 점수를 입력하세요 : 30
         * 수학 점수를 입력하세요 : 20
         *
         * -- 출력 예시 --
         * 평균 점수 미달로 불합격입니다.
         * 영어 점수 미달로 불합격입니다.
         * 수학 점수 미달로 불합격입니다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print( " 국어 점수를 입력하세요 :  " );
        int subject1 = sc.nextInt();

        System.out.print( " 영어 점수를 입력하세요 : " );
        int subject2 = sc.nextInt();

        System.out.print( " 수학 점수를 입력하세요 : " );
        int subject3 = sc.nextInt();

        int average = (subject1 +  subject2 + subject3 ) / 3;

        // 국어가 40점 이상일때 그리고 영어가 40점 이상일때 그리고 수학이 40점 이상일때 그리고 평균 60점 이상이어야
        if (subject1 >= 40 && subject2 >= 40 && subject3 >= 40 && average >= 60) {
            // 합격을 출력하고
            System.out.println("합격입니다!");
            //국어가 40점 이하일때 그리고 영어가 40점 이하일때 그리고 수학이 40점 이하일때 그리고 평균이 60점 이하일때
        } else {
            // 불합격 출력. 그리고 불합격일때
            System.out.print("불합격 사유: ");
            // 각 과목이 40점 미만인 경우 해당 과목을 출력
            // 국어가 40점 미만인 경우 불합격 출력
            if (subject1 < 40) {
                System.out.println("국어 과목의 점수 미달로 불합격입니다.");
            }
            // 국어가 40점 미만인 경우 불합격 출력
            if (subject2 < 40) {
                System.out.println("영어 과목의 점수 미달로 불합격입니다.");
            }
            // 국어가 40점 미만인 경우 불합격 출력
            if (subject3 < 40) {
                System.out.println("수학 과목의 점수 미달로 불합격입니다.");
            }
            // 평균이 60점 미만인 경우 불합격 출력
            if (average < 60) {
                System.out.println("평균점수 미달로 불합격입니다.");
            }
        }
    }
}
