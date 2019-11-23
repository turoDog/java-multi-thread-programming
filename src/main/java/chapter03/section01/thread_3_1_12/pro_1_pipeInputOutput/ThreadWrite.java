package chapter03.section01.thread_3_1_12.pro_1_pipeInputOutput;

import java.io.PipedOutputStream;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_12.pro_1_pipeInputOutput <br/>
 * Date:2019/11/23 15:35 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadWrite extends Thread{

    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write, PipedOutputStream out) {
        super();
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }

}
