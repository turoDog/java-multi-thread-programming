package chapter02.section02.thread_2_2_9.pro_3_syncMoreObjectStaticOneLock;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_9.pro_3_syncMoreObjectStaticOneLock <br/>
 * Date:2019/11/17 22:57 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadB extends Thread{

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printB();
    }

}
