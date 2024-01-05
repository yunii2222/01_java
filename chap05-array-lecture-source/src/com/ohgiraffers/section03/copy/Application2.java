package com.ohgiraffers.section03.copy;

public class Application2 {
    public static void main(String[] args) {
        /* 얕은 복사를 활용하여 매개변수와 리턴 값으로 활용할 수 있다. */

        String[] names = {" 홍길동 ", " 유관순 ", " 이순신 "};

        System.out.println( " names 의 hashCode : " + names.hashCode());
        
        /* 1. 인자와 매개변수로 활용 */
        print(names);

        /* 2. 리턴 값으로 활용 */
        String[] animals = getAnimals();

        System.out.println( " 리턴 받은 animals의 hashCode : " + animals.hashCode() );

        print(animals);

    }
    // 메인안에 names라는 이름으로 만든 배열을 아래 sarr로 내려보내줌.
    public static void print(String[] sarr ) {
        System.out.println( "sarr의 hashCode : " + sarr.hashCode() );

        for ( int i = 0; i < sarr.length; i++ ){
            System.out.print(sarr[i] + " ");
        }
        System.out.println();
    }
    
    public static String[] getAnimals() {
        String[] animals = new String[] {" 강아지 ", " 미어캣 ", " 사막여우 "};
        return animals;
    }
}
