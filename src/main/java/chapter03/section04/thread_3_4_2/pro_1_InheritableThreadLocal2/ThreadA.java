package chapter03.section04.thread_3_4_2.pro_1_InheritableThreadLocal2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section04.thread_3_4_1.pro_1_InheritableThreadLocal1 <br/>
 * Date:2019/11/24 21:33 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadA extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在ThreadA线程中取值=" + Tools.tl.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
