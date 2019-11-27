package chapter04.section01.thread_4_1_4.pro_1_UseConditionWaitNotifyOK;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_4.pro_1_UseConditionWaitNotifyOK <br/>
 * Date:2019/11/26 23:38 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {

        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.start();

        Thread.sleep(3000);

        service.signal();

    }

}
