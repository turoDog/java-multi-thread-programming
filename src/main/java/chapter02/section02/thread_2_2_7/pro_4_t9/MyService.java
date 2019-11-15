package chapter02.section02.thread_2_2_7.pro_4_t9;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_7.pro_4_t9 <br/>
 * Date:2019/11/15 17:50 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyService {

    public MyOneList addServiceMethod(MyOneList list, String data) {
        try {
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }

}
