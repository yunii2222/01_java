package com.ohgiraffers.section01.List.comparator;

import com.ohgiraffers.section01.List.dto.BookDTO;

import java.util.Comparator;

/* Comparator 사용 시 제네릭 선언을 함께 해주어야 compare 메소드 매개변수 타입이 정의 된다.
* Object  타입인 경우 다운캐스팅 해서 사용해야 하므로 제네릭 타입을 결정해주고*/
public class AscendingPrice implements Comparator<BookDTO> {
    @Override
    /* 바꿀까요? 말까요?를 물어보는 코드 */
    public int compare(BookDTO o1, BookDTO o2) {
        /* 비교 대상 두 인스턴의 가격이 오름차순 정렬 되기 위해서는 앞의 가격이 더 작은 가격이 와야함.
        * 만약 뒤의 가격이 더 작은경우에는 두 인스턴스의 순서를 바꿔줘야함
        * 그 때 두값을 바꾸라는 신호로 양수를 반환하면 정렬 시 순서를 바꾸라는 조건으로 사용된다. */
        int result = 0;

        if (o1.getPrice() > o2.getPrice()){
            /* 더 크다. */
            result = 1;
        } else if (o1.getPrice() < o2.getPrice()) {
            /* 더 작다. */
            result = -1;
        }else {
            /* 같다. */
            result = 0;
        }
        /* result를 넣어줌으로써 값이 변경 */
        return result;
    }

    /* sort() 메소드에서 내부적으로 compare 메소드를 호출하여 swap 여부를 결정한다.
    * Comparator 인터페이스를 상속 받으면 compare 메소드 오버라이딩이 강제화 된다.
    * object는 아무객체나 넘어올수 있음. */
}
