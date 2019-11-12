package chapter01.section04.pro_2_isalive;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section04.pro_2_isalive <br/>
 * Date:2019/11/12 10:21 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive=" + t1.isAlive());
    }

}
