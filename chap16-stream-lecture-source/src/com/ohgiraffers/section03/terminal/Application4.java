package com.ohgiraffers.section03.terminal;

import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("java", "String", "SpringBoot");

        /* 최종적인 결과에 p가 하나라도 있으면 조건 만족 (매치가 맞았으면 좋겠다.) */
        boolean anyMatch = stringList.stream().anyMatch(str -> str.contains("p"));
        /* 최종적인 결과가 다 만족이 되어야 함. 3이 넘니? 라고 물어봤을때 맞으면 true  */
        boolean allMatch = stringList.stream().allMatch(str -> str.length() > 3);
        /* 최종적인 결과에 c가 없냐고 물어봤을때 없으니까 true 가 반환된다. (매치가 되지 않았으면 좋겠다.) */
        boolean noneMatch = stringList.stream().noneMatch(str -> str.contains("c"));

        System.out.println(anyMatch);
        System.out.println(allMatch);
        System.out.println(noneMatch);
    }
}
