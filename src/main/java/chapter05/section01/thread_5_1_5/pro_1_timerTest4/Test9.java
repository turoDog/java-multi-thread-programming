package chapter05.section01.thread_5_1_5.pro_1_timerTest4;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter05.section01.thread_5_1_5.pro_1_timerTest4 <br/>
 * Date:2019/11/28 15:23 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Test9 {

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("begin timer = " + new Date());
            System.out.println("  end timer = " + new Date());
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        System.out.println("现在执行时间：" + new Date());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 20);
        Date runDate = calendarRef.getTime();
        System.out.println("计划执行时间：" + runDate);
        Timer timer = new Timer();
        timer.schedule(task, runDate, 2000);
    }

}
