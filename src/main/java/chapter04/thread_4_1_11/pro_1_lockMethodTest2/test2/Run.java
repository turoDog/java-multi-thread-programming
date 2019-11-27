package chapter04.thread_4_1_11.pro_1_lockMethodTest2.test2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_11.pro_1_lockMethodTest2.test2 <br/>
 * Date:2019/11/27 15:00 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();

        Runnable runnable = service::waitMethod;

        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
        Thread.sleep(2000);
        service.notityMethod();
    }

}