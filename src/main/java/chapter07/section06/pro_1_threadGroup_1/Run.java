package chapter07.section06.pro_1_threadGroup_1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section06.pro_1_threadGroup_1 <br/>
 * Date:2019/12/2 23:23 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("我的线程组");
        MyThread[] myThread = new MyThread[10];
        for (int i = 0; i < myThread.length; i++) {
            myThread[i] = new MyThread(group, "线程" + (i + 1), "1");
            myThread[i].start();
        }
        MyThread newT = new MyThread(group, "报错线程", "a");
        newT.start();
    }

}
