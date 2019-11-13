package chapter01.section10.thread_1_10_4.pro_1_countPriority;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section10.thread_1_10_4.pro_1_countPriority <br/>
 * Date:2019/11/13 23:06 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadB extends Thread {

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
