package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {
    public static void main(String[] args) {
        /* 와일드 카드에 대해 이해할 수 있다.
        *  제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
        *  그 객체의 타입 변수를 제한할 수 있다. */

        WildCardFarm wildCardFarm = new WildCardFarm();

        /* 1. 매개변수의 타입 제한이 없는 경우 */
        wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));
        
        /* 2. 매개변수의 "타입이 바니"거나 "바니하위(후손) 토끼"를 가진 "토끼농장"만이 인자로 전달가능 */
//        wildCardFarm.extendsType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));

        /* 3. 매개변수의 "타입이 바니"거나 "바니상위(부모) 토끼"를 가진 "토끼농장"만이 인자로 전달가능*/
        wildCardFarm.superType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));





    }
}
