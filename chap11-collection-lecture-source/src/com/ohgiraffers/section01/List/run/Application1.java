package com.ohgiraffers.section01.List.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* ArrayList
        *  ArrayList는 배열의 단점을 보완하기 위해 만들어졌다.
        *  배열은 크기를 변경할 수 없고, 요소(element)의 추가, 삭제, 정렬 등이 복잡하다.
        *  내부적으로 수행이 될 뿐 실행 속도가 빨라지는건 아니다. */

        /* 1. ArrayList는 인스턴스를 생성하면 내부적으로 10칸짜리 배열을 생성해서 관리함. */
        ArrayList alt = new ArrayList();

        /* 2. 다향성을 이용해서 상위 레퍼런스로 ArrayList 객체를 참조할 수 있다.
        * list 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하기 때문에
        * 레퍼런스 타입은 list 타입으로 해 두는 것이 더 유연한 코드를 작성하는 방법이다. */
        List list = new ArrayList();

        /* 더 상위 타입인 Collection 타입을 사용할 수도 있다. */
        Collection ct = new ArrayList();

        /* add 메소드를 통해 저장할 수 있고 현재는 Object클래스의 하위 타입 인스턴스를 모두 저장할 수 있다. */
        alt.add("apple");
        alt.add(123);
        alt.add(15.67);
        alt.add(new java.util.Date());

        /* 저장 순서가 유지되며 index(순번)이 적용 된다.
        * toString() 메소드가 자동으로 오버라이딩 되어출력된다. */
        System.out.println("alt.add : " + alt);

        /* size() 메소드는 배열의 크기가 아닌 요소의 개수(길이)를 반환한다.
        * 내부적으로 관리되는 배열의 사이즈는 외부에서 알 필요가 없으므로 기능으로 제공하지 않음. */
        System.out.println("alt.size : " + alt.size());
        
        /* 내부 배열에 인덱스가 지정 되어 있기 때문에 for문 접근 가능하다. */
        /* size() (개수) 보다 작을때까지 반복 */
        for (int i = 0; i < alt.size(); i++){
            /* 인덱스에 해당하는 값을 가져 오고 싶을때는 get을 사용 */
            System.out.println( i + " : " + alt.get(i));
        }

        /* 데이터 중복 가능
        * 배열과 같이 인덱스로 요소를 관리하기 때문에 가능 */
        alt.add("apple");
        System.out.println("alt : " + alt);

        /* 원하는 인덱스 위치에 값을 추가할 수 있다.
        * 해당 인덱스를 덮어쓰지 않고 이후 인덱스는 하나씩 뒤로 밀려나게 된다. */
        alt.add(1, "banana");
        System.out.println("alt : " + alt);

        /* 저장 된 값을 삭제할 때는 remove() 메소드 사용
        * 두번째 인덱스가 삭제되고, 인덱스가 앞으로 하나씩 당겨진다. */
        alt.remove(2);
        System.out.println("alt.remove : " + alt);

        /*  Collection을 사용해서 여러 요소를 삭제하고 싶을 때는 removeAll()  메소드 사용
        *   .asList(삭제하고싶은 요소, 삭제하고싶은 요소) */
        List<String> elementsToRemoveStr = new ArrayList<>(Arrays.asList("banana", "orange"));
        List<Integer> elementsToRemoveInt = new ArrayList<>(Arrays.asList(2,5));

        alt.removeAll(elementsToRemoveStr);
        System.out.println("alt.elementsToRemoveStr : " + alt);

        /* 첫번째 인덱스를 true로 수정가능
        * banana -> true로 변경 */
        alt.set(1,true);
        System.out.println("alt.set : " + alt);

        /* 모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 작성되어 있다. */
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grape");
        /* 제네릭에 지정해준 외의 다른 타입은 불가 */
//        stringList.add(123);

        System.out.println( "stringList :" + stringList );

        List<Integer> integerList = new ArrayList<>();
        integerList.add(123);
        System.out.println( "integerList :" + integerList );

        /* 저장 순서를 유지하고 있는 stringList를 오름차순으로 정렬
        * collection 인터페이스가 아닌 collections 클래스를 사용
        * 컬렉션에서 사용 되는 기능들을 static 메소드들로 구현한 클래스이다. */

        Collections.sort(stringList);

        /* sort 메소드를 사용하면 리스트가 오른차순(a,b,c... ㄱ,ㄴ,ㄷ...) 정렬 된 후 정렬 상태가 유지된다. */
        System.out.println( "stringList :" + stringList );

    }
}
