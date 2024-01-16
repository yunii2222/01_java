package com.ohgiraffers.section01.section02.set.run;

import java.util.LinkedHashSet;

public class Application2 {
    public static void main(String[] args) {
        /* LinkedHashSet에 대해 이해하고 사용할 수 있다. */

        LinkedHashSet<String> linkhas = new LinkedHashSet<>();

        linkhas.add("java");
        linkhas.add("mysql");
        linkhas.add("jdbc");
        linkhas.add("html");
        linkhas.add("css");

        /* HashSet이 가지는 기능을 모두 가지고 있으며 추가적으로 저장 순서를 유지하는 특징을 가지고 있다. */
        System.out.println(linkhas);
    }
}
