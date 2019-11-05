package chapter01.section03.pro_1_t6;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section03.pro_1_t6 <br/>
 * Date:2019/11/5 10:45 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    public MyThread() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印：" + Thread.currentThread().getName());
    }

}
