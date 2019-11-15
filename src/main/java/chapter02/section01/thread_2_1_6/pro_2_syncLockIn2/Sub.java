package chapter02.section01.thread_2_1_6.pro_2_syncLockIn2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section01.thread_2_1_6.pro_2_syncLockIn2 <br/>
 * Date:2019/11/15 11:41 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Sub extends Main{

    synchronized public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
