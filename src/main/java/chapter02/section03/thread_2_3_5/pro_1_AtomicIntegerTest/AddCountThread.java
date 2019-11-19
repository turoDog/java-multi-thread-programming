package chapter02.section03.thread_2_3_5.pro_1_AtomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section03.thread_2_3_5.pro_1_AtomicIntegerTest <br/>
 * Date:2019/11/19 22:51 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class AddCountThread extends Thread{

    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }

}
