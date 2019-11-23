package chapter03.section01.thread_3_1_13.pro_1_pipeReaderWriter;

import java.io.PipedWriter;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_13.pro_1_pipeReaderWriter <br/>
 * Date:2019/11/23 16:01 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadWrite extends Thread{

    private WriteData write;
    private PipedWriter out;

    public ThreadWrite(WriteData write, PipedWriter out) {
        super();
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }

}
