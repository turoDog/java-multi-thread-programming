package chapter02.section03.thread_2_3_5.pro_1_AtomicIntegerTest;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section03.thread_2_3_5.pro_1_AtomicIntegerTest <br/>
 * Date:2019/11/19 22:52 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        AddCountThread countService = new AddCountThread();

        Thread t1 = new Thread(countService);
        t1.start();

        Thread t2 = new Thread(countService);
        t2.start();

        Thread t3 = new Thread(countService);
        t3.start();

        Thread t4 = new Thread(countService);
        t4.start();

        Thread t5 = new Thread(countService);
        t5.start();

    }

}
