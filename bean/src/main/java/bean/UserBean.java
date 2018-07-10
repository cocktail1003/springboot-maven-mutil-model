package bean;

import java.io.Serializable;

/**
 * Name:UserBean
 * Description:
 * Author:yxc
 * Time: 2018/7/9 17:22
 */
public class UserBean implements Serializable {

    //用户名
    private String userName;
    //密码
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
