package chapter03.section02.thread_3_2_5.pro_1_join_sleep_1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section02.thread_3_2_5.PRO_1_join_sleep_1 <br/>
 * Date:2019/11/24 18:07 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadA extends Thread{

    private ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
                Thread.sleep(6000);
                // Thread.sleep()不释放锁
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
