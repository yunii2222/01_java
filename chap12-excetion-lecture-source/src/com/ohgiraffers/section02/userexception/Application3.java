package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotNegativeException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application3 {
    public static void main(String[] args) {
        /* multi catch block 으로 동일한 레벨의 다른 타입의 예외를 하나의 catch블럭으로 처리할 수 있다 */

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(2000,-5000);
            /* 같은 레벨은 상관없지만, 상위타입과 함께 나열하면 안된다.
            * ex) Exception | NotNegativeException (X), NegativeException | PriceNegativeException (X) | Throws ...
            * 상위타입과 하위타입은 함께 서술 될 수 없다. */
        } catch (PriceNegativeException | MoneyNegativeException e) {
            System.out.println(e.getClass() + "발생!!!!"); // getClass() 로 발생한 예외 클래스의 이름을 알 수 있음
            System.out.println(e.getMessage());
        }catch (NotNegativeException e){
            System.out.println("NotNegativeException 발생!!!!");
            System.out.println(e.getMessage());
        }
    }

}
