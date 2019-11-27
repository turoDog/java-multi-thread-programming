package chapter04.section01.thread_4_1_3.pro_1_UseConditionWaitNotifyError;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_3.pro_1_UseConditionWaitNotifyError <br/>
 * Date:2019/11/26 23:21 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {

        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.start();

    }

}
