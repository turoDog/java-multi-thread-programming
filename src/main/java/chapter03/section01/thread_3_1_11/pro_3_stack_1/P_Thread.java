package chapter03.section01.thread_3_1_11.pro_3_stack_1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_11.pro_3_stack_1 <br/>
 * Date:2019/11/23 14:36 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class P_Thread extends Thread{

    private P p;

    public P_Thread(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.pushService();
        }
    }

}
