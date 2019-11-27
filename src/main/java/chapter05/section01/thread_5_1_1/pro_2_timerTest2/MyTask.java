package chapter05.section01.thread_5_1_1.pro_2_timerTest2;

import java.util.Date;
import java.util.TimerTask;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter05.section01.thread_5_1_1.pro_2_timerTest2 <br/>
 * Date:2019/11/27 17:53 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("任务执行了，时间为："+new Date());
    }

}
