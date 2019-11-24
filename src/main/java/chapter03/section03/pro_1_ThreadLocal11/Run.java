package chapter03.section03.pro_1_ThreadLocal11;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section03.pro_1_ThreadLocal11 <br/>
 * Date:2019/11/24 21:03 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static ThreadLocal tl = new ThreadLocal();

    public static void main(String[] args) {
        if (tl.get() == null) {
            System.out.println("从未放过值");
            tl.set("我的值");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());
    }

}
