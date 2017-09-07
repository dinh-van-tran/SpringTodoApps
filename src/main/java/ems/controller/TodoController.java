package ems.controller;

import ems.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {
    @Autowired
    private TodoService mTodoService;

    @RequestMapping( value = "/list-todos", method = RequestMethod.GET )
    public String showTodosList( ModelMap model ) {
        model.addAttribute( "todos", mTodoService.getAll());
        return "list-todos";
    }
}
