package chapter01.section02.thread_1_2_3.pro_3_t4threadsafe;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter01.section02.thread_1_2_3.pro_3_t4threadsafe <br/>
 * Date:2019/11/5 10:29 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class LoginServlet {

    private static String usernameRef;
    private static String passwordRef;

    public static void doPost(String username, String password) {
        //synchronized public static void doPost(String username, String password) {
        try {
            usernameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;

            System.out.println("username=" + usernameRef + " password="
                    + passwordRef);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
