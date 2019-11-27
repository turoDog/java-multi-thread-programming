package chapter04.section01.thread_4_1_11.pro_1_lockMethodTest2.test1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_11.pro_1_lockMethodTest2.test1 <br/>
 * Date:2019/11/27 14:59 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Service {

    public ReentrantLock lock = new ReentrantLock();
    public Condition newCondition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
