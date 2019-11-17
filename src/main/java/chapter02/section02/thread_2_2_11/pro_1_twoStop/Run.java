package chapter02.section02.thread_2_2_11.pro_1_twoStop;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_11 <br/>
 * Date:2019/11/17 23:26 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();

        ThreadA athread = new ThreadA(service);
        athread.start();

        ThreadB bthread = new ThreadB(service);
        bthread.start();
    }

}
