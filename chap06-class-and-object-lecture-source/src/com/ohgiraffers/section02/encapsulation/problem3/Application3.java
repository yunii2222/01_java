package com.ohgiraffers.section02.encapsulation.problem3;

public class Application3 {
    public static void main(String[] args) {
        /* 필드에 직접 접근 시 발생하는 문제를 해결하는 방법을 이해하고 적용할 수 있다. */

        /* Monster 클래스의 필드를 name -> kinds로 변경하면 setInfo, getInfo 메소드 내의 코드는 변경이 필요함.
        * 하지만 사용자의 호출코드는 변경하지 않아도 된다. 따라서 유지보수성이 향상 된다!! */
        Monster monster1 = new Monster();
        monster1.setInfo("한치");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setInfo("두치");
        monster2.setHp(200);

        Monster monster3 = new Monster();
        monster3.setInfo("세치");
        monster3.setHp(300);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());

        /*-------------------------------------------------------------------------*/
        
        /* 캡슐화 */

        monster3.kinds = "두치";
        monster3.hp = -200;
        System.out.println(" monster3 의 kinds : " + monster3.kinds);
        System.out.println(" monster3 의 hp : " + monster3.hp);
        
        // => 메소드...
    }
}
