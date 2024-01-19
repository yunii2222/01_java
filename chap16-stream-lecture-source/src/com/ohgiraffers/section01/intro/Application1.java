package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /* Stream에 대해 이해하고 사용할 수 있다.
        * 일일히 add하기에 복잡함이 있어 작성, 하나의 리스트로 반환된다. */
        List<String> stringList = new ArrayList<>(Arrays.asList("hi","world", "stream"));
        System.out.println(stringList);

        /* 예전에 스크림을 이용하지 않았던 방식 */
        System.out.println("======foreach======");
        for (String str : stringList){
            System.out.println(str);
        }

        /* 스트림을 이용한 방식 */
        System.out.println("======stream======");
        /* forEach() : 요소들을 순서대로 간단한 반복적인 작업을 수행할 때 사용 */
        stringList.forEach(System.out::println);
    }
}
