package chapter04.section01.thread_4_1_10.pro_1_lockMethodTest1.test2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_10.pro_1_lockMethodTest1.test2 <br/>
 * Date:2019/11/27 11:48 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();

        Runnable runnable = service::serviceMethod1;

        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
        Thread.sleep(2000);
        System.out.println("有线程数：" + service.lock.getQueueLength() + "在等待获取锁！");

    }

}
