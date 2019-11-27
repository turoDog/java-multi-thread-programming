package chapter04.thread_4_1_14.pro_1_awaitUninterruptiblyTest_1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_14.pro_1_awaitUninterruptiblyTest_1 <br/>
 * Date:2019/11/27 16:09 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void testMethod() {
        try {
            lock.lock();
            System.out.println("wait begin");
            condition.await();
            System.out.println("wait   end");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("catch");
        } finally {
            lock.unlock();
        }

    }

}
