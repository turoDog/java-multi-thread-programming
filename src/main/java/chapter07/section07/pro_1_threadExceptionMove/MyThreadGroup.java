package chapter07.section07.pro_1_threadExceptionMove;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section07.pro_1_threadExceptionMove <br/>
 * Date:2019/12/3 23:14 <br/>
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
        System.out.println("线程组的异常处理");
        e.printStackTrace();
    }

}
