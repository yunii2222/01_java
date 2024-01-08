package com.ohgiraffers.section02.encapsulation.problem1;

public class Application1 {
    public static void main(String[] args) {
        /* 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해한다. */

        Monster monster1 = new Monster();

        monster1.name = "한치";
        monster1.hp = 200;

        System.out.println(  "monster1의 name : " + monster1.name );
        System.out.println( "monster1의 hp : " + monster1.hp );

        Monster monster2 = new Monster();

        monster2.name = "두치";
        monster2.hp = 100;

        System.out.println(  "monster2의 name : " + monster2.name );
        System.out.println( "monster2의 hp : " + monster2.hp );


        /* hp는 음수일 수 없다.
        *필드에 올바르지 않은 값이 들어가도 통제가 불가능하다는 것이 직접 접근의 문제점이다. */
        Monster monster3 = new Monster();

        monster3.name = "세치";
        monster3.SetHp(-300);

        System.out.println(  "monster3의 name : " + monster3.name );
        System.out.println( "monster3의 hp : " + monster3.hp );
    }

}
