package chapter06.section03.pro_1_singleton_7;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.section03.pro_1_singleton_7 <br/>
 * Date:2019/11/28 17:14 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyObject {

    // 内部类方式
    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    private MyObject() {
    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

}
