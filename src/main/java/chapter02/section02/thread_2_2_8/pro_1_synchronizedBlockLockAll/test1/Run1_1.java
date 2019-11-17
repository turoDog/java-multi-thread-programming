package chapter02.section02.thread_2_2_8.pro_1_synchronizedBlockLockAll.test1;

import javax.jws.Oneway;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_8.pro_1_synchronizedBlockLockAll.test1 <br/>
 * Date:2019/11/17 14:20 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run1_1 {

    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();

        ThreadA a = new ThreadA(service, object);
        a.setName("a");
        a.start();

        ThreadB b = new ThreadB(service, object);
        b.setName("b");
        b.start();

    }

}
