package chapter03.section02.thread_3_2_3.pro_1_joinException;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section02.thread_3_2_3.pro_1_joinException <br/>
 * Date:2019/11/24 17:44 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {

        try {
            ThreadB b = new ThreadB();
            b.start();

            Thread.sleep(500);

            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
