package chapter06.section05.pro_1_singleton_8;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.section05.pro_1_singleton_8 <br/>
 * Date:2019/12/1 21:48 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.getInstance().hashCode());
        }
    }

}
