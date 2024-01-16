package com.ohgiraffers.section01.List.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /* Queue에 대해 이해하고 사용할 수 있다. */

        /* Queue는 인터페이스이므로 인스턴스 생성 불가
        * Queue<String> que = new Queue(); */

        /* LinkList 타입을 활용해서 큐를 만든다 */
        Queue<String> que = new LinkedList<>();

        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println( "que : " + que);
//        offer(); => 데이터 추가
//        poll(); => 데이터 꺼내고 지우기
//        peek(); => 데이터 꺼내기

        /* que에서 데이터를 꺼낼 때는 2가지 메소드가 있다.
        * peek() : que의 가장 앞에 있는 (먼저 들어온) 요소를 반환
        * poll() : que의 가장 앞에 있는 (먼저 들어온) 요소를 반환 후 삭제 */
        System.out.println("peek : " + que.peek());
        System.out.println("peek : " + que);

        System.out.println("poll : " + que.poll());
        System.out.println("poll : " + que.poll());
        System.out.println("poll : " + que.poll());
        System.out.println("poll : " + que.poll());
        System.out.println("poll : " + que.poll());
        /* 더 이상의 데이터가 없기 때문에 null을 반환 */
        System.out.println("poll : " + que.poll());
        System.out.println("poll : " + que);


    }
}
