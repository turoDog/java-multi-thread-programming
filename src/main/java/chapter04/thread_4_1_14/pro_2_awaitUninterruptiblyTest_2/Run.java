package chapter04.thread_4_1_14.pro_2_awaitUninterruptiblyTest_2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_14.pro_2_awaitUninterruptiblyTest_2 <br/>
 * Date:2019/11/27 16:26 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        try {
            Service service = new Service();
            MyThread myThread = new MyThread(service);
            myThread.start();
            Thread.sleep(3000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
