package chapter01.section02.thread_1_2_1.pro_2_random_thread;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section02.thread_1_2_1.pro_2_random_thread <br/>
 * Date:2019/11/5 9:33 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
