package chapter07.section03.pro_1_threadRunSyn;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter07.section03.pro_1_threadRunSyn <br/>
 * Date:2019/12/2 22:57 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread{

    private Object lock;
    private String showChar;
    private int showNumPosition;

    private int printCount = 0;// 统计打印了几个字母

    volatile private static int addNumber = 1;

    public MyThread(Object lock, String showChar, int showNumPosition) {
        super();
        this.lock = lock;
        this.showChar = showChar;
        this.showNumPosition = showNumPosition;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                while (true) {
                    if (addNumber % 3 == showNumPosition) {
                        System.out.println("ThreadName="
                                + Thread.currentThread().getName()
                                + " runCount=" + addNumber + " " + showChar);
                        lock.notifyAll();
                        addNumber++;
                        printCount++;
                        if (printCount == 3) {
                            break;
                        }
                    } else {
                        lock.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
