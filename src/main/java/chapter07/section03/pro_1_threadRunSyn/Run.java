package chapter07.section03.pro_1_threadRunSyn;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section03.pro_1_threadRunSyn <br/>
 * Date:2019/12/2 22:57 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {

        Object lock = new Object();

        MyThread a = new MyThread(lock, "A", 1);
        MyThread b = new MyThread(lock, "B", 2);
        MyThread c = new MyThread(lock, "C", 0);

        a.start();
        b.start();
        c.start();

    }

}
