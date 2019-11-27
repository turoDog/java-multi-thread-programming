package chapter04.section01.thread_4_1_2.pro_1_ConditionTestMoreMethod;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_2.pro_1_ConditionTestMoreMethod <br/>
 * Date:2019/11/26 23:09 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadBB extends Thread{

    private MyService service;

    public ThreadBB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }

}
