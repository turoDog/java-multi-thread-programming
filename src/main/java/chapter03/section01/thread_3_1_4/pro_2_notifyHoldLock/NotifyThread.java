package chapter03.section01.thread_3_1_4.pro_2_notifyHoldLock;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_4.pro_2_notifyHoldLock <br/>
 * Date:2019/11/20 22:31 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class NotifyThread extends Thread{

    private Object lock;

    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }

}
