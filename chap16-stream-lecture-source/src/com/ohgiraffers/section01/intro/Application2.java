package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Application2 {
    public static void main(String[] args) {
        /* 스트림의 병렬처리 */
        List<String> stringList = new ArrayList<>(Arrays.asList("java", "mysql", "mysql", "mysql"));

        /* 모든 작업은 기본적으로 main 스레드에서 일어난다 */
        System.out.println("======thread======");
        for (String s : stringList){
            System.out.println(s + ": " + Thread.currentThread().getName());
        }
        for (String s : stringList){
            System.out.println(s + ": " + Thread.currentThread().getName());
        }

        /* 일반적인 스크림도 main 스레드에서 작업을 수행한다. */
        System.out.println("======normal stream======");
        stringList.forEach(Application2::print);
        stringList.forEach(Application2::print);

        /* 병렬 스크림은 자동으로 병렬처리가 되고 성능상 유리하다.
        * 스트림을 활용하면 병렬 처리가 손쉽다는 것이 장점 중 하나다.
        *
        *  대량의 데이터를 처리할 때, 데이터를 여러 스레드로 분할하여
        *  병렬로 처리함으로써 성능 향상을 이끌어낼 수 있어서 좋음. */
        System.out.println("======parallel stream======");
        stringList.parallelStream().forEach(Application2::print);
        stringList.parallelStream().forEach(Application2::print);
    }
    private static void print(String str){
        System.out.println(str + ":" + Thread.currentThread().getName());
    }
}
