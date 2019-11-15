package chapter02.section02.thread_2_2_7.pro_3_syn_Out_asyn;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_7.pro_3_syn_Out_asyn <br/>
 * Date:2019/11/15 17:44 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Test {

    public static void main(String[] args) {
        MyList mylist = new MyList();

        MyThreadA a = new MyThreadA(mylist);
        a.setName("A");
        a.start();

        MyThreadB b = new MyThreadB(mylist);
        b.setName("B");
        b.start();
    }

}
