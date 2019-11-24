package chapter03.section03.thread_3_3_4.pro_1_ThreadLocal33;

import java.util.Date;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section03.thread_3_3_4.pro_1_ThreadLocal33 <br/>
 * Date:2019/11/24 21:24 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadLocalExt extends ThreadLocal{

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

}
