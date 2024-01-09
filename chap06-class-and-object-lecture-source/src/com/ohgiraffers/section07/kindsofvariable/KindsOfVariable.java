package com.ohgiraffers.section07.kindsofvariable;

public class KindsOfVariable {
    /* 다양한 변수를 이해하고 사용할 수 있다. */
    /* 전역변수 */
    
    /* non-static field를 인스턴스 변수라고 한다. (인스턴스 생성 시점에 사용 가능한 변수) */

    private int globalNum;

    private static int staticNum;
    
    
                        // ( int num ) = 매개변수(일종의 지역 변수)
    public void method( int num ) {
        int localNum; //지역변수 (지역변수는 반드시 초기화를 해줘야함.)

        // 매개변수는 호출 시 값이 전달 되므로 별도의 초기화는 필요없다.
        System.out.println( " num(지역변수) : " + num);
        // 지역변수는 선언 외에 다시 사용하기 위해서는 반드시 초기화 되어야 한다.
//        System.out.println( " localNum(지역변수) : " + localNum);

        System.out.println( " globalNum(전역변수) : " + globalNum );
        System.out.println( " staticNum(전역변수) : " + staticNum );
    }

    public void method2(){
        /* 지역 변수는 해당지역(블럭 내)에서만 사용이 가능하다.
        *  전역 변수는 클래스 내의 모든 영역에서 사용할 수 있다. */
      //System.out.println( " localNum(지역변수) : " + localNum);
        System.out.println( " globalNum(전역변수) : " + globalNum );
        System.out.println( " staticNum(전역변수) : " + staticNum );
    }

}
