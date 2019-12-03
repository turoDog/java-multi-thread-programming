package chapter07.section06.pro_2_threadGroup_2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section06.pro_2_threadGroup_2 <br/>
 * Date:2019/12/3 23:08 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThreadGroup extends ThreadGroup{

    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        this.interrupt();
    }

}
