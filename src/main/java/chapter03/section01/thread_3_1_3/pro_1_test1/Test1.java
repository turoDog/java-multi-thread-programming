package chapter03.section01.thread_3_1_3.pro_1_test1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_3.pro_1_test1 <br/>
 * Date:2019/11/20 22:06 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Test1 {

    public static void main(String[] args) {
        try {
            String newString = "";
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
