package chapter02.section02.thread_2_2_7.pro_1_syncBlockString;



/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_7.pro_1_syncBlockString <br/>
 * Date:2019/11/15 17:28 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class ThreadA extends Thread{

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.setUsernamePassword("a", "aa");
    }

}
