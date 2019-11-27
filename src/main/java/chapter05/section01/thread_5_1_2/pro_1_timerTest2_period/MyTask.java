package chapter05.section01.thread_5_1_2.pro_1_timerTest2_period;

import java.util.Date;
import java.util.TimerTask;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter05.section01.thread_5_1_2.pro_1_timerTest2_period <br/>
 * Date:2019/11/27 23:07 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("任务执行了，时间为："+new Date());
    }

}
