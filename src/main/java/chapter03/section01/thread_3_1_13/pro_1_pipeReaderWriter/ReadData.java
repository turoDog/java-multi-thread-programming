package chapter03.section01.thread_3_1_13.pro_1_pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter03.section01.thread_3_1_13.pro_1_pipeReaderWriter <br/>
 * Date:2019/11/23 16:00 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ReadData {

    public void readMethod(PipedReader input) {
        try {
            System.out.println("read  :");
            char[] byteArray = new char[20];
            int readLength = input.read(byteArray);
            while (readLength != -1) {
                String newData = new String(byteArray, 0, readLength);
                System.out.print(newData);
                readLength = input.read(byteArray);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
