package chapter03.section02.thread_3_2_5.pro_2_join_sleep_2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section02.thread_3_2_5.pro_2_join_sleep_2 <br/>
 * Date:2019/11/24 18:14 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {

        try {
            ThreadB b = new ThreadB();

            ThreadA a = new ThreadA(b);
            a.start();

            Thread.sleep(1000);

            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
