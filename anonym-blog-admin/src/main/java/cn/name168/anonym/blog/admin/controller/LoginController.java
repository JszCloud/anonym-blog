package cn.name168.anonym.blog.admin.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by Nominal on 2018/5/21 0021.
 * 微博：@Mr丶Li_Anonym
 */
@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(Model model) {
//        Subject subject = SecurityUtils.getSubject();
//        if (subject.isAuthenticated()||subject.isRemembered()){
//            return "index";
//        }
        return "login";
    }
    @GetMapping("/index")
    public String index(Model model) {
//        Subject subject = SecurityUtils.getSubject();
//        if (subject.isAuthenticated()||subject.isRemembered()){
//            return "index";
//        }
        return "index";
    }

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/signin")
    @ResponseBody
    public String submitLogin(String username, String password, boolean rememberMe, String kaptcha) {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        //获取当前的Subject
        Subject currentUser = SecurityUtils.getSubject();
        try {
            // 在调用了login方法后,SecurityManager会收到AuthenticationToken,并将其发送给已配置的Realm执行必须的认证检查
            // 每个Realm都能在必要时对提交的AuthenticationTokens作出反应
            // 所以这一步在调用login(token)方法时,它会走到xxRealm.doGetAuthenticationInfo()方法中,具体验证方式详见此方法
            currentUser.login(token);
            return "登录成功！";
        } catch (Exception e) {
            //logger.error("登录失败，用户名[{}]", username, e);
            token.clear();
            return "登录失败";
        }
    }

    /**
     * 使用权限管理工具进行用户的退出，跳出登录，给出提示信息
     *
     * @param redirectAttributes
     * @return
     */
    @GetMapping("/logout")
    public String logout(RedirectAttributes redirectAttributes) {
        // http://www.oschina.net/question/99751_91561
        // 此处有坑： 退出登录，其实不用实现任何东西，只需要保留这个接口即可，也不可能通过下方的代码进行退出
        SecurityUtils.getSubject().logout();
        // 因为退出操作是由Shiro控制的
        redirectAttributes.addFlashAttribute("message", "您已安全退出");
        return "login";
    }
    @GetMapping("/add")
    @ResponseBody
    public String add(){
        return "添加";
    }


}
