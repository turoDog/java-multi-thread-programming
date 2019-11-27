package chapter04.thread_4_1_13.pro_4_tryLock_param;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_13.pro_4_tryLock_param <br/>
 * Date:2019/11/27 16:14 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final MyService service = new MyService();

        Runnable runnableRef = () -> {
            System.out.println(Thread.currentThread().getName()
                    + "调用waitMethod时间：" + System.currentTimeMillis());
            service.waitMethod();
        };

        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
    }

}
