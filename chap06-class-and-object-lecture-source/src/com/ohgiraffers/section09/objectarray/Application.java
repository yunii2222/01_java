package com.ohgiraffers.section09.objectarray;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /* 객체 배열에 대해 이해할 수 있다. */

        /* 동일 타입의 인스턴스를 여러 개 사용해야 할 때 객체 배열을 이용하면 보다 효율적으로 사용이 가능하다. */
        Car[] carArray = new Car[5];

        /* carArray의 각 인덱스는 기본 값null로 초기화 되어 있기 때문에 인덱스별로 인스턴스를 생성해야 한다. */
        carArray[0] = new Car( "벤츠1", 100 );
        carArray[1] = new Car( "벤츠2", 200 );
        carArray[2] = new Car( "벤츠3", 300 );
        carArray[3] = new Car( "벤츠4", 400 );
        carArray[4] = new Car( "벤츠5", 500 );

        /* 배열은 반복문을 통해 일괄 처리가 가능하다는 장점이 있다. */
        for (int i = 0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }

        System.out.println(" ");
        System.out.println("향상된 for문으로 활용한 배열 -> ");

        /* 객체 배열도 할당과 동시에 초기화 할 수 있다. */
        Car[] carArray2 = {
                new Car( "벤츠1", 100 ),
                new Car( "벤츠2", 200 ),
                new Car( "벤츠3", 300 ),
                new Car( "벤츠4", 400 ),
                new Car( "벤츠5", 500 )
        };

            for ( Car car:carArray2 ) {
                car.driveMaxSpeed();
        }
    }
}
