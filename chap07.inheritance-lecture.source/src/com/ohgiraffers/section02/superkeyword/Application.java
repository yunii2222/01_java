package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        /* super와 super()에 대해 이해할 수 있다. */

        /* product 기본 생성자 */
        Product pr1 = new Product();
        System.out.println(pr1.getInformation());

        Product pr2 = new Product("ㄹㄹ", "ㅇㅇ","ㅇㅇ", 999, new Date());
        System.out.println(pr2.getInformation());
        System.out.println("  ");

        /* Computer 기본 생성자 */
        System.out.println("Computer 기본 생성자 ");
        Computer cp1 = new Computer();
        System.out.println(cp1.getInformation());
        System.out.println("  ");

        /* Computer 모든 필드 초기화 생성자 */
        System.out.println("Computer 모든 필드 초기화 생성자 ");
        Computer cp2 = new Computer("didi", 844, 14, "안드로이드");
        System.out.println(cp2.getInformation());
        System.out.println("  ");

        /* Product, Computer 모든 필드 초기화 생성자 */
        System.out.println("Product, Computer 모든 필드 초기화 생성자 ");
        Computer cp3 = new Computer("ㄹㄹ", "ㅇㅇ","ㅇㅇ", 999, new Date(), "didi", 844, 14, "안드로이드");
        System.out.println(cp3.getInformation());
    }
}
