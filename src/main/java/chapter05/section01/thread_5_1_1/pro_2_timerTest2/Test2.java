package chapter05.section01.thread_5_1_1.pro_2_timerTest2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter05.section01.thread_5_1_1.pro_2_timerTest2 <br/>
 * Date:2019/11/27 17:54 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Test2 {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendarRef1 = Calendar.getInstance();
        calendarRef1.add(Calendar.SECOND, 10);
        Date runDate1 = calendarRef1.getTime();
        System.out.println("计划时间为：" + runDate1);

        Calendar calendarRef2 = Calendar.getInstance();
        calendarRef2.add(Calendar.SECOND, 15);
        Date runDate2 = calendarRef2.getTime();
        System.out.println("计划时间为：" + runDate2);


        MyTask task1 = new MyTask();
        MyTask task2 = new MyTask();

        Timer timer = new Timer();
        timer.schedule(task1, runDate1);
        timer.schedule(task2, runDate2);
    }

}
