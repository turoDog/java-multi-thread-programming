package chapter04.section01.thread_4_1_12.pro_1_lockMethodTest3.test1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_12.pro_1_lockMethodTest3.test1 <br/>
 * Date:2019/11/27 15:19 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final Service service1 = new Service(true);
        Runnable runnable = service1::serviceMethod;
        Thread thread = new Thread(runnable);
        thread.start();

        final Service service2 = new Service(false);
        runnable = service2::serviceMethod;
        thread = new Thread(runnable);
        thread.start();

    }

}
