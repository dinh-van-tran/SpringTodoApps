package ems.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    private static final Logger logger = Logger.getLogger( LoginController.class );
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showWelcomePage() {
        if(logger.isDebugEnabled()) {
            logger.debug( "showWelcomePage" );
        }
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLogin(ModelMap model, @PathVariable String username, @PathVariable String password) {
        if(logger.isDebugEnabled()) {
            logger.debug( "handleLogin" );
        }
        if("tvdinh".equals( username ) && "dinh1990".equals( password )) {
            model.addAttribute( "name", username );
            return "welcome";
        }
        return "login";
    }
}
