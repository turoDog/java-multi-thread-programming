package chapter02.section02.thread_2_2_10.pro_1_StringAndSyn2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_10.pro_1_StringAndSyn2 <br/>
 * Date:2019/11/17 23:20 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.print(new Object());
    }

}
