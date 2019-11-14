package chapter02.section01.thread_2_1_3.pro_1_t3;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section01.thread_2_1_3.pro_1_t3 <br/>
 * Date:2019/11/14 10:38 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class HasSelfPrivateNum {

    private int num = 0;

    /**
     * 加上 synchronized 关键字，表明是同步方法
     * @param username
     */
    synchronized public void addI(String username) {
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num=" + num);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
