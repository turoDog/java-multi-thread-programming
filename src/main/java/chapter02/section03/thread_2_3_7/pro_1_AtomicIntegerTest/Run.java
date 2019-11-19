package chapter02.section03.thread_2_3_7.pro_1_AtomicIntegerTest;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section03.thread_2_3_7.pro_1_AtomicIntegerTest <br/>
 * Date:2019/11/19 23:04 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        try {
            Service service = new Service();

            ThreadA a = new ThreadA(service);
            a.start();

            Thread.sleep(1000);

            ThreadB b = new ThreadB(service);
            b.start();

            System.out.println("已经发起停止的命令了！");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
