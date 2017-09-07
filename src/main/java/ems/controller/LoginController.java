package ems.controller;

import org.apache.log4j.Logger;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    private static final Logger logger = Logger.getLogger( LoginController.class );

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showWelcomePage(ModelMap model) {
        if(logger.isDebugEnabled()) {
            logger.debug( "showWelcomePage" );
        }
        model.put( "name", getLoggedInUsername() );
        return "welcome";
    }

    private String getLoggedInUsername() {
        if(logger.isDebugEnabled()) {
            logger.debug( "getLoggedInUsername" );
        }

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(principal instanceof UserDetails) {
            return ((UserDetails)principal).getUsername();
        }

        return principal.toString();
    }
}
