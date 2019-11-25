package chapter04.thread_4_1_1.pro_1_ReentrantLockTest;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_1.pro_1_ReentrantLockTest <br/>
 * Date:2019/11/25 23:12 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    private MyService service;

    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }

}
