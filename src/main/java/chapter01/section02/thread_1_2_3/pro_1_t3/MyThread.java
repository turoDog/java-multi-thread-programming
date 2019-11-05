package chapter01.section02.thread_1_2_3.pro_1_t3;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section02.thread_1_2_3.pro_1_t3 <br/>
 * Date:2019/11/5 10:15 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println(" 由 " + this.currentThread().getName()
                    + " 计算，count=" + count);
        }
    }

}
