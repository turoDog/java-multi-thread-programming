package chapter02.section02.thread_2_2_8.pro_1_synchronizedBlockLockAll.test3;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_8.pro_1_synchronizedBlockLockAll.test3 <br/>
 * Date:2019/11/17 22:30 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyObject {

    public void speedPrintString() {
        synchronized (this) {
            System.out.println("speedPrintString ____getLock time="
                    + System.currentTimeMillis() + " run ThreadName="
                    + Thread.currentThread().getName());
            System.out.println("-----------------");
            System.out.println("speedPrintString releaseLock time="
                    + System.currentTimeMillis() + " run ThreadName="
                    + Thread.currentThread().getName());
        }
    }

}
