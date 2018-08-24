package net.ed.data.api;

import java.util.List;

// Create TodoServiceStub
// Test TodoBusinessImpl using TodoServiceStub
public interface TodoService {
	
	// retrieve a list of Todos for a specific user
	public List<String> retrieveTodos(String user);


}
