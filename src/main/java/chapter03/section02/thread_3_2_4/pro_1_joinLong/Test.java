package chapter03.section02.thread_3_2_4.pro_1_joinLong;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section02.thread_3_2_4.pro_1_joinLong <br/>
 * Date:2019/11/24 17:58 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Test {

    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();

            // threadTest.join(2000);//只等2秒
            Thread.sleep(2000);

            System.out.println("  end timer=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
