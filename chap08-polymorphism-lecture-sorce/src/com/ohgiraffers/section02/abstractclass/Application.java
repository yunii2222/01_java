package com.ohgiraffers.section02.abstractclass;

public class Application {
    public static void main(String[] args) {
        /* 추상 클래스와 추상 메소드에 대해 이해할 수 있다. */
//        Product product = new Product();

        SmartPhone smartPhone = new SmartPhone();

        /* 'smartPhone은' 'smartPhone' 타입이기도 하고 'Product' 타입이기도 하다. */
        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);

        /* 따라서 다형성을 적용해 추상 클래스를 레퍼런스 타입으로 활용 가능
        * SmartPhone은 완성 되어있기때문에 가능 */
        Product product = new SmartPhone();

        /* 동적 바인딩이 일어나 SmartPhone의 메소드가 호출 됐음 */
        product.abstMethod();

        /* 추상 클래스가 가지고 있는 메소드도 호출할 수 있다. */
        product.staticMethod();
        product.nonStaticMethod();

        /* 추상클래스를 사용하는 이유?
        * 추상클래스의 추상 메소드는 오버라이딩에 대한 강제정이 부여 된다.
        * 따라서 여러 클래스들은 그룹화하여 필수 기능을 정의하여 강제성을 부여해
        * 개발 시 일관 된 인터페이스를 제공할 수 있다. */
    }
}
