package chapter02.section02.thread_2_2_7.pro_2_syncBlockString2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_7.pro_2_syncBlockString2 <br/>
 * Date:2019/11/15 17:37 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class ThreadB extends Thread{

    private Service service;

    public ThreadB(Service service){
        this.service = service;
    }

    @Override
    public void run(){
        service.b();
    }

}
