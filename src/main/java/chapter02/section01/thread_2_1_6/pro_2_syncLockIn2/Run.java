package chapter02.section01.thread_2_1_6.pro_2_syncLockIn2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section01.thread_2_1_6.pro_2_syncLockIn2 <br/>
 * Date:2019/11/15 11:41 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }

}
