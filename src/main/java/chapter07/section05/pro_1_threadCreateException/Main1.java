package chapter07.section05.pro_1_threadCreateException;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section05.pro_1_threadCreateException <br/>
 * Date:2019/12/2 23:15 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Main1 {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }

}
