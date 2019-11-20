package chapter03.section01.thread_3_1_4.pro_2_notifyHoldLock;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_4.pro_2_notifyHoldLock <br/>
 * Date:2019/11/20 22:31 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        ThreadA a = new ThreadA(lock);
        a.start();

        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();

        synNotifyMethodThread c = new synNotifyMethodThread(lock);
        c.start();

    }

}
