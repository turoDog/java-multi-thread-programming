package chapter04.thread_4_1_7.pro_1_ConditionTest;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_7.pro_1_ConditionTest <br/>
 * Date:2019/11/27 10:13 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();

        MyThreadA a = new MyThreadA(myService);
        a.start();

        MyThreadB b = new MyThreadB(myService);
        b.start();

    }

}
