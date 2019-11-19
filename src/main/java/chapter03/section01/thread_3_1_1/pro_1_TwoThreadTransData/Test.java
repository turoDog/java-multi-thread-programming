package chapter03.section01.thread_3_1_1.pro_1_TwoThreadTransData;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_1.pro_1_synchronizedUpdateNewValue <br/>
 * Date:2019/11/19 23:32 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Test {

    public static void main(String[] args) {
        MyList service = new MyList();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

    }

}
