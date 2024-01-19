package com.ohgiraffers.section02.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        /* 스트림의 중간 연산 중 하나인 flatMap에 대해 이해하고 사용할 수 있다. */

        /* 스트링이 담긴 리스트, 리스트2개를 또 리스트에 담았다. 중첩 리스트!! */
        List<List<String >> list = Arrays.asList(
                Arrays.asList("JAVA", "SPRING", "SPRINGBOOT"),
                Arrays.asList("java", "spring", "springboot")
        );
        System.out.println(list);

        List<String> flatList = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(flatList);
    }
}
