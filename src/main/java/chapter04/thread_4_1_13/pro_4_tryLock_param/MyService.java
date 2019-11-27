package chapter04.thread_4_1_13.pro_4_tryLock_param;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_13.pro_4_tryLock_param <br/>
 * Date:2019/11/27 16:14 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyService {

    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println("      " + Thread.currentThread().getName()
                        + "获得锁的时间：" + System.currentTimeMillis());
                Thread.sleep(10000);
            } else {
                System.out.println("      " + Thread.currentThread().getName()
                        + "没有获得锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }

}
