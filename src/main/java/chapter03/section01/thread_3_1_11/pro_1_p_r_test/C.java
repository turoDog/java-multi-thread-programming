package chapter03.section01.thread_3_1_11.pro_1_p_r_test;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_11.pro_1_p_r_test <br/>
 * Date:2019/11/21 23:17 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class C {

    private String lock;

    public C(String lock) {
        super();
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                if (ValueObject.value.equals("")) {
                    lock.wait();
                }
                System.out.println("get的值是" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
