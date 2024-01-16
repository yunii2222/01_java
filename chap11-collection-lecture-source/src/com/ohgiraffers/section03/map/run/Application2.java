package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdb:oracle:thin:@127.0.0.1:1521:xe");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println( "prop : " + prop);

        /* More actions.. -> try/catch클릭
        * 왼쪽 파일 맨아래 내려보면 driver.dat, driver.txt, driver.Xml 파일 생성 되어 있음. 
        * properties 객체의 값을 파일로 출력 */
        try {
            /* dat = data */
            prop.store(new FileOutputStream("driver.dat"),"jdbc driver");
            /* txt = text */
            prop.store(new FileWriter("driver.txt"),"jdbc driver");
            /* Xml = eXtensible Markup Language(데이터를 저장하고, 전송하는 마크업 언어 ) */
            prop.storeToXML(new FileOutputStream("driver.Xml"),"jdbc driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* 파일로부터 읽어와서 Properties 객체에 담기 */
        Properties props = new Properties();
//        try {
//            props.load(new FileInputStream("driver.dat"));
//            props.load(new FileReader("driver.txt"));
//            props.loadFromXML(new FileInputStream("driver.Xml"));
//            props.list(System.out);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println(props.getProperty("driver"));
        System.out.println(props.getProperty("url"));
        System.out.println(props.getProperty("user"));
        System.out.println(props.getProperty("password"));
    }
}
