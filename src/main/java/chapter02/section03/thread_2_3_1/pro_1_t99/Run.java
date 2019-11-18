package chapter02.section03.thread_2_3_1.pro_1_t99;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section03.thread_2_3_1.pro_1_t99 <br/>
 * Date:2019/11/18 23:53 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        printStringService.printStringMethod();
        System.out.println("我要停止它！stopThread="
                + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }

}
