package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯어먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 왠만해선 달리지 않습니다. 어슬렁~ 어슬렁~ 천천히 걸어갑니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울고있습니다...ㅠㅠ ");
    }
    
    /* 호랑이만 하는 동작 */
    public void bite() {
        System.out.println("호랑이가 물어 뜯습닏 왕");
    }
}
