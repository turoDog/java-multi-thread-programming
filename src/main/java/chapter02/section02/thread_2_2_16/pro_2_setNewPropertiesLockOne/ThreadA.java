package chapter02.section02.thread_2_2_16.pro_2_setNewPropertiesLockOne;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_16.pro_2_setNewPropertiesLockOne <br/>
 * Date:2019/11/18 23:33 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadA extends Thread{

    private Service service;
    private Userinfo userinfo;

    public ThreadA(Service service,
            Userinfo userinfo) {
        super();
        this.service = service;
        this.userinfo = userinfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userinfo);
    }

}
