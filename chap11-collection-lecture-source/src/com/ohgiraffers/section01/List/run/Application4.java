package com.ohgiraffers.section01.List.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /* Stack에 대해 이해하고 사용할 수 있다. */
        Stack<Integer> integerStack = new Stack<>();

        /* stack()에 값을 넣을때는 push()메소드를 사용한다.
        *  add()도 사용 가능 하긴하지만 Vector의 메소드 이므로 push()를 사용하는 것이 좋다.*/

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println( " integerStack : " + integerStack);
        
        /* 스택에서 요소를 찾을때 search() 메소드를 사용할 수 있다.
        * 인덱스가 아닌 위에서부터의 순번을 의미하며 가장 상단의 위치는 0이 아닌 1부터 시작 */

        /* 5라는 " integerStack" 값을 찾아주세요 */
        System.out.println("search :" + integerStack.search(5));

        /* 스택에서 요소를 꺼내는 메소드는 크게2가지가 있다.
        * peek() : 가장 마지막(상단)에 있는 요소 반환
        * pop() : 가장 마지막(상단)에 있는 요소 반환 후 제거(좀 더 확실함) */
        System.out.println("peek : " + integerStack.peek());
        System.out.println(integerStack);

        System.out.println( "pop : " + integerStack.pop());
        System.out.println( "pop : " + integerStack.pop());
        System.out.println( "pop : " + integerStack.pop());
        System.out.println( "pop : " + integerStack.pop());
        System.out.println( "pop : " + integerStack.pop());
        /* 5개의 데이터를 다 꺼냈기때문에 남아있는 데이터가 없음 */
        System.out.println(integerStack);

    }
}

