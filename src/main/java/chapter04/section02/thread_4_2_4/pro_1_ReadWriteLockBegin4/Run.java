package chapter04.section02.thread_4_2_4.pro_1_ReadWriteLockBegin4;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.section02.thread_4_2_4.pro_1_ReadWriteLockBegin4 <br/>
 * Date:2019/11/27 17:26 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {

        Service service = new Service();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        Thread.sleep(1000);

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

    }

}
