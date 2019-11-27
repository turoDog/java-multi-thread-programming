package chapter05.section01.thread_5_1_2.pro_5_TimerCancelError;

import java.util.TimerTask;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter05.section01.thread_5_1_2.pro_5_TimerCancelError <br/>
 * Date:2019/11/27 23:29 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyTaskA extends TimerTask {

    private int i;

    public MyTaskA(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("第" + i + "次没有被cancel取消");
    }

}
