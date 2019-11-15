package chapter02.section01.thread_2_1_8.pro_1_syncExtends;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section01.thread_2_1_8.pro_1_syncExtends <br/>
 * Date:2019/11/15 15:11 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Sub extends Main{

    @Override
    synchronized public void serviceMethod() {
        try {
            System.out.println("int sub 下一步 sleep begin threadName="
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步 sleep end threadName="
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
