package chapter01.section10.thread_1_10_3.pro_1_t20;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section10.pro_1_t18 <br/>
 * Date:2019/11/13 22:47 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(5);
            thread1.start();

            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(6);
            thread2.start();
        }
    }

}
