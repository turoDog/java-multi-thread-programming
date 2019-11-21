package chapter03.section01.thread_3_1_11.pro_1_p_r_test;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_11.pro_1_p_r_test <br/>
 * Date:2019/11/21 23:17 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadP extends Thread{

    private P p;

    public ThreadP(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }

}
