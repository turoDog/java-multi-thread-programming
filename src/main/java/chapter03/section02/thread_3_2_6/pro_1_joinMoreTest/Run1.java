package chapter03.section02.thread_3_2_6.pro_1_joinMoreTest;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section02.thread_3_2_6.pro_1_joinMoreTest <br/>
 * Date:2019/11/24 18:23 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run1 {

    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println("                    main end "
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
