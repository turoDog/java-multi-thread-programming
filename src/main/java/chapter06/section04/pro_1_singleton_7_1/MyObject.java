package chapter06.section04.pro_1_singleton_7_1;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.section04.pro_1_singleton_7_1 <br/>
 * Date:2019/11/28 17:27 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyObject {

    private static final long serialVersionUID = 888L;

    // 内部类方式
    private static class MyObjectHandler {
        private static final MyObject myObject = new MyObject();
    }

    private MyObject() {
    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

//	protected Object readResolve() throws ObjectStreamException {
//		System.out.println("调用了readResolve方法！");
//		return MyObjectHandler.myObject;
//	}

}
