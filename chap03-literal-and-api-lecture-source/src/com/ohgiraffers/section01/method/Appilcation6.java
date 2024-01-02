package com.ohgiraffers.section01.method;

public class Appilcation6 {
    public static void main(String[] args) {
        /* 메소드 리턴 값을 이해하고 활용할 수 있다. */

        Appilcation6 app6 = new Appilcation6();
        app6.testMethod();
        /* 1. 메소드의 반환 값이 있을 경우 반환 값을 변수에 담을 수 있다. */
        String returnText = app6.testMethod();
        System.out.println( "returnText : " + returnText);

        /* 2. 변수에 저장하지 않고 바로 출력도 가능하다. */
        System.out.println("returnText : " + app6.testMethod());

    }

    /*  String타입 */
    public String  testMethod() {
        /* public 뒤에 바로 return;으로 가지고 갈 타입을 명시한다.
         * 아무 값도 리턴하지 않는 경우 void, 값을 반환하는 경우에는 반환값의 자료형을 작성해야 한다.*/
        return "Hello world";
    }
}
