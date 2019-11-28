package chapter06.section02.pro_4_singleton_2_2;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.section02.pro_4_singleton_2_2 <br/>
 * Date:2019/11/28 16:56 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyObject {

    private static MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {
        try {
            // 此种写法等同于：
            // synchronized public static MyObject getInstance()
            // 的写法，效率一样很低，全部代码被上锁
            synchronized (MyObject.class) {
                if (myObject != null) {
                    return myObject;
                } else {
                    // 模拟在创建对象之前做一些准备性的工作
                    Thread.sleep(3000);

                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }

}
