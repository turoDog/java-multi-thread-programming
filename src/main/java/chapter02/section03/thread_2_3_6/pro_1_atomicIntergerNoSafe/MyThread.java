package chapter02.section03.thread_2_3_6.pro_1_atomicIntergerNoSafe;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section03.thread_2_3_6.pro_1_atomicIntergerNoSafe <br/>
 * Date:2019/11/19 22:58 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    private MyService mySerivce;

    public MyThread(MyService mySerivce) {
        super();
        this.mySerivce = mySerivce;
    }

    @Override
    public void run() {
        mySerivce.addNum();
    }

}
