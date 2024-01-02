package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {
    public static void main(String[] args) {
        /* jav.util.Random 클래스를 활용하여 사용자 지정 범위의 난수를 발생시킬 수 있다.
        * nextInt ( int bound ) 0부터 매개변수로 전달 받은 정수 범위까지의 난수를 발생시켜 정수 형태로 반환
        * 공식 : random.nextTnt( 구하려는 난수의 갯수 ) + 구하려는 난수의 최소값 */
        Random random = new Random();


        /* 1. 0 ~ 9 범위의 난수 발생 */
        int randomNumber1 = random.nextInt(10);
        System.out.println(" 0 ~ 9 범위의 난수 : " + randomNumber1);

        /* 2. 1 ~ 10 사이의 난수 발생 */
        int randomNumber2 = random.nextInt(10) + 1;
        System.out.println("1 ~ 10 사이의 난수 : " + randomNumber2);

        /* 3. 10 ~ 15 사이의 난수 발생
         * 10,11,12,13,14,15 -> 6개
         * 10 ~ 15의 숫자중 최소값 -> 10 */
        int randomNumber3 = random.nextInt( 6 ) + 10 ;
        System.out.println("10 ~ 15 사이의 난수 : " + randomNumber3);

        /* 4. -128 ~ 127 사이의 난수 발생 */
        int randomNumber4 = random.nextInt( 256 ) - 128 ;
        System.out.println("-128 ~ 127 사이의 난수 : " + randomNumber4);
    }
}
