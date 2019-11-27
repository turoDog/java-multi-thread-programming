package chapter05.section01.thread_5_1_2.pro_2_timerTest2_periodLater;

import java.util.Date;
import java.util.TimerTask;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter05.section01.thread_5_1_2.pro_2_timerTest2_periodLater <br/>
 * Date:2019/11/27 23:14 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyTaskA extends TimerTask {

    @Override
    public void run() {
        try {
            System.out.println("A begin timer = " + new Date());
            Thread.sleep(5000);
            System.out.println("A   end timer = " + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
