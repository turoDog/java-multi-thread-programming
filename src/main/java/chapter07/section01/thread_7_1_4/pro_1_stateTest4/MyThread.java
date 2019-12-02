package chapter07.section01.thread_7_1_4.pro_1_stateTest4;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section01.thread_7_1_4.pro_1_stateTest4 <br/>
 * Date:2019/12/2 22:26 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        try {
            synchronized (Lock.lock) {
                Lock.lock.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
