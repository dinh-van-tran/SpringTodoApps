package ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showWelcomePage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLogin(ModelMap model, @PathVariable String username, @PathVariable String password) {
        if("tvdinh".equals( username ) && "dinh1990".equals( password )) {
            model.addAttribute( "name", username );
            return "welcome";
        }
        return "login";
    }
}
