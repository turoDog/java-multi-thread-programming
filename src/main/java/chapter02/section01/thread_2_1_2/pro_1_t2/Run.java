package chapter02.section01.thread_2_1_2.pro_1_t2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section01.thread_2_1_2.pro_1_t2 <br/>
 * Date:2019/11/14 10:28 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();

        ThreadA athread = new ThreadA(numRef);
        athread.start();

        ThreadB bthread = new ThreadB(numRef);
        bthread.start();
    }

}
