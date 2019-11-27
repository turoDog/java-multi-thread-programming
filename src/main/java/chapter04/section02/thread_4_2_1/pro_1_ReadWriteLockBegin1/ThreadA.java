package chapter04.section02.thread_4_2_1.pro_1_ReadWriteLockBegin1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.section02.thread_4_2_1.pro_1_ReadWriteLockBegin1 <br/>
 * Date:2019/11/27 17:04 <br/>
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
        service.read();
    }

}
