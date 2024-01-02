package com.ohgiraffers.section01.method;

public class Appilcation1 {
    public static void main(String[] args) {
        /* method main 영역 */
        /* 메소드의 호출 흐음에 대해 이해할 수 있다. */
        System.out.println("main 메소드 시작...");

        /* 작성한 메소드를 호출한다.
        * 클래스명 사용할이름 = new 클래스명();
        * 사용할이름.메소드명(); */

        Appilcation1 app1 = new Appilcation1();
        app1.methodA();

        System.out.println("main 메소드 종료...");
    }
    public void methodA() {
        /* methodA 영역 */
        System.out.println("methodA 호출됨...");
        /* methodB 호출 */
        methodB();

        System.out.println("methodA 종료됨...");
    }
    public void methodB() {
        /* methodB 호출 */
        System.out.println("methodB 호출됨...");
        /* methodC 호출 */
        methodC();

        System.out.println("methodB 종료됨...");
    }
    public void methodC() {
        /* methodC 영역 */
        System.out.println("methodC 호출됨...");
        System.out.println("methodC 종료됨...");


    }
}
