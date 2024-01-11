package com.ohgiraffers.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {
        /* 다향성을 적용하여 객체 배열을 만들어 인스턴스를 연속 처리할 수 있다. */
        Animal[] animals = new Animal[5];

        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        /* 0부터 시작해서 배열의 길이만큼 반복 */
        for (int i = 0; i < animals.length; i++) {
            /* 동적바인딩 - Animal 클래스가 가지는 메소드를 오버라이딩한 메소드가 호출 된다. */
            animals[i].cry();
        }

        /* 각 타입별 고유한 메소드를 동작시키기 위해서는 다운 캐스팅이 명시적으로 필요하다.
        * ClassCastException을 방지하기 위해 instanceof 연산자를 사용한다. */
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Rabbit) {
                /* 다운 캐스팅 */
                ((Rabbit)animals[i]).jump();
                /* 이 tiger라는 인덱스가 animals가 맞나요? */
            } else if (animals[i] instanceof  Tiger) {
                /* 다운 캐스팅 */
                ((Tiger)animals[i]).bite();
            }else {
                System.out.println(" 토끼나 호랑이가 아닙니다. ");
            }

        }
    }
}
