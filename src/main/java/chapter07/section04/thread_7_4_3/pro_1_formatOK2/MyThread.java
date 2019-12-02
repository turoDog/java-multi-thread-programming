package chapter07.section04.thread_7_4_3.pro_1_formatOK2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section04.thread_7_4_3.pro_1_formatOK2 <br/>
 * Date:2019/12/2 23:11 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    private SimpleDateFormat sdf;
    private String dateString;

    public MyThread(SimpleDateFormat sdf, String dateString) {
        super();
        this.sdf = sdf;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            Date dateRef = DateTools.getSimpleDateFormat("yyyy-MM-dd").parse(
                    dateString);
            String newDateString = DateTools.getSimpleDateFormat("yyyy-MM-dd")
                    .format(dateRef).toString();
            if (!newDateString.equals(dateString)) {
                System.out.println("ThreadName=" + this.getName()
                        + "报错了 日期字符串：" + dateString + " 转换成的日期为："
                        + newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
