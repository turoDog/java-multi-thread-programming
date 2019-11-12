package chapter01.section07.thread_1_7_3.pro_3_t13_1;

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
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()) {
                    System.out.println(" 已经是停止状态了！我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println(" 我在 for 下面 ");
        } catch (InterruptedException e) {
            System.out.println(" 进 MyThread.java 类 run 方法中的 catch 了！");
            e.printStackTrace();
        }
    }

}
