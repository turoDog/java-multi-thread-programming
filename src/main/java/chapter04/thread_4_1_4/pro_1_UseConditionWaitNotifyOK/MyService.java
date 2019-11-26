package chapter04.thread_4_1_4.pro_1_UseConditionWaitNotifyOK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_4.pro_1_UseConditionWaitNotifyOK <br/>
 * Date:2019/11/26 23:38 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyService {

    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public void await() {
        try {
            lock.lock();
            System.out.println(" await时间为" + System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signal() {
        try {
            lock.lock();
            System.out.println("signal时间为" + System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

}
