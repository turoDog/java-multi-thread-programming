package chapter03.section01.thread_3_1_14.pro_1_wait_notify_insert_test;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_14.pro_1_wait_notify_insert_test <br/>
 * Date:2019/11/23 16:05 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class DBTools {

    volatile private boolean prevIsA = false;

    synchronized public void backupA() {
        try {
            while (prevIsA) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("★★★★★");
            }
            prevIsA = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB() {
        try {
            while (!prevIsA) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("☆☆☆☆☆");
            }
            prevIsA = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
