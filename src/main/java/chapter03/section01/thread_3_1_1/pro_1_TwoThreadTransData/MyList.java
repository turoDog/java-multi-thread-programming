package chapter03.section01.thread_3_1_1.pro_1_TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_1.pro_1_synchronizedUpdateNewValue <br/>
 * Date:2019/11/19 23:32 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyList {

    private List<String> list = new ArrayList<String>();

    public void add() {
        list.add("陈志远");
    }

    public int size() {
        return list.size();
    }

}
