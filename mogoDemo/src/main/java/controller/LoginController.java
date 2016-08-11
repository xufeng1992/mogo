package controller;/**
 * Created by Administrator on 2016/8/4 0004.
 */

import bean.UserBean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * loginController
 *
 * @author xufeng
 * @date 2016/8/4 0004
 */
@RequestMapping(value="/app/api")
@RestController
public class LoginController {

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(Model model) {

        System.out.println("测试");
        model.addAttribute("dsa","cdssd");
        return "/index";
    }

}
