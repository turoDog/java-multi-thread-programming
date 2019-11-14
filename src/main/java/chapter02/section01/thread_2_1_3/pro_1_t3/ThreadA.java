package chapter02.section01.thread_2_1_3.pro_1_t3;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section01 <br/>
 * Date:2019/11/14 10:19 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class ThreadA extends Thread{

    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }

}
