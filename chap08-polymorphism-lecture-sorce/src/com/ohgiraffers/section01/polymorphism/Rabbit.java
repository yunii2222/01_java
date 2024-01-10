package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal {
    @Override
    public void eat() {
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다.");
    }

    @Override
    public void run() {
        System.out.println("토끼가 달려갑니다. 깡총~! 깡총~!");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 울음소리를 냅니다. 끼잉 끼잉 ㅠㅠ");
    }

    /* 토끼만 하는 동작 */
    public void jump() {
        System.out.println("토끼가 점프합니당 ↗점프!!!!!↗");
    }
}
