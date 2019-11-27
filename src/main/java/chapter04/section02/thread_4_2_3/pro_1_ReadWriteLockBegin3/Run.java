package chapter04.section02.thread_4_2_3.pro_1_ReadWriteLockBegin3;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.section02.thread_4_2_3.pro_1_ReadWriteLockBegin3 <br/>
 * Date:2019/11/27 17:24 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {

        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        Thread.sleep(1000);

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

    }

}
