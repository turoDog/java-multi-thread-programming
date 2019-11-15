package chapter02.section01.thread_2_1_6.pro_1_syncLockIn1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section01.thread_2_1_6.pro_1_syncLockIn1 <br/>
 * Date:2019/11/15 11:38 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Service {

    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }

    synchronized private void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized private void service3() {
        System.out.println("service3");
    }

}
