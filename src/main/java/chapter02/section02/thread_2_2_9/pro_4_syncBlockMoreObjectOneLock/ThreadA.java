package chapter02.section02.thread_2_2_9.pro_4_syncBlockMoreObjectOneLock;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_9.pro_4_syncBlockMoreObjectOneLock <br/>
 * Date:2019/11/17 23:02 <br/>
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
        service.printA();
    }

}
