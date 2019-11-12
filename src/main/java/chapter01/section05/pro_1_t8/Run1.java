package chapter01.section05.pro_1_t8;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section05.pro_1_t8 <br/>
 * Date:2019/11/12 10:44 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run1 {

    public static void main(String[] args) {
        MyThread1 mythread = new MyThread1();
        System.out.println("begin =" + System.currentTimeMillis());
        mythread.run();
        System.out.println("end   =" + System.currentTimeMillis());
    }

}
