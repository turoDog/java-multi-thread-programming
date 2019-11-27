package chapter05.section01.thread_5_1_2.pro_4_TimerCancelMethod;

import java.util.Date;
import java.util.TimerTask;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter05.section01.thread_5_1_2.pro_4_TimerCancelMethod <br/>
 * Date:2019/11/27 23:25 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyTaskA extends TimerTask {

    @Override
    public void run() {
        System.out.println("A run timer = " + new Date());
    }

}
