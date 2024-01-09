package com.ohgiraffers.section06;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod() {
        this.count++;
        System.out.println( " 논스태틱메소드 호출 됨... " );


    }
    public static void staticMethod() {
        /* static 메소드는 인스턴스를 생성하지 않고 사용하는 메소드가 */
//        this.count++;
        System.out.println( " 스태택메소드 호출 됨... " );
    }
}
