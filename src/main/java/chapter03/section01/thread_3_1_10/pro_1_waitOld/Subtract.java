package chapter03.section01.thread_3_1_10.pro_1_waitOld;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_10.pro_1_waitOld <br/>
 * Date:2019/11/20 23:19 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Subtract {

    private String lock;

    public Subtract(String lock) {
        super();
        this.lock = lock;
    }

    public void subtract() {
        try {
            synchronized (lock) {
                while (ValueObject.list.size() == 0) {
                    System.out.println("wait begin ThreadName="
                            + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait   end ThreadName="
                            + Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("list size=" + ValueObject.list.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
