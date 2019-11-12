package chapter01.section07.thread_1_7_3.pro_2_t13forprint;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section07.thread_1_7_3.pro_1_t13 <br/>
 * Date:2019/11/12 16:25 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }

}
