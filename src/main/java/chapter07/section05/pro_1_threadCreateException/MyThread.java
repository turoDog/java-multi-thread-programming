package chapter07.section05.pro_1_threadCreateException;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section05.pro_1_threadCreateException <br/>
 * Date:2019/12/2 23:16 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        String username = null;
        System.out.println(username.hashCode());
    }

}
