package ems.controller.rest;

import java.util.List;

import ems.model.Todo;
import ems.service.TodoService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoRestController {
    private static final Logger logger = Logger.getLogger( TodoRestController.class );

    @Autowired
    private TodoService mTodoService;

    @RequestMapping( value = "/todo/", method = RequestMethod.GET )
    public List<Todo> getAll() {
        if(logger.isDebugEnabled()) {
            logger.debug( "getAll" );
        }
        return mTodoService.getAll();
    }

    public Todo retrieveTodo( @PathVariable( "id" ) int id ) {
        if(logger.isDebugEnabled()) {
            logger.debug( "retrieveTodo" );
        }
        return mTodoService.get( id );
    }
}
