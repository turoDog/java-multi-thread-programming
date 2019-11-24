package chapter03.section02.thread_3_2_6.pro_1_joinMoreTest;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section02.thread_3_2_6.pro_1_joinMoreTest <br/>
 * Date:2019/11/24 18:24 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadB extends Thread{

    @Override
    synchronized public void run() {
        try {
            System.out.println("begin B ThreadName="
                    + Thread.currentThread().getName() + "  "
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  end B ThreadName="
                    + Thread.currentThread().getName() + "  "
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
