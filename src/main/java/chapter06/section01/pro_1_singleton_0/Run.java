package chapter06.section01.pro_1_singleton_0;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.pro_1_singleton_0 <br/>
 * Date:2019/11/28 15:57 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }

}
