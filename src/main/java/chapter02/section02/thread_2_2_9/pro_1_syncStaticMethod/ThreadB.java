package chapter02.section02.thread_2_2_9.pro_1_syncStaticMethod;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_9.pro_1_syncStaticMethod <br/>
 * Date:2019/11/17 22:37 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadB extends Thread{

    @Override
    public void run() {
        Service.printB();
    }

}
