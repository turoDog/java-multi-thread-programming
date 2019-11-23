package chapter03.section01.thread_3_1_12.pro_1_pipeInputOutput;

import java.io.PipedInputStream;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_12.pro_1_pipeInputOutput <br/>
 * Date:2019/11/23 15:35 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ThreadRead extends Thread{

    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input) {
        super();
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }

}
