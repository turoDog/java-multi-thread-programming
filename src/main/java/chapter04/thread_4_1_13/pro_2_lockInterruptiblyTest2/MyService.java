package chapter04.thread_4_1_13.pro_2_lockInterruptiblyTest2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_13.pro_2_lockInterruptiblyTest2 <br/>
 * Date:2019/11/27 16:01 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyService {

    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lockInterruptibly();
            System.out.println("lock " + Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
                String newString = "";
                Math.random();
            }
        } catch (InterruptedException e) {
            System.out.println("线程"+Thread.currentThread().getName()+"进入catch~!");
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }

}
