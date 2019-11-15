package chapter02.section02.thread_2_2_5.pro_1_doubleSynBlockOneTwo;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_5.pro_1_doubleSynBlockOneTwo <br/>
 * Date:2019/11/15 16:55 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class ThreadB extends Thread{

    private ObjectService service;

    public ThreadB(ObjectService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }

}
