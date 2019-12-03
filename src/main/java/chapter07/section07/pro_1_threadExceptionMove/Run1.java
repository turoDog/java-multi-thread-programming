package chapter07.section07.pro_1_threadExceptionMove;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section07.pro_1_threadExceptionMove <br/>
 * Date:2019/12/3 23:14 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run1 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        // 对象
        myThread
                .setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        // 类
        MyThread
                .setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }

}
