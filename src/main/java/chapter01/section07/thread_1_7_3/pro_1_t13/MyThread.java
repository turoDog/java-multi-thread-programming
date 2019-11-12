package chapter01.section07.thread_1_7_3.pro_1_t13;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section07.thread_1_7_3.pro_1_t13 <br/>
 * Date:2019/11/12 16:25 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()) {
                System.out.println(" 已经是停止状态了 ! 我要退出了 !");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
    }

}
