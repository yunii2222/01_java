package com.ohgiraffers.section06;

public class StaticFieldTest {
    /* non-static field와  static field 선언 */

    private int nonStaticCount;

    private static int staticCount;

    public int getNonStaticCount() {
        return this.nonStaticCount;
    }

    public int getStaticCount() {
        return StaticFieldTest.staticCount;
    }
    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }
    public void increaseStaticCount() {
        StaticFieldTest.staticCount++;
    }

}
