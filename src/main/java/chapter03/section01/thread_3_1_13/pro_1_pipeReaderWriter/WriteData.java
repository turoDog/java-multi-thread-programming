package chapter03.section01.thread_3_1_13.pro_1_pipeReaderWriter;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_13.pro_1_pipeReaderWriter <br/>
 * Date:2019/11/23 16:01 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class WriteData {

    public void writeMethod(PipedWriter out) {
        try {
            System.out.println("write :");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData);
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
