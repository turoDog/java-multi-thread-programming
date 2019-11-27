package chapter04.section01.thread_4_1_15.pro_1_awaitUntilTest;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_15.pro_1_awaitUntilTest <br/>
 * Date:2019/11/27 16:34 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();

        Thread.sleep(2000);

        MyThreadB myThreadB = new MyThreadB(service);
        myThreadB.start();
    }

}
