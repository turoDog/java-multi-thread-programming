package chapter02.section02.thread_2_2_16.pro_2_setNewPropertiesLockOne;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_16.pro_2_setNewPropertiesLockOne <br/>
 * Date:2019/11/18 23:33 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Service {

    public void serviceMethodA(Userinfo userinfo) {
        synchronized (userinfo) {
            try {
                System.out.println(Thread.currentThread().getName());
                userinfo.setUsername("abcabcabc");
                Thread.sleep(3000);
                System.out.println("end! time=" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
