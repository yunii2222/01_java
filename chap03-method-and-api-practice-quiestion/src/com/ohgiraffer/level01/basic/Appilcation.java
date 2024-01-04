package com.ohgiraffer.level01.basic;

public class Appilcation {
    public static void main(String[] args) {
        // 합계를 담을 변수
        int sum = 0;

        int first = 5;
        int second = 10;
        int three = 20;

        Calculator calculator = new Calculator();

        Appilcation app1 = new Appilcation();

        //메소드 호출 확인용 메소드 호출
        calculator.checkMethod();

        //함수를 호출하여 1~10까지의 합을 리턴 받아 출력
        // i 는 1이고, i 가 10보다 작거나 같을때까지 i가 1씩 증가하며 반복
        for ( int i = 1; i <= 10; i++) {
            //sum += i; 로도 사용가능
            // sum이 i씩 증가하며 리턴
            sum = sum + i;
        }
        System.out.println("1부터 10까지의 합 : " + sum );

        //10, 20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출
        System.out.println("두 수 중 큰 수는 : " + app1.checkMaxNumber(second, three) + "이다.");

        //10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
        System.out.println("10과 20의 합은 : " + app1.sumTwoNumber(second, three));

        //10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
        System.out.println("10과 5의 차는 : " + app1.minusTwoNumber(first, second));
    }

    public static int checkMaxNumber(int second, int three) {
        return second > three ? second : three;
    }
    public int sumTwoNumber(int second, int three) {
        return second + three;
    }
    public int minusTwoNumber(int first, int second) {
        return second - first;
    }
}
