package chapter07.section07.pro_1_threadExceptionMove;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section07.pro_1_threadExceptionMove <br/>
 * Date:2019/12/3 23:14 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run2 {

    public static void main(String[] args) {
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread myThread = new MyThread(group, "我的线程");
        // 对象
        // myThread
        // .setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        // 类
        // MyThread
        // .setDefaultUncaughtExceptionHandler(new
        // StateUncaughtExceptionHandler());
        myThread.start();

    }

}
