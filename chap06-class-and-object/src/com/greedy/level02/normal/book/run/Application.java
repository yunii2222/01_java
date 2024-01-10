package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO bookDTO1 = new BookDTO();
        System.out.println(bookDTO1.printInformation());
        /* 다른 방법1 */
//      bookDTO1.printInformation();
        System.out.println(" ");

        BookDTO bookDTO2= new BookDTO("자바의 정석", "도우출판", "남궁성");
        System.out.println(bookDTO2.printInformation());
        /* 다른 방법1 */
//      bookDTO2.printInformation();
        System.out.println(" ");

        BookDTO bookDTO3= new BookDTO("홍길동전", "활빈당", "허균", 5000000,0.5);
        System.out.println(bookDTO3.printInformation());
        /* 다른 방법1 */
//      bookDTO2.printInformation();
    }
}
