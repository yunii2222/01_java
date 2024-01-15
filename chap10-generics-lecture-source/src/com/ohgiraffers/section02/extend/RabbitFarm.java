package com.ohgiraffers.section02.extend;

/* "Rabbit"타입만 상속가능하게 제네릭 해줌 */
//public class RabbitFarm<T extends Rabbit> {}

/* "인터페이스"타입파일의 경우에도 "extends"키워드 사용 */
//public class RabbitFarm<T implements Animal> {}
//public class RabbitFarm<T extends Animal> {}

public class RabbitFarm <T extends Rabbit>{
    /* 타입 변수는 아직 어떤 토끼가 될 지 모른다. 다만 토끼이거나 토끼의 후손만 가능하다. */
    public T animal;

    /* 기본 생성자 */
    public RabbitFarm() {
    }

    /* 매개변수 생성자로 초기화*/
    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    /* 세터 메서드 */
    public void setAnimal(T animal) {
        this.animal = animal;
    }

    /* 게터 메서드 */
    public T getAnimal() {
        return animal;
    }
}
