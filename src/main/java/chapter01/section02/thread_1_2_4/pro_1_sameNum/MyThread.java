package chapter01.section02.thread_1_2_4.pro_1_sameNum;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section02.thread_1_2_4.pro_1_sameNum <br/>
 * Date:2019/11/5 10:38 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    private int i = 5;

    @Override
    public void run() {
        System.out.println("i=" + (i--) + " threadName="
                + Thread.currentThread().getName());
    }

}
