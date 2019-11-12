package chapter01.section07.thread_1_7_2.pro_1_t12;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section07.thread_1_7_2.pro_1_t12 <br/>
 * Date:2019/11/12 16:05 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run3 {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println(" 是否停止 1？="+thread.isInterrupted());
            System.out.println(" 是否停止 2？="+thread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }

}
