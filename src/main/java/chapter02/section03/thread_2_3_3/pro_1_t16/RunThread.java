package chapter02.section03.thread_2_3_3.pro_1_t16;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section03.thread_2_3_3.pro_1_t16 <br/>
 * Date:2019/11/19 17:36 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class RunThread extends Thread{

    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRunning) {
        }
        System.out.println("线程被停止了！");
    }

}
