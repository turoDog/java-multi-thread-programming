package chapter01.section11.pro_1_daemonThread;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section11.project_1_daemonThread <br/>
 * Date:2019/11/13 23:10 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread {

    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + (i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
