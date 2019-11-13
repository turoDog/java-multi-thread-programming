package chapter01.section10.thread_1_10_3.pro_1_t20;

import java.util.Random;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section10.thread1_10_2.pro_1_t19 <br/>
 * Date:2019/11/13 22:55 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("★★★★★thread 1 use time=" + (endTime - beginTime));
    }

}
