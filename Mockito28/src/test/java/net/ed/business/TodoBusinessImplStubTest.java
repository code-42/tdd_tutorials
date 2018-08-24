package net.ed.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import net.ed.data.api.TodoService;
import net.ed.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAStub() {
		 
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Spring");
		assertEquals(2, filteredTodos.size());
	}

}
