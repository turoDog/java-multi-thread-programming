package chapter01.section02.thread_1_2_2.pro_1_t2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section02.thread_1_2_2.pro_1_t2 <br/>
 * Date:2019/11/5 9:42 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("运行中！");
    }

}
