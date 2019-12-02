package chapter07.section04.thread_7_4_2.pro_1_formatOK1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section04.thread_7_4_2.pro_1_formatOK1 <br/>
 * Date:2019/12/2 23:06 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class DateTools {

    public static Date parse(String formatPattern, String dateString)
            throws ParseException {
        return new SimpleDateFormat(formatPattern).parse(dateString);
    }

    public static String format(String formatPattern, Date date) {
        return new SimpleDateFormat(formatPattern).format(date).toString();
    }

}
