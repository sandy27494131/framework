package com.qianshanding.framework.test.dynamicinterface;

/**
 * Created by fish on 2016/12/27.
 */
public class Test {
    public static void main(String[] args) {
        TestInter instance = Util.getInstance(
                TestInter.class, new TestInstance());
        instance.draw();
        System.out.println("---------------------");
        instance.saveData("aaa");
        System.out.println("---------------------");
        instance.runHttp();
    }
}
