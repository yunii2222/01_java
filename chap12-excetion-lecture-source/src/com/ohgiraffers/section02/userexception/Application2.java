package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotNegativeException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {
        /* 다양한 타입의 예외를 multi catch block을 이용해서 처리할 수 있다. */
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(30000, 50000);

        }
/*        catch(Exception e){
            multi catch block 사용 시 유의 할 점은 위에서 부터 아래로 진행하면서 자신의 예외 타입과 맞는 경우 동작하기 때문에
            상위 타입의 exception이 먼저 서술 되면 하단의 catch block으로는 절대 도달 할 수 없어 컴파일 에러가 발생한다는 점이다
            따라서 catch 블럭의 서술 순서는 하위 타입 -> 상위 타입으로 서술해야 한다.
        }*/catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException 발생");
            /* 아까 생성 했던 메세지 파일 출력 */
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNegativeException 발생");
            /* 아까 생성 했던 메세지 파일 출력 */
            System.out.println(e.getMessage());
        } catch (NotNegativeException e) {
            System.out.println("NotNegativeException 발생");
            /* 아까 생성 했던 메세지 파일 출력 */
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally 블럭의 내용이 동작함");
        }
        System.out.println("프로그램을 종료 합니다.");
    }
}
