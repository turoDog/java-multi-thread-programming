package chapter07.section07.pro_1_threadExceptionMove;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section07.pro_1_threadExceptionMove <br/>
 * Date:2019/12/3 23:14 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class StateUncaughtExceptionHandler implements UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("静态的异常处理");
        e.printStackTrace();
    }

}
