package chapter03.section01.thread_3_1_11.pro_1_p_r_test;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_11.pro_1_p_r_test <br/>
 * Date:2019/11/21 23:17 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {

        String lock = "";
        P p = new P(lock);
        C r = new C(lock);

        ThreadP pThread = new ThreadP(p);
        ThreadC rThread = new ThreadC(r);

        pThread.start();
        rThread.start();
    }

}
