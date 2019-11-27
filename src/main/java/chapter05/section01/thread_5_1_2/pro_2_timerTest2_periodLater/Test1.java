package chapter05.section01.thread_5_1_2.pro_2_timerTest2_periodLater;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter05.section01.thread_5_1_2.pro_2_timerTest2_periodLater <br/>
 * Date:2019/11/27 23:14 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Test1 {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.add(Calendar.SECOND, 10);
        Date runDate = calendarRef.getTime();
        System.out.println("计划时间为：" + runDate);
        MyTaskA task = new MyTaskA();
        Timer timer = new Timer();
        timer.schedule(task, runDate, 3000);
    }

}
