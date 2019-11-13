package chapter01.section10.pro_1_t18;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section10.pro_1_t18 <br/>
 * Date:2019/11/13 22:46 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread1 extends Thread{

    @Override
    public void run() {
        System.out.println("MyThread1 run priority=" + this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }

}
