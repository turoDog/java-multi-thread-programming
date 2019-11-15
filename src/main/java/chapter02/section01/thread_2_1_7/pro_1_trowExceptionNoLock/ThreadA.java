package chapter02.section01.thread_2_1_7.pro_1_trowExceptionNoLock;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section01.thread_2_1_7.pro_1_trowExceptionNoLock <br/>
 * Date:2019/11/15 11:49 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class ThreadA extends Thread{

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }

}
