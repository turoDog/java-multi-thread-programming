package chapter02.section02.thread_2_2_8.pro_1_synchronizedBlockLockAll.test2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_8.pro_1_synchronizedBlockLockAll.test2 <br/>
 * Date:2019/11/17 22:23 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Service {

    public void testMethod1(MyObject object) {
        synchronized (object) {
            try {
                System.out.println("testMethod1 ____getLock time="
                        + System.currentTimeMillis() + " run ThreadName="
                        + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("testMethod1 releaseLock time="
                        + System.currentTimeMillis() + " run ThreadName="
                        + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
