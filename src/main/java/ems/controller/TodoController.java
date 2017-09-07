package ems.controller;

import ems.model.Todo;
import ems.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
    @Autowired
    private TodoService mTodoService;

    @RequestMapping( value = "/list-todos", method = RequestMethod.GET )
    public String showTodosList( ModelMap model ) {
        model.addAttribute( "todos", mTodoService.getAll());
        return "list-todos";
    }


    @RequestMapping( value = "/delete-todo", method = RequestMethod.GET)
    public String deleteTodo(@RequestParam int id) {
        mTodoService.deleteTodo( id );
        return "redirect:/list-todos";

    @RequestMapping( value = "/add-todo", method = RequestMethod.GET )
    public String showAddTodoPage( ModelMap model ) {
        model.addAttribute( "todo", new Todo() );
        return "todo";
    }
}
