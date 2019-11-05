package chapter01.section04.pro_1_t7;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section04.pro_1_t7 <br/>
 * Date:2019/11/5 11:04 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        MyThread mythread = new MyThread();
        System.out.println("begin ==" + mythread.isAlive());
        mythread.start();
        // 主线程休眠
        //Thread.sleep(1000);
        System.out.println("end ==" + mythread.isAlive());
    }

}
