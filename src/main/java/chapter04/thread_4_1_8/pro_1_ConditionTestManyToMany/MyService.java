package chapter04.thread_4_1_8.pro_1_ConditionTestManyToMany;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_8.pro_1_ConditionTestManyToMany <br/>
 * Date:2019/11/27 10:21 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void set() {
        try {
            lock.lock();
            while (hasValue) {
                System.out.println("有可能★★连续");
                condition.await();
            }
            System.out.println("打印★");
            hasValue = true;
            //condition.signal();
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void get() {
        try {
            lock.lock();
            while (!hasValue) {
                System.out.println("有可能☆☆连续");
                condition.await();
            }
            System.out.println("打印☆");
            hasValue = false;
            //condition.signal();
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
