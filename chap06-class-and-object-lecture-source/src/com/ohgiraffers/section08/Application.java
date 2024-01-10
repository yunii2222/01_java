package com.ohgiraffers.section08;

public class Application {
    public static void main(String[] args) {
        /* 초기화 블럭의 동작 순서를 이해하고 이를 활용하여 인스턴스를 생성할 수 있다 */

        Product pd1 = new Product();
        /* 4번째로 실행
        * 그러고 2번부터 다시 실행 */
        System.out.println(pd1.getInformation());

        Product pd2 = new Product( "넨" , 40000, "쀼");
        System.out.println(pd2.getInformation());
    }
}
