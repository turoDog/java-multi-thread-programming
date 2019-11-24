package chapter03.section04.thread_3_4_1.pro_1_InheritableThreadLocal1;

import java.util.Date;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section04.thread_3_4_1.pro_1_InheritableThreadLocal1 <br/>
 * Date:2019/11/24 21:32 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal{

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

}
