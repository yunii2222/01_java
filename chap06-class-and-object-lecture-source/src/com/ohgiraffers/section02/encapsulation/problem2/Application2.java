package com.ohgiraffers.section02.encapsulation.problem2;

public class Application2 {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        monster1.kinds = "좀비";
        monster1.hp = 100;

        Monster monster2 = new Monster();
        monster2.kinds = "미이라";
        monster2.hp = 200;

        Monster monster3 = new Monster();
        monster3.kinds = "해골";
        monster3.hp = 300;
    }
}
