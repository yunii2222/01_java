package com.ohgiraffers.section02.encapsulation.problem4;

public class Monster {

    /* 접근 제한자
    * 클래스 혹은 클래스의 멤버에 참조 연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
    * 1. public : 모든 패키지 접근 허용 => 오픈되어있다.
    * 2. protected : 동일 패키지 접근 허용(단, 상속 관계에 있으면 다른 패키지 접근 허용)
    * 3. default : 동일 패키지 접근 허용 (작성하지 않는 것이 default)
    * 4. private : 해당 클래스 내부만 접근 허용 (외부 접근을 막아둠 ) => 막혀있다.
    * 위의 4가지 접근 제한자는 클래스의 멤버(필드, 메소드)에 모두 사용 가능하다.
    * 단, 클래스 선언 시 사용하는 접근 제한자는 public과 default만 사용 가능하다. */

    //외부에서 절대 접근 못함. => 막아둔 상태
    //1. 필드 값 통제X, 2. 필드 값 변경 시 사용자 코드 변경 => 유지보수성 악화
    // 직접접근 X, 간접접근O => 캡슐화
    private String kinds;

    private int hp;

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
