package chapter07.section05.pro_1_threadCreateException;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section05.pro_1_threadCreateException <br/>
 * Date:2019/12/2 23:15 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Main2 {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("线程t1");
        t1.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程:" + t.getName() + " 出现了异常：");
                e.printStackTrace();
            }
        });
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("线程t2");
        t2.start();
    }

}
