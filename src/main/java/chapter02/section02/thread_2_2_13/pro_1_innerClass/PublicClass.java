package chapter02.section02.thread_2_2_13.pro_1_innerClass;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter02.section02.thread_2_2_13.pro_1_innerClass <br/>
 * Date:2019/11/17 23:47 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class PublicClass {

    private String username;
    private String password;

    class PrivateClass {
        private String age;
        private String address;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void printPublicProperty() {
            System.out.println(username + " " + password);
        }
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
