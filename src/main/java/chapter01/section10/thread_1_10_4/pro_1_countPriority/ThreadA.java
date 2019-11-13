package chapter01.section10.thread_1_10_4.pro_1_countPriority;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section10.thread_1_10_4.pro_1_countPriority <br/>
 * Date:2019/11/13 23:05 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadA extends Thread{

    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }

}
