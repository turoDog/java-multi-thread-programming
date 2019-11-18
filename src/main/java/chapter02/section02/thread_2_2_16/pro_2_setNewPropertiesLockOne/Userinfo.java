package chapter02.section02.thread_2_2_16.pro_2_setNewPropertiesLockOne;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_16.pro_2_setNewPropertiesLockOne <br/>
 * Date:2019/11/18 23:33 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Userinfo {

    private String username;
    private String password;

    public Userinfo() {
        super();
    }

    public Userinfo(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
