package chapter05.section01.thread_5_1_1.pro_3_taskLater;

import java.util.Date;
import java.util.TimerTask;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter05.section01.thread_5_1_1.pro_3_taskLater <br/>
 * Date:2019/11/27 22:55 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyTaskB extends TimerTask {

    @Override
    public void run() {
        System.out.println("B begin timer = " + new Date());
        System.out.println("B   end timer = " + new Date());
    }

}
