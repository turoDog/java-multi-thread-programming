package chapter05.section01.thread_5_1_2.pro_5_TimerCancelError;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter05.section01.thread_5_1_2.pro_5_TimerCancelError <br/>
 * Date:2019/11/27 23:29 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Test {

    public static void main(String[] args) {
        int i = 0;
        Calendar canlendarRef1 = Calendar.getInstance();
        Date runDate1 = canlendarRef1.getTime();
        while(true) {
            i++;
            Timer timer = new Timer();
            MyTaskA task1 = new MyTaskA(i);
            timer.schedule(task1, runDate1);
            timer.cancel();
        }
    }

}
