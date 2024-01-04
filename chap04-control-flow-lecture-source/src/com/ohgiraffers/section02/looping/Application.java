package com.ohgiraffers.section02.looping;

import com.ohgiraffers.section01.conditional.B_idElse;

public class Application {
    public static void main(String[] args) {
        A_for a_for = new A_for();
//        a_for.testSimpleForStatement();
//        a_for.testForExample1();
//        a_for.testForExample2();
//        a_for.testForExample3();
//        a_for.testForExample4();
//        a_for.printSimpleGugudan();


        A_nestedFor a_NestedFor = new A_nestedFor();
//        a_NestedFor.printGugudanFromTwoToNine();
//        a_NestedFor.printStarInputRowTimes();
//          a_NestedFor.printTriangeStar();

        B_while b_while = new B_while();
//        b_while.testSimpleWhileStatement();
//        b_while.testWhileExample1();
//        b_while.testWhileExample2();
//        b_while.testWhileExample3();

        C_doWhile c_doWhile = new C_doWhile();
        c_doWhile.testSimpleWhileStatement();
    }
}
