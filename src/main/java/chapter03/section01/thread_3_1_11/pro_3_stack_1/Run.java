package chapter03.section01.thread_3_1_11.pro_3_stack_1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_11.pro_3_stack_1 <br/>
 * Date:2019/11/23 14:36 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        P p = new P(myStack);
        C r = new C(myStack);

        P_Thread pThread = new P_Thread(p);
        C_Thread rThread = new C_Thread(r);
        pThread.start();
        rThread.start();
    }

}
