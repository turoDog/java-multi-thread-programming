package chapter03.section01.thread_3_1_3.pro_2_test2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_3.pro_2_test2 <br/>
 * Date:2019/11/20 22:09 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Test {

    public static void main(String[] args) {
        try {
            Object lock = new Object();

            MyThread1 t1 = new MyThread1(lock);
            t1.start();

            Thread.sleep(3000);

            MyThread2 t2 = new MyThread2(lock);
            t2.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
