package com.ohgiraffers.section01.method;

public class Appilcation4 {
    public static void main(String[] args) {
        Appilcation4 app4 = new Appilcation4();
        app4.testMethod("오나윤", 25, "여자");
        // 매개변수의 타입, 개수, 순서가 모두 일치해야 전달 인자를 올바르게 전달할 수 있다.

        /* 변수에 저장 된 값을 전달하며 호출 */
        String name = "박호범";
        int age = 27;
        final String gender = "남자";

        app4.testMethod(name, age, gender);
    }
    /* 다른 지역이기때문에 같은 이름이 사용해도 상관이 없다. */
    public void testMethod(String name, int age, final String gender) {
        /* 매개변수도 일종의 지역 변수로 분류 된다. final 키워드도 사용 가능하다.
        * 단, final 매개변수는 상수 네이밍 규칙을 선택적으로 따라는 경향이 있다. */
        System.out.println("얘! 너 이름은 " + name + "이고, " + "나이는 " + age +"세 이며, 성별은 " + gender + " 입니다 ^^*");
    }
}
