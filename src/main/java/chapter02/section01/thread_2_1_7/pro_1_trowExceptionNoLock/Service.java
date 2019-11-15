package chapter02.section01.thread_2_1_7.pro_1_trowExceptionNoLock;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section01.thread_2_1_7.pro_1_trowExceptionNoLock <br/>
 * Date:2019/11/15 11:48 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Service {

    synchronized public void testMethod() {
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("ThreadName=" + Thread.currentThread().getName()
                    + " run beginTime=" + System.currentTimeMillis());
            int i = 1;
            while (i == 1) {
                if (("" + Math.random()).substring(0, 8).equals("0.123456")) {
                    System.out.println("ThreadName="
                            + Thread.currentThread().getName()
                            + " run   exceptionTime="
                            + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        } else {
            System.out.println("Thread B run Time="
                    + System.currentTimeMillis());
        }
    }

}
