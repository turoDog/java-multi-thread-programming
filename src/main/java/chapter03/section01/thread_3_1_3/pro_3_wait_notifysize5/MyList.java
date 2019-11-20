package chapter03.section01.thread_3_1_3.pro_3_wait_notifysize5;

import java.util.ArrayList;
import java.util.List;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_3.pro_3_wait_notifysize5 <br/>
 * Date:2019/11/20 22:14 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyList {

    private static List list = new ArrayList();

    public static void add() {
        list.add("anyString");
    }

    public static int size() {
        return list.size();
    }

}
