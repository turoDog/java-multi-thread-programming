package chapter03.section01.thread_3_1_10.pro_1_waitOld;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_10.pro_1_waitOld <br/>
 * Date:2019/11/20 23:18 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Add {

    private String lock;

    public Add(String lock) {
        super();
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }

}
