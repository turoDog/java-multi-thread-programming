package chapter01.section07.thread_1_7_2.pro_1_t12;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section07.thread_1_7_2.pro_1_t12 <br/>
 * Date:2019/11/12 15:47 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }

}
