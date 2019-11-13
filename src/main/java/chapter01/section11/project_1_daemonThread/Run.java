package chapter01.section11.project_1_daemonThread;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section11.project_1_daemonThread <br/>
 * Date:2019/11/13 23:11 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println(" 我离开 thread 对象也不再打印了，也就是停止了！");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
