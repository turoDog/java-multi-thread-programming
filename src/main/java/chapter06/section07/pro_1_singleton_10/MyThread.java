package chapter06.section07.pro_1_singleton_10;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.section07.pro_1_singleton_10 <br/>
 * Date:2019/12/1 22:24 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.getConnection().hashCode());
        }
    }

}
