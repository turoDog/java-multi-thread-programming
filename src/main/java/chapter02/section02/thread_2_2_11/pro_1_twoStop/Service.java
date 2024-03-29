package chapter02.section02.thread_2_2_11.pro_1_twoStop;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_11.pro_1_twoStop <br/>
 * Date:2019/11/17 23:26 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Service {

    public void methodA() {
        Object object1 = new Object();
        synchronized (object1) {
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            while (isContinueRun) {
            }
            System.out.println("methodA end");
        }
    }

    public void methodB() {
        Object object2 = new Object();
        synchronized (object2) {
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }

}
