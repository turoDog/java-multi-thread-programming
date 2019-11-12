package chapter01.section07.thread_1_7_2.pro_1_t12;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section07.thread_1_7_2.pro_1_t12 <br/>
 * Date:2019/11/12 16:05 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run2 {

    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println(" 是否停止 1？=" + Thread.interrupted());
        System.out.println(" 是否停止 2？=" + Thread.interrupted());
        System.out.println("end!");
    }

}
