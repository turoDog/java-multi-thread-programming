package chapter04.section01.thread_4_1_14.pro_1_awaitUninterruptiblyTest_1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_14.pro_1_awaitUninterruptiblyTest_1 <br/>
 * Date:2019/11/27 16:08 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    private Service service;

    public MyThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }

}
