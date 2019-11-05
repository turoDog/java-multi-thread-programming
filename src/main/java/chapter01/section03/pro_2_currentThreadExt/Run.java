package chapter01.section03.pro_2_currentThreadExt;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section03.pro_2_currentThreadExt <br/>
 * Date:2019/11/5 10:53 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        t1.setName("A");
        t1.start();
    }

}
