package chapter03.section01.thread_3_1_6.pro_1_notifyOne;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_6.pro_1_notifyOne <br/>
 * Date:2019/11/20 22:46 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        ThreadA a = new ThreadA(lock);
        a.start();

        ThreadB b = new ThreadB(lock);
        b.start();

        ThreadC c = new ThreadC(lock);
        c.start();

        Thread.sleep(1000);

        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();

    }

}
