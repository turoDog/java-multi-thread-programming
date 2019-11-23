package chapter03.section02.thread_3_2_2.pro_1_joinTest2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section02.thread_3_2_2.pro_1_joinTest2 <br/>
 * Date:2019/11/23 16:31 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Test {

    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join();

            System.out.println("我想当threadTest对象执行完毕后我再执行，我做到了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
