package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        StudentDTO[] studentDTOS = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);

        int count = 0;


        while ( !(count >= 1 && count <= 10) ) {
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

                studentDTOS[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
                count++;
                System.out.print("계속 추가할 겁니까 ? (y/n) : ");
                char str = sc.next().charAt(0);
                sc.nextLine();

                for ( int j = 0; j < count; j++ ) {
                    if (str == 'y') {
                        System.out.println("ff");
                    }else if ( str == 'n'){
                        System.out.println(studentDTOS[i].getInformation());
                        continue;
                    }
                }
            }
        }
    }
}
