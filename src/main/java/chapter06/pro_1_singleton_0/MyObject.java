package chapter06.pro_1_singleton_0;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.pro_1_singleton_0 <br/>
 * Date:2019/11/28 15:57 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyObject {

    // 立即加载方式==饿汉模式
    private static MyObject myObject = new MyObject();

    private MyObject() {
    }

    public static MyObject getInstance() {
        // 此代码版本为立即加载
        // 此版本代码的缺点是不能有其它实例变量
        // 因为getInstance()方法没有同步
        // 所以有可能出现非线程安全问题
        return myObject;
    }

}
