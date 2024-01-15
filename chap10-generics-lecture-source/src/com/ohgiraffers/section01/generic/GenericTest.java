package com.ohgiraffers.section01.generic;

/* 제네릭 선언은 클래스 선언부 마지막에 다이아몬드 연산자를 이용하여 작성한다.
* 다이아몬드 연산자 <> 안에 영문자는 대문자로 작성
* T는 타입 변수라고 부름. 타입 변수를 자료형 대신 사용.
* 가상으로 존재하는 타입으로 T가 아닌 다른 영문자를 사용해도 상관없음.
* 여러 개의 타입 변수 , 를 넣어 사용 가능 */
public class GenericTest <T> {
    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    /* 사용하는 쪽에서 작성한 제네릭 클래스르르 이용할 때 실제 사용할 타입을
    *  타입 변수 자리에 넣어주게되면 컴파일 시점에 타입이 결정된다. */
}
