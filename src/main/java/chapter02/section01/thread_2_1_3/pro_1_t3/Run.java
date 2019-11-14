package chapter02.section01.thread_2_1_3.pro_1_t3;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section01.thread_2_1_3.pro_1_t3 <br/>
 * Date:2019/11/14 10:39 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {

        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();

        ThreadA athread = new ThreadA(numRef1);
        athread.start();

        ThreadB bthread = new ThreadB(numRef2);
        bthread.start();

    }

}
