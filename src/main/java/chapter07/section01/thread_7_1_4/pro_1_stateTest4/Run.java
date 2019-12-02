package chapter07.section01.thread_7_1_4.pro_1_stateTest4;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section01.thread_7_1_4.pro_1_stateTest4 <br/>
 * Date:2019/12/2 22:27 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    // NEW,
    // RUNNABLE,
    // TERMINATED,
    // BLOCKED,
    // WAITING,
    // TIMED_WAITING,

    public static void main(String[] args) {
        try {
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的t状态：" + t.getState());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
