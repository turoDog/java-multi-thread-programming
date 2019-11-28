package chapter06.section04.pro_1_singleton_7_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.section04.pro_1_singleton_7_1 <br/>
 * Date:2019/11/28 17:27 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class SaveAndRead {


    public static void main(String[] args) {
        try {
            MyObject myObject = MyObject.getInstance();
            FileOutputStream fosRef = new FileOutputStream(new File(
                    "src/main/resources/myObjectFile.txt"));
            ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
            oosRef.writeObject(myObject);
            oosRef.close();
            fosRef.close();
            System.out.println(myObject.hashCode());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            FileInputStream fisRef = new FileInputStream(new File(
                    "src/main/resources/myObjectFile.txt"));
            ObjectInputStream iosRef = new ObjectInputStream(fisRef);
            MyObject myObject = (MyObject) iosRef.readObject();
            iosRef.close();
            fisRef.close();
            System.out.println(myObject.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
