package chapter03.section02.thread_3_2_5.pro_2_join_sleep_2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section02.thread_3_2_5.pro_2_join_sleep_2 <br/>
 * Date:2019/11/24 18:14 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadB extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("   b run begin timer="
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("   b run   end timer="
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void bService() {
        System.out.println("打印了bService timer=" + System.currentTimeMillis());
    }

}
