package chapter02.section02.thread_2_2_6.pro_1_t8;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_6.pro_1_t8 <br/>
 * Date:2019/11/15 17:01 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();

        MyThread1 thread1 = new MyThread1(task);
        thread1.start();

        Thread.sleep(100);

        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }

}
