package chapter02.section02.thread_2_2_8.pro_1_synchronizedBlockLockAll.test2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_8.pro_1_synchronizedBlockLockAll.test2 <br/>
 * Date:2019/11/17 22:23 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyObject object = new MyObject();

        ThreadA a = new ThreadA(service, object);
        a.setName("a");
        a.start();

        Thread.sleep(100);

        ThreadB b = new ThreadB(object);
        b.setName("b");
        b.start();
    }

}
