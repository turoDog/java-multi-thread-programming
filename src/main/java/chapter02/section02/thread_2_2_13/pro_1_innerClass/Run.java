package chapter02.section02.thread_2_2_13.pro_1_innerClass;

import chapter02.section02.thread_2_2_13.pro_1_innerClass.PublicClass.PrivateClass;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_13.pro_1_innerClass <br/>
 * Date:2019/11/17 23:47 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Run {

    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");

        System.out.println(publicClass.getUsername() + " "
                + publicClass.getPassword());

        PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");

        System.out.println(privateClass.getAge() + " "
                + privateClass.getAddress());

    }

}
