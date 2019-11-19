package chapter02.section03.thread_2_3_6.pro_1_atomicIntergerNoSafe;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section03.thread_2_3_6.pro_1_atomicIntergerNoSafe <br/>
 * Date:2019/11/19 22:58 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyService service = new MyService();

            MyThread[] array = new MyThread[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = new MyThread(service);
            }
            for (int i = 0; i < array.length; i++) {
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(service.aiRef.get());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
