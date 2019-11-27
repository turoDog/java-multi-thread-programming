package chapter04.section01.thread_4_1_15.pro_1_awaitUntilTest;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_15.pro_1_awaitUntilTest <br/>
 * Date:2019/11/27 16:33 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyThreadB extends Thread{

    private Service service;

    public MyThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }

}
