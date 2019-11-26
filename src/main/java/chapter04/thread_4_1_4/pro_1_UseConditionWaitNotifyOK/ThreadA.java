package chapter04.thread_4_1_4.pro_1_UseConditionWaitNotifyOK;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_4.pro_1_UseConditionWaitNotifyOK <br/>
 * Date:2019/11/26 23:39 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadA extends Thread{

    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }

}
