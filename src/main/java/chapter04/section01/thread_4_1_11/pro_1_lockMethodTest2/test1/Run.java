package chapter04.section01.thread_4_1_11.pro_1_lockMethodTest2.test1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_11.pro_1_lockMethodTest2.test1 <br/>
 * Date:2019/11/27 14:59 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();

        Runnable runnable = service::waitMethod;

        Thread threadA = new Thread(runnable);
        threadA.start();

        Thread.sleep(500);

        Thread threadB = new Thread(runnable);
        threadB.start();

        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());
    }

}
