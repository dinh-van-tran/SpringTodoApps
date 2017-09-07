package ems.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

    public List<Todo> getAll() {
        return todos;
    }

    public void deleteTodo( int id ) {
        Iterator<Todo> iterator = todos.iterator();
        while ( iterator.hasNext() ) {
            Todo todo = iterator.next();
            if ( todo.getId() == id ) {
                iterator.remove();
            }
        }

    public void addTodo( String name, String desc, Date targetDate, boolean isDone ) {
        todos.add( new Todo( ++todoCount, name, desc, targetDate, isDone ) );
    }
}
