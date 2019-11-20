package chapter03.section01.thread_3_1_10.pro_1_waitOld;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_10.pro_1_waitOld <br/>
 * Date:2019/11/20 23:19 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadSubtract extends Thread{

    private Subtract r;

    public ThreadSubtract(Subtract r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();
    }

}
