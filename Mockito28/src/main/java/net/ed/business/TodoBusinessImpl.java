package net.ed.business;

import java.util.ArrayList;
import java.util.List;

import net.ed.data.api.TodoService;

// SUT - System Under Test
public class TodoBusinessImpl {
	
	private TodoService todoService;

	// Constructor  Dependency Injection
	TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> allTodos = todoService.retrieveTodos(user);
		for (String todo : allTodos) {
			if (todo.contains(user)) {
				System.out.println(todo);
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}	

}
