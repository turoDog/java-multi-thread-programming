package chapter02.section02.thread_2_2_15.pro_1_innerTest;

import chapter02.section02.thread_2_2_15.pro_1_innerTest.OutClass.InnerClass1;
import chapter02.section02.thread_2_2_15.pro_1_innerTest.OutClass.InnerClass2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_15.pro_1_innerTest <br/>
 * Date:2019/11/18 23:09 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        final InnerClass1 in1 = new InnerClass1();
        final InnerClass2 in2 = new InnerClass2();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                in1.method1(in2);
            }
        }, "T1");
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                in1.method2();
            }
        }, "T2");
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                in2.method1();
            }
        }, "T3");
        t1.start();
        t2.start();
        t3.start();
    }

}
