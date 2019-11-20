package chapter03.section01.thread_3_1_9.pro_1_firstNotify;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_9.pro_1_firstNotify <br/>
 * Date:2019/11/20 23:05 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyRun {

    private String lock = "";
    private boolean isFirstRunB = false;

    private Runnable runnableA = new Runnable() {
        public void run() {
            try {
                synchronized (lock) {
                    while (!isFirstRunB) {
                        System.out.println("begin wait");
                        lock.wait();
                        System.out.println("end wait");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private Runnable runnableB = new Runnable() {
        public void run() {
            synchronized (lock) {
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
                isFirstRunB = true;

            }
        }
    };

    public static void main(String[] args) throws InterruptedException {

        MyRun run = new MyRun();

        Thread a = new Thread(run.runnableA);
        a.start();

        Thread.sleep(100);

        Thread b = new Thread(run.runnableB);
        b.start();

    }

}
