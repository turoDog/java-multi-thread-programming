package chapter02.section02.thread_2_2_3.pro_1_t6;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_1.pro_1_t5 <br/>
 * Date:2019/11/15 16:02 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Task {

    private String getData1;
    private String getData2;

    public void doLongTimeTask() {
        try {
            System.out.println("begin task");
            Thread.sleep(3000);

            String privateGetData1 = "长时间处理任务后从远程返回的值1 threadName="
                    + Thread.currentThread().getName();
            String privateGetData2 = "长时间处理任务后从远程返回的值2 threadName="
                    + Thread.currentThread().getName();

            synchronized (this) {
                getData1 = privateGetData1;
                getData2 = privateGetData2;
            }

            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
