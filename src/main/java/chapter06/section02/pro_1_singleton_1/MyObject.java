package chapter06.section02.pro_1_singleton_1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.section02.pro_1_singleton_1 <br/>
 * Date:2019/11/28 16:17 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyObject {

    private static MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {
        // 延迟加载
        if (myObject != null) {
        } else {
            myObject = new MyObject();
        }
        return myObject;
    }

}
