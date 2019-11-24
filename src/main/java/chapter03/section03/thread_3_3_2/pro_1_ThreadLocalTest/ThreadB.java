package chapter03.section03.thread_3_3_2.pro_1_ThreadLocalTest;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section03.thread_3_3_2.pro_1_ThreadLocalTest <br/>
 * Date:2019/11/24 21:09 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadB extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                if (Tools.tl.get() == null) {
                    Tools.tl.set("ThreadB" + (i + 1));
                } else {
                    System.out.println("ThreadB get Value=" + Tools.tl.get());
                }
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
