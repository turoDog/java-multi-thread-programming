package chapter01.section04.pro_2_isalive;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section04.pro_2_isalive <br/>
 * Date:2019/11/12 10:19 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class CountOperate extends Thread{

    public CountOperate(){
        System.out.println("CountOperate---begin");

        System.out.println("Thread.currentThread().getName()="
                + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="
                + Thread.currentThread().isAlive());

        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());

        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");

        System.out.println("Thread.currentThread().getName()="
                + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="
                + Thread.currentThread().isAlive());

        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());

        System.out.println("run---end");
    }
}
