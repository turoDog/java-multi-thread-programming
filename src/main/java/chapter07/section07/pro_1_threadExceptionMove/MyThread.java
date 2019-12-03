package chapter07.section07.pro_1_threadExceptionMove;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section07.pro_1_threadExceptionMove <br/>
 * Date:2019/12/3 23:13 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    private String num = "a";

    public MyThread() {
        super();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        System.out.println("在线程中打印：" + (numInt + 1));
    }

}
