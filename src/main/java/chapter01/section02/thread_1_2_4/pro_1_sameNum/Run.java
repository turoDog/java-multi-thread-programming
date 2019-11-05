package chapter01.section02.thread_1_2_4.pro_1_sameNum;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section02.thread_1_2_4.pro_1_sameNum <br/>
 * Date:2019/11/5 10:38 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {

        MyThread run = new MyThread();

        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);
        Thread t5 = new Thread(run);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

}
