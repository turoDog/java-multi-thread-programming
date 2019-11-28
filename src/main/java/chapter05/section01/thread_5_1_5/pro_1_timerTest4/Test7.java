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
public class Test7 {

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("begin timer = "+ System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("  end timer = "+ System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Calendar calendarRef = Calendar.getInstance();
        Date runDate1 = calendarRef.getTime();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task,runDate1,2000);
    }

}
