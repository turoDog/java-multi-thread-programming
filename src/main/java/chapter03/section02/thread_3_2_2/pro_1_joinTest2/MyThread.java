package chapter03.section02.thread_3_2_2.pro_1_joinTest2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section02.thread_3_2_2.pro_1_joinTest2 <br/>
 * Date:2019/11/23 16:30 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        try {
            int secondValue = (int) (Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
