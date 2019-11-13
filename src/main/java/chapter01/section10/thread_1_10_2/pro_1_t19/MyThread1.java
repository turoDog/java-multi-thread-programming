package chapter01.section10.thread_1_10_2.pro_1_t19;

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
        long addResult = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("★★★★★thread 1 use time=" + (endTime - beginTime));
    }

}
