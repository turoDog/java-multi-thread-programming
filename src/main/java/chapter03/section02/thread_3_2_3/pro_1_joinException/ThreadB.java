package chapter03.section02.thread_3_2_3.pro_1_joinException;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section02.thread_3_2_3.pro_1_joinException <br/>
 * Date:2019/11/24 17:45 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadB extends Thread{

    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();

            System.out.println("线程B在run end处打印了");
        } catch (InterruptedException e) {
            System.out.println("线程B在catch处打印了");
            e.printStackTrace();
        }
    }

}
