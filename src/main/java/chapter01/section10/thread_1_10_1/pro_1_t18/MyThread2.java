package chapter01.section10.thread_1_10_1.pro_1_t18;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section10.pro_1_t18 <br/>
 * Date:2019/11/13 22:47 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread2 extends Thread{

    @Override
    public void run() {
        System.out.println("MyThread2 run priority=" + this.getPriority());
    }

}
