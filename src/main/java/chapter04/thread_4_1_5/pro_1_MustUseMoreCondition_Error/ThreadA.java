package chapter04.thread_4_1_5.pro_1_MustUseMoreCondition_Error;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_5.pro_1_MustUseMoreCondition_Error <br/>
 * Date:2019/11/26 23:43 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadA extends Thread{

    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }

}
