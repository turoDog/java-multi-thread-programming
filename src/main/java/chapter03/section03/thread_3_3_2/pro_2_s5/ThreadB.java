package chapter03.section03.thread_3_3_2.pro_2_s5;

import java.util.Date;

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
            for (int i = 0; i < 20; i++) {
                if (Tools.tl.get() == null) {
                    Tools.tl.set(new Date());
                }
                System.out.println("B " + Tools.tl.get().getTime());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
