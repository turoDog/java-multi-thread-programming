package chapter02.section02.thread_2_2_4.pro_1_t7;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_4.pro_1_t7 <br/>
 * Date:2019/11/15 16:42 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyThread2 extends Thread{

    private Task task;

    public MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run(){
        super.run();
        task.doLongTimeTask();
    }

}
