package ems.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ems.model.Todo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    static {
        todos.add( new Todo( 1, "in28minutes", "Learn Spring MVC", new Date(), false ) );
        todos.add( new Todo( 2, "in28minutes", "Learn Strut", new Date(), false ) );
        todos.add( new Todo( 3, "in28minutes", "Learn Hibernate", new Date(), false ) );
    }

    public List<Todo> retrieveTodos( String user ) {
        List<Todo> resultList = new ArrayList<Todo>();
        if ( user != null ) {
            for ( Todo todo : todos ) {
                if ( user.equals( todo.getUser() ) ) {
                    resultList.add( todo );
                }
            }
        }
        return resultList;
    }
}