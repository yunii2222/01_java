package com.ohgiraffers.section01.section02.set.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* HashSet 클래스를 이해하고 사용할 수 있다. */
        HashSet<String> hes1 = new HashSet<>();
        /* 다형성을 적용하여 상위 인터페이스를 타입으로 사용 가능 */
        Set<String> hes2 = new HashSet<>();
        Collection<String> hes3 = new HashSet<>();

        /* Set 계열에 데이터 추가 시 add() 메소드 사용 */
        hes1.add(new String("java"));
        hes1.add(new String("mysql"));
        hes1.add(new String("jdbc"));
        hes1.add(new String("html"));
        hes1.add(new String("css"));

        /* 저장 순서가 유지 되지 않는다. */
        System.out.println("hes1 : " + hes1);

        /* 중복 값이 저장 되지 않는다.
        * equals() / hashCode() 메소드가 String에 overriding 되어 있다.
        * 동일객체(주소 값 일치)뿐 아니라, 동등객체(필드 값 일치)도 중복 값으로 판단 되어 처리 */
        hes1.add(new String("java"));
        System.out.println("hes1 : " + hes1);

        /* contains() 메소드는 해당 객체를 포함하고 있는지 확인 하는 메소드로 여기서도 동등 객체로 판단.
        * 내부적으로 equals() 메소드를 호출해서 사용 */
        System.out.println("포함 여부 확인 : " + hes1.contains(new String("html")));

        /* 저장 된 객체를 인덱스 기준으로 순회할 수 없다
        * 반복문을 이용한 연속처리 방법으로는
        * 1. toArray() 메소드로 배열로 변경한 뒤 for loop 사용
        * 2. iterator() 메소드로 반복잘를 만들어서 연속 처리 */

        Object[] arr = hes1.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println( i + " : " + arr[i]);
        }

        /* Collection 인터페이스의 상위 타입인 Iterable() 메소드가 정의 되어 있음
        * 따라서 Collection 타입이라면 반복자를 통한 순회를 할수 있음. */
        Iterator<String> iter = hes1.iterator();

        while (iter.hasNext()){
            /* 다음 값이 있니? 있으면 반환 */
            System.out.println(iter.next());
        }
    }
}
