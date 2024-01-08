package com.ohgiraffers.section03.abstractio;

public class CarRacer {
    private Car car = new Car();

    /* 차의 시동을 걸 수 있다.  */
    public void startUp() {
        car.startUp();
    }

    /* 차의 엑셀을 밟을 수 있다. */
    public void stepAccelator() {
        car.go();
    }

    /* 차의 브레이크를 밟을 수 있다. */
    public void stepBreak(){
        car.stop();
    }

    /* 차의 시동을 끌 수 있다. */
    public void turnOff(){
        car.turnOff();
    }
}
