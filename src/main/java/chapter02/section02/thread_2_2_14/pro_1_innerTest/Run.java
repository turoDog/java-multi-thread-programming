package chapter02.section02.thread_2_2_14.pro_1_innerTest;

import chapter02.section02.thread_2_2_14.pro_1_innerTest.OutClass.Inner;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_14.pro_1_innerTest <br/>
 * Date:2019/11/18 23:03 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {

        final Inner inner = new Inner();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                inner.method1();
            }
        }, "A");

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                inner.method2();
            }
        }, "B");

        t1.start();
        t2.start();

    }

}
