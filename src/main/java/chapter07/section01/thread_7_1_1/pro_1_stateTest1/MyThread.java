package chapter07.section01.thread_7_1_1.pro_1_stateTest1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section01.thread_7_1_1.pro_1_stateTest1 <br/>
 * Date:2019/12/1 22:40 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    public MyThread() {
        System.out.println("构造方法中的状态：" + Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中的状态：" + Thread.currentThread().getState());
    }

}
