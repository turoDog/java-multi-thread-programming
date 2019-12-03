package chapter07.section06.pro_2_threadGroup_2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section06.pro_2_threadGroup_2 <br/>
 * Date:2019/12/3 23:08 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    private String num;

    public MyThread(ThreadGroup group, String name, String num) {
        super(group, name);
        this.num = num;
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        while (!this.isInterrupted()) {
            System.out.println("死循环中：" + Thread.currentThread().getName());
        }
    }

}
