package com.ohgiraffers.section01.array;

public class Application5 {
    public static void main(String[] args) {
        /* 랜덤한 카드 한 장 뽑아서 출력해보기 */

        String[] shapes = {" SPADE ", " CLOVER ", " HEART ", " DIAMOND "};
        String[] cardNumbers = {" 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 ", " 10 ", " JACK ", " QUEEN ", " KiNG ", " ACE " };
        
        // 배열로 만든 카드들의 길이를 랜덤으로 뽑아냄
        int randomShapIndex = (int) (Math.random() * shapes.length);
        int randomCardNumbersIndex = (int) (Math.random() * cardNumbers.length);

        System.out.println(" 당신이 뽑은 카드는 " + shapes[randomShapIndex] + " "
                + cardNumbers[randomCardNumbersIndex] + " 카드 입니다. ");
    }
}
