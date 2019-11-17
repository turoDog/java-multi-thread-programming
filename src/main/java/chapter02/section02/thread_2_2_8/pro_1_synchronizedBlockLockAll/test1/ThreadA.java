package chapter02.section02.thread_2_2_8.pro_1_synchronizedBlockLockAll.test1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_8.pro_1_synchronizedBlockLockAll.test1 <br/>
 * Date:2019/11/17 14:20 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadA extends Thread{

    private Service service;
    private MyObject object;

    public ThreadA(Service service, MyObject object){
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run(){
        super.run();
        service.testMethod1(object);
    }

}
