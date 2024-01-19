package com.ohgiraffers.section01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {
        /* 배열이나 컬렉션을 이용하여 스트림을 생성하는 방법을 이해하고 사용할 수 있다. */

        /* 배열 스트림 생성 */
        String[] str1 = new String[] {"java", "mysql", "oracle"};
        /* 내가 배열을 전달할때 스트링의 타입을 스트림의 스트링타입으로 변경 */
        Stream<String> stringStream1 = Arrays.stream(str1);
        stringStream1.forEach(System.out::println);

        /* 위에 str1코드에서 가지고옴 앞에는 시작인덱스 뒤에
            1을 입력하면 java를 2를 입력하면 mysql을 출력 */
        Stream<String> stringStream2 = Arrays.stream(str1, 0 , 1);
        stringStream2.forEach(System.out::println);


        /* 컬렉션에서 스트림 생성 코드 */
        List<String> stringList = Arrays.asList("html", "css", "javascript");
        Stream<String> stringStream3 = stringList.stream();
        stringStream3.forEach(System.out::println);

        /* Builder를 활용한 스트림 생성 */
        Stream<String> BuilderStream = Stream.<String>builder()
                .add("유관순")
                .add("홍길동")
                .add("윤봉길")
                .build();
        /*  BuilderStream을 이용한 출력 */
        BuilderStream.forEach(System.out::println);

        /* iterator()를 활용하여 수열 형태의 스트림을 생성할 수 있다. */
        /* 10에서 시작해서 * 2를 최대 10번까지만 수행 */
        Stream<Integer> integerStream = Stream.iterate(10, value -> value * 2).limit(10);
        /* 람다식으로 출력 */
        integerStream.forEach(value -> System.out.print(value + " "));
    }
}
