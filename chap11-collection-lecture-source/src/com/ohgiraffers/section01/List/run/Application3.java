package com.ohgiraffers.section01.List.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        /* linkList에 대해 이해하고 사용할 수 있다. */

        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");
        linkedList.add("banana");

        for ( int i = 0; i < linkedList.size(); i++ ) {
            System.out.println( i + " : " + linkedList.get(i));
        }

        /* 1번째 인덱스 삭제해주세요 */
        linkedList.remove(1);

        for ( String str: linkedList ) {
            System.out.println(str);
        }

        /* 0번째 인덱스를 peach로 변경해주세요! */
        linkedList.set(0, "peach");

        System.out.println(linkedList);

        /* linkedList를 삭제 */
        System.out.println(linkedList.isEmpty());
        linkedList.clear();
        System.out.println(linkedList.isEmpty());
        
        /* LinkList는 list 인터페이스를 상속 받아 ArrayList와 사용하는 방법이 유사하다.
        * 단, 내부적으로 요소를 저장하는 방법에 차이가 있다.
        * 따라서 각 컬렉션 프레임워크 클래스들의 특징을 파악하고 그에 따라 적갑한클래스를 선택 */
    }
}
