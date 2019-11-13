package chapter01.section10.thread_1_10_4.pro_1_countPriority;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section10.thread_1_10_4.pro_1_countPriority <br/>
 * Date:2019/11/13 23:06 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {

        try {
            ThreadA a = new ThreadA();
            a.setPriority(Thread.NORM_PRIORITY - 3);
            a.start();

            ThreadB b = new ThreadB();
            b.setPriority(Thread.NORM_PRIORITY + 3);
            b.start();

            Thread.sleep(20000);
            a.stop();
            b.stop();

            System.out.println("a=" + a.getCount());
            System.out.println("b=" + b.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
