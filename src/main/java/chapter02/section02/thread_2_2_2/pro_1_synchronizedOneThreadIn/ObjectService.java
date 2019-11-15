package chapter02.section02.thread_2_2_2.pro_1_synchronizedOneThreadIn;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_2.pro_1_synchronizedOneThreadIn <br/>
 * Date:2019/11/15 16:07 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class ObjectService {

    public void serviceMethod() {
        try {
            synchronized (this) {
                System.out.println("begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end    end=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
