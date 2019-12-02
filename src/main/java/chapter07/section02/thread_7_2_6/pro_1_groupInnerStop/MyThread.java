package chapter07.section02.thread_7_2_6.pro_1_groupInnerStop;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section02.thread_7_2_6.pro_1_groupInnerStop <br/>
 * Date:2019/12/2 22:47 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        System.out.println("ThreadName=" + Thread.currentThread().getName()
                + "准备开始死循环了：)");
        while (!this.isInterrupted()) {
        }
        System.out.println("ThreadName=" + Thread.currentThread().getName()
                + "结束了：)");
    }

}
