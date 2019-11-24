package chapter03.section02.thread_3_2_5.pro_2_join_sleep_2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section02.thread_3_2_5.pro_2_join_sleep_2 <br/>
 * Date:2019/11/24 18:14 <br/>
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
                b.join();// 说明join释放锁了
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String newString = "";
                    Math.random();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
