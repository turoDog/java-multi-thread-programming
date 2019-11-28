package chapter06.section02.pro_4_singleton_2_2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.section02.pro_4_singleton_2_2 <br/>
 * Date:2019/11/28 16:57 <br/>
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

        // 此版本代码虽然是正确的
        // 但public static MyObject getInstance()方法
        // 中的全部代码都是同步的了，这样做有损效率
    }

}
