package controller;


import bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Name:UserController
 * Description:
 * Author:yxc
 * Time: 2018/7/9 17:27
 */
@Controller
@RequestMapping
public class UserController {
    @RequestMapping(value = "/user/index")
    public String index(HttpServletRequest request, UserBean userBean){
        request.setAttribute("name",userBean.getUserName());
        return "user_index";
    }
}
