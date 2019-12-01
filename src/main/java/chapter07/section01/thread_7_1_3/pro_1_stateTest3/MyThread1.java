package chapter07.section01.thread_7_1_3.pro_1_stateTest3;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section01.thread_7_1_3.pro_1_stateTest3 <br/>
 * Date:2019/12/1 22:49 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread1 extends Thread{

    @Override
    public void run() {
        MyService.serviceMethod();
    }

}
