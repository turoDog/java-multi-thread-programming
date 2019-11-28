package chapter06.section02.pro_3_singleton_2_1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.section02.pro_3_singleton_2_1 <br/>
 * Date:2019/11/28 16:51 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyObject {

    private static MyObject myObject;

    private MyObject() {
    }

    // 设置同步方法效率太低了
    // 整个方法被上锁
    synchronized public static MyObject getInstance() {
        try {
            if (myObject != null) {
                return myObject;
            } else {
                // 模拟在创建对象之前做一些准备性的工作
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }

}
