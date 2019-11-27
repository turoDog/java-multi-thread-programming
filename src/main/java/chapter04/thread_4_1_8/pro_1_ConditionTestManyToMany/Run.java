package chapter04.thread_4_1_8.pro_1_ConditionTestManyToMany;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter04.thread_4_1_8.pro_1_ConditionTestManyToMany <br/>
 * Date:2019/11/27 11:14 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();

        MyThreadA[] threadA = new MyThreadA[10];
        MyThreadB[] threadB = new MyThreadB[10];

        for (int i = 0; i < 10; i++) {
            threadA[i] = new MyThreadA(service);
            threadB[i] = new MyThreadB(service);
            threadA[i].start();
            threadB[i].start();
        }

    }

}
