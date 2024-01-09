package com.ohgiraffers.section05.parameter;

import java.awt.*;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /* 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */
        
        /* 매개변수로 사용 가능한 자료형
        * 1. 기본 자료형
        * 2. 기본 자료형 배열
        * 3. 클래스 자료형
        * 4. 클래스 자료형 배열
        * 5. 가변인자 */

        parameterTest pt = new parameterTest();

        /* 기본 자료형을 매개변수로 전달(기본 자료형 8가지 모두 가능) */
        int num = 20;
        pt.testPrimaryTypeParameter(num);

        /* 기본 자료형은 "값을 전달" 하므로 메소드 내에서 변경 시켜도 main에서의 변수는 변화가 없다. */
        System.out.println( " main num : " + num );

        /* 2. 기본자료형 배열 */
        int[] arr = {1, 2, 3, 4, 5};
        pt.testPrimaryTypeArrayParameter(arr);
        /* 배열은 "주소 값을 전달" 하므로 얕은 복사가 일어나 동일한 내열을 다루고 있다.
        *  따라서 값의 변화가 그대로 출력이 된다.*/
        System.out.println( " main iarr : " + Arrays.toString(arr));

        /* 3. 클래스 자료형 */
        /* 주소값 전달되었음 */
        Rectangle r = new Rectangle(12.5, 13.5);
        /* 주소값 전달 */
        pt.testClassTypeParameter(r);

        /* 클래스 자료형은 "주소 값을 전달"하므로 얕은 복사가 일어나 동일한 객체를 다루고 있다. */
        System.out.println( " main의 넓이와 둘레 ");
        r.calcArea();
        r.calcRound();

        
        /* 5. 가변 인자
        * 인자로 전달하는 값의 객수가 정해지지 않은 경우 가변 인자를 활용할 수 있다. */
        pt.testVariableLengthArrayParameter("냐냥");
        pt.testVariableLengthArrayParameter("냐냥", "배드민턴");
        pt.testVariableLengthArrayParameter("냐냥", "배드민턴","축구");
        pt.testVariableLengthArrayParameter("냐냥", new String[]{"배드민턴","축구"});

    }
}
