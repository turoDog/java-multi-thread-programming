package chapter03.section01.thread_3_1_8.pro_1_waitHasParamMethod;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_8.pro_1_waitHasParamMethod <br/>
 * Date:2019/11/20 22:55 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyRunnable {

    static private Object lock = new Object();
    static private Runnable runnable1 = new Runnable() {
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin timer="
                            + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait   end timer="
                            + System.currentTimeMillis());
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    static private Runnable runnable2 = new Runnable() {
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin timer="
                        + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify   end timer="
                        + System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(runnable1);
        t1.start();
        Thread.sleep(3000);
        Thread t2 = new Thread(runnable2);
        t2.start();
    }

}
