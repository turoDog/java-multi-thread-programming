package chapter01.section02.thread_1_2_1.pro_2_random_thread;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section02.thread_1_2_1.pro_2_random_thread <br/>
 * Date:2019/11/5 9:34 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Test {

    public static void main(String[] args) {
        try {

            MyThread thread = new MyThread();
            thread.setName("myThread");
            thread.start();

            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
