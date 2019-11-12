package chapter01.section07.thread_1_7_2.pro_1_t12;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section07.thread_1_7_2.pro_1_t12 <br/>
 * Date:2019/11/12 15:48 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            //Thread.currentThread().interrupt();
            System.out.println("是否停止1？="+thread.interrupted());
            System.out.println("是否停止2？="+thread.interrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }

}
