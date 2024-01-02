package com.ohgiraffer.level02.normal;

import com.ohgiraffer.level01.basic.Appilcation;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //첫 번째 인자의 최소값 부터 두 번째 인자까지 범위의 난수를 출력 (randomNumber 호출)

        //인자로 전달한 정수 길이의 랜덤한 문자열을 출력함 (randomUpperAlphabet 호출)

        //가위, 바위, 보 중 한 가지를 출력함 (rockPaperScissors 호출)
        String result3 = RandomMaker.rockPaperScissors();
        System.out.println(result3);

        //앞면, 뒷면 중 한 가지를 출력함 (tossCoin 호출)
        String result4 = RandomMaker.tossCoin();
        System.out.println(result4);

    }
}
