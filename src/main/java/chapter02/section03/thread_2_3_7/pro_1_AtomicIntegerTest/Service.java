package chapter02.section03.thread_2_3_7.pro_1_AtomicIntegerTest;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section03.thread_2_3_7.pro_1_AtomicIntegerTest <br/>
 * Date:2019/11/19 23:04 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Service {

    private boolean isContinueRun = true;

    public void runMethod() {
        String anyString = new String();
        while (isContinueRun) {
            synchronized (anyString) {
            }
        }
        System.out.println("停下来了！");
    }

    public void stopMethod() {
        isContinueRun = false;
    }

}
