package chapter02.section02.thread_2_2_14.pro_1_innerTest;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_14.pro_1_innerTest <br/>
 * Date:2019/11/18 23:03 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class OutClass {

    static class Inner{
        public void method1() {
            synchronized ("其他的锁") {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread()
                            .getName() + " i=" + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }

        public synchronized void method2() {
            for (int i = 11; i <= 20; i++) {
                System.out.println(Thread.currentThread()
                        .getName() + " i=" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
    }

}
