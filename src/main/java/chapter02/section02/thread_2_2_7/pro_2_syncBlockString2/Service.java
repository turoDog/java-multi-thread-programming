package chapter02.section02.thread_2_2_7.pro_2_syncBlockString2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_7.pro_2_syncBlockString2 <br/>
 * Date:2019/11/15 17:37 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Service {

    private String anyString = new String();

    public void a() {
        try {
            synchronized (anyString) {
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a   end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void b() {
        System.out.println("b begin");
        System.out.println("b   end");
    }

}
