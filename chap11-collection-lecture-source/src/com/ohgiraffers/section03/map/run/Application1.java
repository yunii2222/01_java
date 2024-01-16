package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* HashMap을 이해하고 활용할 수 있다. */

        HashMap hmap = new HashMap();

        /* 키와 값을 쌍으로 저장한다.
        * 키와 값은 반드시 객체여야 한다.
        *          키 , 값(value) */
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(22, 1234);

        System.out.println("hmap :" + hmap);

        /* 키값은 같은 중복 저장할 수 없고, 새로운 값으로 덮어씌우기가 된다. */
        hmap.put(12,"yellow banana");
        System.out.println("hmap :" + hmap);

        /* 키가 다를때 값(value)은 같아도 중복 저장 가능 */
        hmap.put(9,"yellow banana");
        System.out.println("hmap :" + hmap);

        /* 값에 대한 내용을 가지고올때는 키값번호로 가져옴 */
        System.out.println("키 9에 대한 객체 :" + hmap.get(9));

        /* 키 값을 가지고 삭제를 처리할 때 */
        hmap.remove(9);
        System.out.println("키 9에 대한 객체 삭제 : " + hmap);

        /* 키 타입↓,값 타입↓ */
        Map<String, String> map = new HashMap<>();
        map.put("one","java");
        map.put("two","mysql");
        map.put("three","jdbc");
        map.put("four","html");
        map.put("five","css");
        System.out.println(map);

//        Map<String, Integer> map1 = new HashMap<>();
//        map1.put("grape", 2);
//        map1.put("orange", 1);
//        map1.put("banana", 3);
//        System.out.println(map1);

        /* 1.keySet()을 이용해  */
        Iterator<String> keyInter = map.keySet().iterator();

        while (keyInter.hasNext()){
            /* 다음 값이 있니? 있으면 반환 */
            String key = keyInter.next();
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        /* 1-2. */
        System.out.println("======1-2======");
        for (String key :map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        /* 2. 저장 된 value 객체들만 values()로 Collection으로 만든 뒤 iterator로 값에 대한 목록을 만든다. */
        Collection<String> values = map.values();
        /* iterator로 값에 대한 목록을 만든다.  */
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()){
            System.out.println("value : " + valueIter.next());
        }
        /* 2-2. 컬렉션에 스트링타입 */
        System.out.println("======2-2======");
        for (String value :map.values()) {
            System.out.println("values : " + value);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("찾으시는 학번을 적어주세요 : " );
        String str = sc.nextLine();

        Map<String, Integer> maps = new HashMap<>();

        maps.put("2021002", 80 );
        maps.put("2021002", 90 );
        maps.put("2021002", 70 );
        maps.put("2021002", 80 );

        System.out.println(maps);

        // 데이터 읽기


        String studentID = "2021002";
        if (maps.containsKey(studentID)) {
            if (maps.containsKey(str)){
                int score = maps.get(str);
                System.out.println("학번 " + studentID + "의 점수: " + score);
            }
        }else {
            System.out.println("해당 학번의 데이터를 찾을 수 없습니다.");
        }

        /* 3. Map의 내부 클래스인 EntrySet을 이용 : entrySet
        *  엔트리는 키,값이 묶여있는 상태*/
        Set<Map.Entry<String,String>> set = map.entrySet();
        Iterator<Map.Entry<String,String>> entryIter = set.iterator();

        while (entryIter.hasNext()){
            Map.Entry<String ,String> entry = entryIter.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        /* 3-2*/
        System.out.println("======3-2======");
        for (Map.Entry<String ,String> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }
}
