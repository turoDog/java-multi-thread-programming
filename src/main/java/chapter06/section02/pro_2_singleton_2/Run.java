package chapter06.section02.pro_2_singleton_2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.section02.pro_2_singleton_2 <br/>
 * Date:2019/11/28 16:20 <br/>
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
