package chapter07.section02.thread_7_2_1.pro_1_groupAddThread;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section02.thread_7_2_1.pro_1_groupAddThread <br/>
 * Date:2019/12/2 22:30 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        ThreadA aRunnable = new ThreadA();
        ThreadB bRunnable = new ThreadB();

        ThreadGroup group = new ThreadGroup("一个优秀的废人的线程组");

        Thread aThread = new Thread(group, aRunnable);
        Thread bThread = new Thread(group, bRunnable);
        aThread.start();
        bThread.start();

        System.out.println("活动的线程数为：" + group.activeCount());
        System.out.println("线程组的名称为：" + group.getName());

    }

}
