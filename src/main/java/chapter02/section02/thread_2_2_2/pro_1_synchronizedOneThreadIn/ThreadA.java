package chapter02.section02.thread_2_2_2.pro_1_synchronizedOneThreadIn;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_2.pro_1_synchronizedOneThreadIn <br/>
 * Date:2019/11/15 16:07 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class ThreadA extends Thread{

    private ObjectService service;

    public ThreadA(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }

}
