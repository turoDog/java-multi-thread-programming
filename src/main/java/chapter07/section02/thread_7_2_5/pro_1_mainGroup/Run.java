package chapter07.section02.thread_7_2_5.pro_1_mainGroup;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section02.thread_7_2_5.pro_1_mainGroup <br/>
 * Date:2019/12/2 22:44 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {

        System.out.println("线程组名称："
                + Thread.currentThread().getThreadGroup().getName());
        System.out.println("线程组中活动的线程数量："
                + Thread.currentThread().getThreadGroup().activeCount());
        System.out.println("线程组中线程组的数量-加之前："
                + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup newGroup = new ThreadGroup(Thread.currentThread()
                .getThreadGroup(), "newGroup");
        System.out.println("线程组中线程组的数量-加之之后："
                + Thread.currentThread().getThreadGroup().activeGroupCount());
        System.out
                .println("父线程组名称："
                        + Thread.currentThread().getThreadGroup().getParent()
                        .getName());
    }

}
