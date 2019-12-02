package chapter07.section02.thread_7_2_1.pro_1_groupAddThread;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section02.thread_7_2_1.pro_1_groupAddThread <br/>
 * Date:2019/12/2 22:30 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadA extends Thread{

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out
                        .println("ThreadName=" +
                                Thread.currentThread().
                                        getName());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
