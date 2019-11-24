package chapter03.section03.thread_3_3_3.pro_1_ThreadLocal22;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section03.thread_3_3_3.pro_1_ThreadLocal22 <br/>
 * Date:2019/11/24 21:20 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static ThreadLocalExt tl = new ThreadLocalExt();

    public static void main(String[] args) {
        if (tl.get() == null) {
            System.out.println("从未放过值");
            tl.set("我的值");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());
    }

}
