package chapter02.section03.thread_2_3_4.pro_1_volatileTestThread;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section03.thread_2_3_4.pro_1_volatileTestThread <br/>
 * Date:2019/11/19 22:28 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        MyThread[] mythreadArray = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            mythreadArray[i] = new MyThread();
        }

        for (int i = 0; i < 100; i++) {
            mythreadArray[i].start();
        }

    }

}
