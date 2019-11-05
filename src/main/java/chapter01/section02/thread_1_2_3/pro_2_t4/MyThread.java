package chapter01.section02.thread_1_2_3.pro_2_t4;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section02.thread_1_2_3.pro_2_t4 <br/>
 * Date:2019/11/5 10:21 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    private int count=5;

    @Override
    //public void run() {
    synchronized public void run() {
        super.run();
        count--;
        System.out.println(" 由 "+this.currentThread().getName()+" 计算，count="+count);

    }

}
