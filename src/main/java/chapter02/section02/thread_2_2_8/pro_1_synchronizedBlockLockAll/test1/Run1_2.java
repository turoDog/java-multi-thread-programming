package chapter02.section02.thread_2_2_8.pro_1_synchronizedBlockLockAll.test1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_8.pro_1_synchronizedBlockLockAll.test1 <br/>
 * Date:2019/11/17 14:20 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run1_2 {

    public static void main(String[] args) {
        Service service = new Service();
        MyObject object1 = new MyObject();
        MyObject object2 = new MyObject();

        ThreadA a = new ThreadA(service, object1);
        a.setName("a");
        a.start();

        ThreadB b = new ThreadB(service, object2);
        b.setName("b");
        b.start();
    }

}
