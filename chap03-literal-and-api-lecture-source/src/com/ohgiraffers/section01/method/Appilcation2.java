package com.ohgiraffers.section01.method;

public class Appilcation2 {
    public static void main(String[] args) {
        /* 다른 흐름의 메소드 호출에 대해 이해할 수 있다. */
        System.out.println("main 메소드 시작됨...");
        
        Appilcation2 app2 = new Appilcation2();

        /* 호출한다. */
        app2.methodA();
        app2.methodB();
        app2.methodC();

        System.out.println("main 메소드 종료됨...");
    }

    /* 선언한다. */
    public void methodA() {
        System.out.println("methodA 메소드 시작됨...");
        System.out.println("methodA 메소드 반환됨...");
    }

    /* 선언한다. */
    public void methodB() {
        System.out.println("methodB 메소드 시작됨...");
        System.out.println("methodB 메소드 반환됨...");
    }

    /* 선언한다. */
    public void methodC() {
        System.out.println("methodC 메소드 시작됨...");
        System.out.println("methodC 메소드 반환됨...");
    }
}
