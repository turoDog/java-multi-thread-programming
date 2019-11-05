package chapter01.section02.thread_1_2_3.pro_3_t4threadsafe;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section02.thread_1_2_3.pro_3_t4threadsafe <br/>
 * Date:2019/11/5 10:29 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class ALogin extends Thread{

    @Override
    public void run() {
        LoginServlet.doPost("a", "aa");
    }

}
