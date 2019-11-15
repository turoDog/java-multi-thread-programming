package chapter02.section02.thread_2_2_7.pro_4_t9;

import java.util.ArrayList;
import java.util.List;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_7.pro_4_t9 <br/>
 * Date:2019/11/15 17:50 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyOneList {

    private List list = new ArrayList();

    synchronized public void add(String data) {
        list.add(data);
    };

    synchronized public int getSize() {
        return list.size();
    };

}
