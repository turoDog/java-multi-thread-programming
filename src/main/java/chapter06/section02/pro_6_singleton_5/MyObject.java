package chapter06.section02.pro_6_singleton_5;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.section02.pro_6_singleton_5 <br/>
 * Date:2019/11/28 17:05 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyObject {

    private volatile static MyObject myObject;

    private MyObject() {
    }

    // 使用双检测机制来解决问题
    // 即保证了不需要同步代码的异步
    // 又保证了单例的效果
    public static MyObject getInstance() {
        try {
            if (myObject != null) {
            } else {
                // 模拟在创建对象之前做一些准备性的工作
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    if (myObject == null) {
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
    // 此版本的代码称为：
    // 双重检查Double-Check Locking

}
