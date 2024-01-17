package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotNegativeException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money)
            throws PriceNegativeException,MoneyNegativeException, NotNegativeException {
        /* throws 구문 작성 시 여러 Exception을 나열할 수 있으며 상위 타입의 Exception만 작성할 수도 있다. */
//        throws Exception {
        if (price < 0) {
            /* 사용자 정의 예외 발생 */
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }
        if (money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }
        if (money < price){
            throw new NotNegativeException("가진 돈 보다 상품 가격이 더 비쌉니다.");
        }
        System.out.println("가진 돈이 충분 합니다. 즐거운 쇼핑 하세요.! ");
    }
}

