package chapter01.section04.pro_1_t7;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section04.pro_1_t7 <br/>
 * Date:2019/11/5 11:04 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }

}
