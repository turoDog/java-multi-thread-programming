package chapter04.thread_4_1_3.pro_2_z3ok;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_3.pro_2_z3ok <br/>
 * Date:2019/11/26 23:29 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThreadA extends Thread{

    private MyService myService;

    public MyThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.waitMethod();
    }

}
