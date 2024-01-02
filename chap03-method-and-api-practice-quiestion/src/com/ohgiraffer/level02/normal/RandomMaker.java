package com.ohgiraffer.level02.normal;

import java.util.Random;

public class RandomMaker {

    static Random random = new Random();
    public static void main(String[] args) {

        }
    public static String rockPaperScissors(){
        int inum1 = random.nextInt(3) + 1;

        String str1 = "가위";
        String str2 = "바위";
        String str3 = "보";

        // inum1은 1과 같을때 str1 반환, inum이 2와 같은 경우 str2를 반환, 다를 경우 str3을 반환
        return ( inum1 == 1 ? str1 : ( inum1 == 2 ? str2 : str3 ) );
    }

public static String tossCoin() {
    /* 총 2개 */
    int inum2 = random.nextInt(2) + 1;

    String str1 = "앞면";
    String str2 = "뒷면";

    // inum2는 1과 같을때 true이다 그러므로 str1를 반환하고, false일 경우 str2를 반환한다.
    return ( inum2 == 1 ? str1 : str2 );
     }
    }
