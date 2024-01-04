package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {
        A_if a_if = new A_if();
    //  a_if.testSimpleIfStatement();
    //  a_if.testNestedIfStatement();

        B_idElse b_idElse = new B_idElse();
    //  b_idElse.testSimpleIfelseStatement();
    //  b_idElse.testNestedIfelseStatement();

        C_ifElseIf c_ifElseIf = new C_ifElseIf();
    //  c_ifElseIf.testSimpleIfelseStatement();
    //  c_ifElseIf.testNestedIfelseStatement();
        c_ifElseIf.improveNestedIfelseStatement();

    }
}
