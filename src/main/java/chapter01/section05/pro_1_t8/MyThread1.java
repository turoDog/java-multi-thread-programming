package chapter01.section05.pro_1_t8;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section05.pro_1_t8 <br/>
 * Date:2019/11/12 10:43 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyThread1 extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("run threadName="
                    + this.currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName="
                    + this.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
