package chapter01.section06.pro_1_runThread;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section06.pro_1_runThread <br/>
 * Date:2019/11/12 15:37 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Test {

    public static void  main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId() );
    }

}
