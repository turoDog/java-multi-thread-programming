package chapter04.section01.thread_4_1_10.pro_1_lockMethodTest1.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_10.pro_1_lockMethodTest1.test3 <br/>
 * Date:2019/11/27 11:49 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();
    private Condition newCondition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();
            newCondition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notityMethod() {
        try {
            lock.lock();
            System.out.println("有" + lock.getWaitQueueLength(newCondition)
                    + "个线程正在等待newCondition");
            newCondition.signal();
        } finally {
            lock.unlock();
        }
    }

}
