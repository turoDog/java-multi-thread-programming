package chapter04.section01.thread_4_1_13.pro_1_lockInterruptiblyTest1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_13.pro_1_lockInterruptiblyTest1 <br/>
 * Date:2019/11/27 15:32 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final MyService service = new MyService();
        Runnable runnableRef = service::waitMethod;

        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();// 打标记
        System.out.println("main end!");
    }

}
