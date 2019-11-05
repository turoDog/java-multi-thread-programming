package chapter01.section03.pro_1_t6;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section03.pro_1_t6 <br/>
 * Date:2019/11/5 10:45 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run2 {

    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        // 调用 start 方法意味着，程序把该线程的执行交给线程规划器
        //mythread.start();
        // 直接调用 run 方法跟调用普通方法没区别
        mythread.run();
    }

}
