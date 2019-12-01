package chapter06.section07.pro_1_singleton_10;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.section07.pro_1_singleton_10 <br/>
 * Date:2019/12/1 22:24 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
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
