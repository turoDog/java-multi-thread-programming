package chapter03.section01.thread_3_1_6.pro_1_notifyOne;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_6.pro_1_notifyOne <br/>
 * Date:2019/11/20 22:45 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class NotifyThread extends Thread{

    private Object lock;

    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
        }
    }

}
