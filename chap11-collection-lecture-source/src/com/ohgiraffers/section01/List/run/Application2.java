package com.ohgiraffers.section01.List.run;

import com.ohgiraffers.section01.List.comparator.AscendingPrice;
import com.ohgiraffers.section01.List.dto.BookDTO;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        /* ArrayList 사용자 정의 자료형으로 이용하기, 정렬하기 */
        
        /* 여러 권의 책 목록을 관리할 ArrayList 생성 */

        /* BookDTO의 클래스만 사용(관리)하겠다 */
        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1, "홍길동전", "허균", 5000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 4000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 6000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 2000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 1000));
        /* 변수타입 변수명 : 반복의 대상 */
        for (BookDTO book : bookList){
            System.out.println(book);
        }

        /* 제네릭의 타입 제한에 의해 컴퍼러블(Comparable) 타입을 가지고 있는 경우에만 srot가 가능하다.
        *  String클래스는 implements Comparable (정랼 기준을 구현) 되어 있었기 때문에 사용 가능했다 */
//        Collections.sort(bookList);

        /* 가격 오름차순 정렬
        * Ascending(오름차순) 클래스 생성
        * 내부적으로compareTo(결정기준)()가 들어가있다 */
        Collections.sort(bookList, new AscendingPrice());
        System.out.println("  ");
        System.out.println("=======가격 오름차순 정렬=======");
        /* price가 작은 값 부터 순서대로 출력 */
        for (BookDTO book : bookList){
            System.out.println(book);
        }

        /* 가격 내림차순 정렬
        * 정렬 기준을 계속해서 사용하는 경우에는 AscendingPrice 클래스를 만든 것 처럼 클래스를 생성해도 되지만,
        * 한 번만 사용하기 위헤서는 조금 더 간편하게 익명 클래스(Anonymous class)를 사용할 수 있다. */

        Collections.sort(bookList, new Comparator<BookDTO>() {

            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                /* 가격 내림차순 정렬 조건
                * o2의 가격이 더 큰 경우에 양수를 반환하여 swap하라는 flag를 전달한다.
                * return o1.getPrice >= o2.getPrice() ? -1 : 1 ;*/
                return o2.getPrice() - o1.getPrice();
            }
        });
        System.out.println("  ");
        System.out.println("=======가격 내림차순 정렬=======");
        /* price가 큰 값 부터 순서대로 출력 */
        for (BookDTO book : bookList){
            System.out.println(book);
        }

        /* 제목 오름차순 정렬 */
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                /* 문자열 대소비교는 String 클래스에 정의 된 compareTo()메소드를 활용한다.
                * 앞의 값이 더 작은 경우 음수를 반환하고 같으면 0을 반환하며 앞의 값이 더 큰 경우 양수를 반환. */
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        System.out.println("  ");
        System.out.println("=======제목 오름차순 정렬=======");
        /* 제목 오름차순으로 출력 */
        for (BookDTO book : bookList){
            System.out.println(book);
        }

        /* 제목 내림차순 정렬 */
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                /* 아래 둘중 아무거나 사용해도 무방 */
//                return - o1.getTitle().compareTo(o2.getTitle());
                return o2.getTitle().compareTo(o1.getTitle());
            }
        });
        System.out.println("  ");
        System.out.println("=======제목 내림차순 정렬=======");
        /* 제목 오름차순으로 출력 */
        for (BookDTO book : bookList){
            System.out.println(book);
        }
    }
}
