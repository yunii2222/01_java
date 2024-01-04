package com.ohgiraffers.section03.brancing;

public class A_break {
    
    public void testSimpleBreakStatement() {
        /* break문 사용에 대한 흐음을 이해하고 적용할 수 있다. */
        
        /* break문을 이용하여 무한루프를 활용한 1~100까지의 합계 구하기 */
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i++;
            if ( i > 100 ) {
                //if문을 빠져나가는 것이 아니라, while문 자체에서 빠져나간다.
                break;
            }
        }
        System.out.println( "sum : " +  sum );
    }
    public void testSimpleBreakStatement2() {
        /* 중첩 반복문 내break문 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* 구구단 2~9단을 출력하되 곱해지는 수가 5보다 큰경우 출력하지 않는다. */

        for ( int dan = 2; dan < 10; dan++ ) {
            for ( int su = 1; su < 10; su++ ) {
                if ( su > 5 ) {
                    break;
                }
                System.out.println( dan + " * " + su + " = " + ( dan * su ) );
            }
        }
    }
    public void testJumpBreak() {
        /* 중첩 반복문 내 break문 사용 시 jump(goto)에 대한 흐름으 ㄹ이해하고 적용할 수 있다. */
        /* 정해진 이름이 있는것은 아니고 변수명처럼 지정할 수 있다.
        * label을 붙이면 반복문 자체를 빠져나가게 된다. */
        label:
        for (;;) {
            for ( int i = 0; i < 10; i++) {
                System.out.println(i);
                //
                if (i == 3) {
                    break label;
                }
            }
        }
    }
}
