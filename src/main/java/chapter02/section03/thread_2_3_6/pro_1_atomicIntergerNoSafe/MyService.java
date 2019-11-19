package chapter02.section03.thread_2_3_6.pro_1_atomicIntergerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section03.thread_2_3_6.pro_1_atomicIntergerNoSafe <br/>
 * Date:2019/11/19 22:57 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyService {

    public static AtomicLong aiRef = new AtomicLong();

    public void addNum() {
        System.out.println(Thread.currentThread().getName() + "加了100之后的值是:"
                + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }

}
