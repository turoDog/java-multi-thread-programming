package chapter04.thread_4_1_15.pro_1_awaitUntilTest;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_15.pro_1_awaitUntilTest <br/>
 * Date:2019/11/27 16:34 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            Calendar calendarRef = Calendar.getInstance();
            calendarRef.add(Calendar.SECOND, 10);
            lock.lock();
            System.out
                    .println("wait begin timer=" + System.currentTimeMillis());
            condition.awaitUntil(calendarRef.getTime());
            System.out
                    .println("wait   end timer=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void notifyMethod() {
        try {
            Calendar calendarRef = Calendar.getInstance();
            calendarRef.add(Calendar.SECOND, 10);
            lock.lock();
            System.out
                    .println("notify begin timer=" + System.currentTimeMillis());
            condition.signalAll();
            System.out
                    .println("notify   end timer=" + System.currentTimeMillis());
        } finally {
            lock.unlock();
        }

    }

}
