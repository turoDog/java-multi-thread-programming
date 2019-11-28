package chapter06.section02.pro_2_singleton_2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.section02.pro_2_singleton_2 <br/>
 * Date:2019/11/28 16:20 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }

}
