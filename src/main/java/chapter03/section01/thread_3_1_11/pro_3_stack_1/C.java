package chapter03.section01.thread_3_1_11.pro_3_stack_1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_11.pro_3_stack_1 <br/>
 * Date:2019/11/23 14:35 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class C {

    private MyStack myStack;

    public C(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void popService() {
        System.out.println("pop=" + myStack.pop());
    }

}
