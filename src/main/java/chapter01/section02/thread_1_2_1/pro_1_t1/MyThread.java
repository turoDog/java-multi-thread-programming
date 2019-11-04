package chapter01.section02.thread_1_2_1.pro_1_t1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section02.thread_1_2_1.pro_1_t1 <br/>
 * Date:2019/11/4 18:09 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }

}
