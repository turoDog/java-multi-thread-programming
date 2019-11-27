package chapter04.thread_4_1_9.pro_1_Fair_noFair_test;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_9.pro_1_Fair_noFair_test <br/>
 * Date:2019/11/27 11:39 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class RunFair {

    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service(true);

        Runnable runnable = () -> {
            System.out.println("★线程" + Thread.currentThread().getName()
                    + "运行了");
            service.serviceMethod();
        };

        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }

    }

}
