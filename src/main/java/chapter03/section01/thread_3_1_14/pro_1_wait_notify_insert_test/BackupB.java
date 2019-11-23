package chapter03.section01.thread_3_1_14.pro_1_wait_notify_insert_test;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_14.pro_1_wait_notify_insert_test <br/>
 * Date:2019/11/23 16:05 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class BackupB extends Thread{

    private DBTools dbtools;

    public BackupB(DBTools dbtools) {
        super();
        this.dbtools = dbtools;
    }

    @Override
    public void run() {
        dbtools.backupB();
    }

}
