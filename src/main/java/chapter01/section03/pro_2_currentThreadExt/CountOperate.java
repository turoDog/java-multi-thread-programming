package chapter01.section03.pro_2_currentThreadExt;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section03.pro_2_currentThreadExt <br/>
 * Date:2019/11/5 10:52 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class CountOperate extends Thread{

    public CountOperate() {
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()="
                + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName()="
                + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("run---end");
    }

}
