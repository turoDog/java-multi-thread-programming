package chapter07.section04.thread_7_4_3.pro_1_formatOK2;

import java.text.SimpleDateFormat;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section04.thread_7_4_3.pro_1_formatOK2 <br/>
 * Date:2019/12/2 23:10 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class DateTools {

    private static ThreadLocal<SimpleDateFormat> tl = new ThreadLocal<SimpleDateFormat>();

    public static SimpleDateFormat getSimpleDateFormat(String datePattern) {
        SimpleDateFormat sdf = null;
        sdf = tl.get();
        if (sdf == null) {
            sdf = new SimpleDateFormat(datePattern);
            tl.set(sdf);
        }
        return sdf;
    }

}
