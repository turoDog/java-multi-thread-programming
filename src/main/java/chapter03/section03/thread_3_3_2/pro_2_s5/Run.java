package chapter03.section03.thread_3_3_2.pro_2_s5;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section03.thread_3_3_2.pro_1_ThreadLocalTest <br/>
 * Date:2019/11/24 21:09 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            a.start();

            Thread.sleep(1000);

            ThreadB b = new ThreadB();
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
