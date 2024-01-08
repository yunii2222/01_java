package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {
    String kinds;

    int hp;

    // name에 대한 메소드
    public void setInfo(String info) {
        this.kinds = info;
    }

    //hp에 대한 메소드
    public void setHp(int hp) {
        //hp가 0보다 크면 hp가 표시되고,
        if ( hp > 0 ) {
            this.hp = hp;
            //hp가 0보다 작을시 0으로 표시된다.
        } else {
            this.hp = 0;
        }
    }
    public String getInfo() {
        return " 몬스터의 이름은 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
    }
}
