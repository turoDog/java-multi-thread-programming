package chapter04.section02.thread_4_2_2.pro_1_ReadWriteLockBegin2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.section02.thread_4_2_2.pro_1_ReadWriteLockBegin2 <br/>
 * Date:2019/11/27 17:15 <br/>
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
        service.write();
    }

}
