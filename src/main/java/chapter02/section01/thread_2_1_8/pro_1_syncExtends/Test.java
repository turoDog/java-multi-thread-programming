package chapter02.section01.thread_2_1_8.pro_1_syncExtends;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section01.thread_2_1_8.pro_1_syncExtends <br/>
 * Date:2019/11/15 15:11 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Test {

    public static void main(String[] args) {
        Sub subRef = new Sub();

        MyThreadA a = new MyThreadA(subRef);
        a.setName("A");
        a.start();

        MyThreadB b = new MyThreadB(subRef);
        b.setName("B");
        b.start();
    }

}
