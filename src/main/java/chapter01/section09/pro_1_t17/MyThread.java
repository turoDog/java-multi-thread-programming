package chapter01.section09.pro_1_t17;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section09.pro_1_t17 <br/>
 * Date:2019/11/13 22:40 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000; i++) {
            //Thread.yield();
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(" 用时：" + (endTime - beginTime) + " 毫秒！");
    }

}
