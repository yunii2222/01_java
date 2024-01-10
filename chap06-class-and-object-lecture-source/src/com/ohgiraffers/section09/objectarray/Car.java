package com.ohgiraffers.section09.objectarray;

import javax.swing.text.html.CSS;

public class Car {
    private String modelName;
    private int maxSpeed;
    
    /* 생성자 초기화 */
    public Car( String modelName, int maxSpeed ){
        this.modelName = modelName;
        this.maxSpeed  = maxSpeed;
    }

    public void driveMaxSpeed() {
        System.out.println(modelName + "(이)가 최고 시속 " + maxSpeed + "Km/h로 달려갑니다. ");
    }
    
}
