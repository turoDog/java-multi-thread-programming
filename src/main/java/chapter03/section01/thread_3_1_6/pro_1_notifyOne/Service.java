package chapter03.section01.thread_3_1_6.pro_1_notifyOne;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_6.pro_1_notifyOne <br/>
 * Date:2019/11/20 22:45 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() ThreadName="
                        + Thread.currentThread().getName());
                lock.wait();
                System.out.println("  end wait() ThreadName="
                        + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
