package chapter02.section02.thread_2_2_8.pro_1_synchronizedBlockLockAll.test2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_8.pro_1_synchronizedBlockLockAll.test2 <br/>
 * Date:2019/11/17 22:23 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyObject {

    synchronized public void speedPrintString() {
        System.out.println("speedPrintString ____getLock time="
                + System.currentTimeMillis() + " run ThreadName="
                + Thread.currentThread().getName());
        System.out.println("-----------------");
        System.out.println("speedPrintString releaseLock time="
                + System.currentTimeMillis() + " run ThreadName="
                + Thread.currentThread().getName());
    }

}
