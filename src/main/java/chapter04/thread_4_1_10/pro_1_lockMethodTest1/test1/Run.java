package chapter04.thread_4_1_10.pro_1_lockMethodTest1.test1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_10.pro_1_lockMethodTest1.test1 <br/>
 * Date:2019/11/27 11:48 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        service.serviceMethod1();
    }

}
