package ems.controller;

import ems.model.Todo;
import ems.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
    @Autowired
    private TodoService mTodoService;

    @RequestMapping( value = "/list-todos", method = RequestMethod.GET )
    public String showTodosList( ModelMap model ) {
        model.addAttribute( "todos", mTodoService.getAll());
        return "list-todos";
    }

    @RequestMapping( value = "/update-todo", method = RequestMethod.GET )
    public String showUpdateTodoPage( ModelMap model, @RequestParam int id ) {
        model.addAttribute( "todo", mTodoService.get( id ) );
        return "todo";
    }

    @RequestMapping( value = "/update-todo", method = RequestMethod.POST )
    public String updateTodo( ModelMap model, @PathVariable Todo todo) {
        todo.setUser((String)model.get( "name" ));
        mTodoService.update( todo );
        model.clear();
        return "redirect:/list-todos";
    }
}
