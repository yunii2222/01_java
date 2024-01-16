package com.ohgiraffers.section01.section02.set.run;

import java.util.*;

public class Application3 {
    public static void main(String[] args) {
        /* TreeSet에 대해 이해하고 사용 할 수 있다. */

        TreeSet<String> ts = new TreeSet<>();

        ts.add("java");
        ts.add("mysql");
        ts.add("jdbc");
        ts.add("html");
        ts.add("css");

        /* 자동 오름차순 정렬하여 이진 크리의 형태로 요소를 저장하고 있다. */
        System.out.println("ts : " + ts);

        Iterator<String> iter2 = ts.iterator();

        while (iter2.hasNext()){
            /* 다음 값이 있니? 있으면 반환 */
            System.out.println(iter2.next());
        }
        
        /* 정렬, 중복 제거 특징을 이용하여 로또 번호 발생기 만들기 */
        Set<Integer> lotto = new TreeSet<>();

        while (lotto.size() < 6 ){
            lotto.add((int) (Math.random() * 45) + 1);
        }
        System.out.println(lotto);
    }
}
