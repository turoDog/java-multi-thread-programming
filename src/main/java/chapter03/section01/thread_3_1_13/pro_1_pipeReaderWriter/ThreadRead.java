package chapter03.section01.thread_3_1_13.pro_1_pipeReaderWriter;

import java.io.PipedReader;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_13.pro_1_pipeReaderWriter <br/>
 * Date:2019/11/23 16:01 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadRead extends Thread{

    private ReadData read;
    private PipedReader input;

    public ThreadRead(ReadData read, PipedReader input) {
        super();
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }

}
