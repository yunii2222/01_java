package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class parameterTest {

    /* 1. 기본자료형 */
    public void testPrimaryTypeParameter(int num) {
        System.out.println( " 매개 변수로 전달 받은 값 : " + num );
        //
        num += 10;
        System.out.println( " 가공 된 num : " + num );
    }

    /* 2. 기본자료형 배열 */
    public void testPrimaryTypeArrayParameter(int[] arr) {
        System.out.println( " 매개변수로 전달 받은 값 : "  + Arrays.toString(arr));
        arr[0] = 99;

    }

    /* 3. 클래스 자료형 */
    /* 주소 값을 전달 받았음 */
    public void testClassTypeParameter(Rectangle r) {
        System.out.println( " 매개변수로 전달 받은 넓이와 둘레 " );
        r.calcArea();
        r.calcRound();

        /* 1번 (변경해주었음)*/
        r.setWidth(100);
        r.setHeight(100);

        /* 2번 */
        System.out.println( " 가공 된 넓이와 둘레 ");
        r.calcArea();
        r.calcRound();
    }

    /* 5. 가변 인자 */
    public void testVariableLengthArrayParameter( String name, String... hobby ) {
        /* 매개 변수가 몇 개 전달 될 지 알수 없으므로 반드시 매개변수 목록의 가장 뒤에 작성해야 한다. */
        System.out.println( " 이름 : " + name );
        System.out.println( " 취미의 개수 : " + hobby.length );
        System.out.println( " 취미 : " + Arrays.toString(hobby) );
    }
    
    /* 가변 인자를 사용한 메소드를 오버로딩하면 모호해지는 문제가 발생할 수 있으므로 가급적 오버로딩 하지 않는다. */
//    public void testVariableLengthArrayParameter(String... hobby) {
//        
//    }
}
