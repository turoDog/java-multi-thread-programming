package chapter02.section01.thread_2_1_4.pro_1_t1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section01.thread_2_1_4.pro_1_t1 <br/>
 * Date:2019/11/14 10:53 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class ThreadB extends Thread{

    private MyObject object;

    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }

}
