package chapter03.section02.thread_3_2_3.pro_1_joinException;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section02.thread_3_2_3.pro_1_joinException <br/>
 * Date:2019/11/24 17:45 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadA extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = "";
            Math.random();
        }
    }

}
