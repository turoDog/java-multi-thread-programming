package chapter02.section03.thread_2_3_7.pro_1_AtomicIntegerTest;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section03.thread_2_3_7.pro_1_AtomicIntegerTest <br/>
 * Date:2019/11/19 23:04 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadA extends Thread{

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }

}
