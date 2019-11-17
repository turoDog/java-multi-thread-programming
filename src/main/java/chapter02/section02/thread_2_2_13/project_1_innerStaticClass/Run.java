package chapter02.section02.thread_2_2_13.project_1_innerStaticClass;

import chapter02.section02.thread_2_2_13.project_1_innerStaticClass.PublicClass.PrivateClass;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_13.project_1_innerStaticClass <br/>
 * Date:2019/11/18 0:06 <br/>
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

        PrivateClass privateClass = new PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");

        System.out.println(privateClass.getAge() + " "
                + privateClass.getAddress());

    }

}
