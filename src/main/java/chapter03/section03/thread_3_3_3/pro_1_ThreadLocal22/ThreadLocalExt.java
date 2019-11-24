package chapter03.section03.thread_3_3_3.pro_1_ThreadLocal22;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section03.thread_3_3_3.pro_1_ThreadLocal22 <br/>
 * Date:2019/11/24 21:21 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadLocalExt extends ThreadLocal{

    @Override
    protected Object initialValue(){
        return "我是默认值 第一次get不再为null";
    }

}
