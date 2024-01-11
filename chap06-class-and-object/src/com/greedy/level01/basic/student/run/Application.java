package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        StudentDTO[] studentDTOS = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);

        int count = 0;


        while ( true ) {
            for ( int i = 0; i < studentDTOS.length; i++ ) {

                System.out.print("학년 : ");
                int grade = sc.nextInt();

                System.out.print("반 : ");
                int classroom = sc.nextInt();

                System.out.print("이름 : ");
                String  name = sc.nextLine();

                sc.nextLine();
                System.out.print("국어점수 : ");
                int kor = sc.nextInt();

                System.out.print("영어점수 : ");
                int eng = sc.nextInt();

                System.out.print("수학점수 : ");
                int math = sc.nextInt();

                /* 사용자 입력을 사용하여 StudentDTO 객체를 만들고 이를 배열에 저장하는 루프의 일부입니다.
                count 변수는 추가된 학생의 수를 추적하며, 각 추가 후에 증가하여 다음 학생이 배열의 다음
                사용 가능한 위치에 추가되도록 합니다. */
                studentDTOS[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
                System.out.print("계속 추가할 겁니까 ? (y/n) : ");
                char str = sc.next().charAt(0);
                sc.nextLine();

                if ( str == 'n' || str == 'N') {
                    break;
                }
                count++;
            }
            for (int j = 0; j < count+1; j++) {
                System.out.println(studentDTOS[j].getInformation());
            }return;
        }
    }
}
