package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {
    public static void main(String[] args) {

        }
        public void testSimpleWhileStatement() {
            /* while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

            /* 1부터 10까지 1씩 증가시키면서 10번 출력하는 기본 반복문 */
            int i = 1;
            while ( i <= 10 ) {
                System.out.println(i);
                i++;
            }
        }

        public void testWhileExample1() {
            Scanner sc = new Scanner(System.in);

            System.out.println(" 문자열 입력 : " );
            String str = sc.nextLine();

            int index = 0;

            /* index가 입력한문자열의 글자수보다 작을때
            * ※ index는 0부터 시작하고 마지막 index는 항상 길이(legth)보다 한개 작은 숫자를 가진다.
            *    존재하지 않는 인덱스에 접근할 경우 java.StringIndex...에러가 뜬다. */
            while ( index < str.length() ){
                char ch = str.charAt(index);
                System.out.println(index + " : " + ch );
                //index를 1씩 증가시킨다.
                index++;
            }
            
            //for문으로 작성했을때
            for ( int i = 0; i < str.length(); i++ ) {
                char ch = str.charAt(i);
                System.out.println(i + " : " + ch );
            }
        }
        public void testWhileExample2() {
            /* 정수 하나를 입력 받아 */
            Scanner sc = new Scanner(System.in);
            System.out.println( " 정수 하나 입력 : " );
            int num = sc.nextInt();
            
            /* while문으로 작성 */

            //합계를연산할 공간
            int sum = 0;

            //초기식
            int i = 1;

            while ( i <= num ) {
                //대입이 먼저 되고나서 증가함.
                sum+= i++;

            }
            System.out.println(" 1부터 입력 받은 정수 " + num + " 까지의 합은 " +  sum + " 입니다. ");
        }
        public void testWhileExample3() {
            /* 중첩 while문을 이욯한 구구단 출력 */

            // 2단부터 출발할 수 있는 초기식
            int dan = 2;

            //2단~9단
            while ( dan < 10 ){
                //내부while문 초기식
                int su = 1;
                /* n단 *1 ~ *9 */
                while ( su < 10 ) {
                    System.out.println(dan + " * " + su + " = " + (dan * su) );
                    su++; //내부 while문 증감식
                }
                dan++; //외부 while문에 증감식
            }
        }
    }
