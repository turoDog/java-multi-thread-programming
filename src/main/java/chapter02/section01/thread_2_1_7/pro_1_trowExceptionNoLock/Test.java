package chapter02.section01.thread_2_1_7.pro_1_trowExceptionNoLock;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section01.thread_2_1_7.pro_1_trowExceptionNoLock <br/>
 * Date:2019/11/15 11:49 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Test {

    public static void main(String[] args) {
        try {
            Service service = new Service();

            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();

            Thread.sleep(500);

            ThreadB b = new ThreadB(service);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
