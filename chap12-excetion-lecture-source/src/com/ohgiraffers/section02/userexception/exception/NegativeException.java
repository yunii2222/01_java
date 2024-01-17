package com.ohgiraffers.section02.userexception.exception;

public class NegativeException extends Exception {
    public NegativeException(String message) {
        /* 문자받은 문자열을 상위 타입으로 전달한다. */
        super(message);
    }
}
