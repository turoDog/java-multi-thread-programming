package chapter05.section01.thread_5_1_3.pro_1_timerTest3;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter05.section01.thread_5_1_3.pro_1_timerTest3 <br/>
 * Date:2019/11/28 14:32 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间:" + new Date());
        timer.schedule(task, 70000);

    }

}
