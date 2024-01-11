package com.ohgiraffers.section03.interfaceimplements;

/* 인터페이스는 '구현한다' 라는 의미로 implements라는 키워드를 사용한다.
* 또한 다중 상속이 가능한데, implements 뒤에 인터페이스를 나열하면 된다.
* 클래스 상속을 하면서 인터페이스 구현도 가능하다. */

public class Product implements InterProduct, java.io.Serializable {
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의  nonStaticMethod 오버라이딩 한 메소드 호출...");
    }

    @Override
    public void abstMethod() {
        System.out.println("InterProduct의  abstMethod 오버라이딩 한 메소드 호출...");
    }

    /* static메소드는 오버라이딩 불가능 */
//    @Override
//    public static void staticMethod(){}

    /* default 키워드는 인터페이스 내에서만 작성 가능하다. */
//    @Override
//    public default void staticMethod(){}
    
    /* default를 빼면 오버라이딩 가능 */
    @Override
    public void defaultMethod(){
        System.out.println("InterProduct 인터페이스의 defaultMethod 호출...");
    }
}

