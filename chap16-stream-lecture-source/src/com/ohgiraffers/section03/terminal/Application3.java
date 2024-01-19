package com.ohgiraffers.section03.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        List<Member> listMember = Arrays.asList(
                new Member("test01", "홍길동"),
                new Member("test02", "오나윤"),
                new Member("test03", "정가연")
        );

        List<String> memberNameList = listMember.stream()
                /* 멤버의 타입이 스트링타입으로 출력된다 */
//                .map(member -> member.getMemberName())
                .map(Member::getMemberName)
                /* 최종 연산 중 하나 Stream이었던 코드를 Collection형태로 바꿔준다. */
                .collect(Collectors.toList());
        System.out.println("memberNameList : " + memberNameList);
//        memberNameList.forEach(value -> System.out.print(value + " "));

        /*  */
        String str = listMember
                .stream()
                .map(Member::getMemberName)
                .collect(Collectors.joining());
        System.out.println("str : " + str);

        String str2 = listMember
                .stream()
                .map(Member::getMemberName)
                .collect(Collectors.joining("||", "**", "**"));
        System.out.println("str2 : " + str2);
    }
}
