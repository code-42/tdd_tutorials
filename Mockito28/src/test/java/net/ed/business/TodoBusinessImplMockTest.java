package net.ed.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import net.ed.data.api.TodoService;
import net.ed.data.api.TodoServiceStub;

public class TodoBusinessImplMockTest {
	
	/**
	 * What is mock?
	 * mock is creating objects that simulate the behavior of real objects.
	 * Unlike stubs, mocks can be dynamically created from code - at runtime.
	 * Mocks offer more functionality than stubs.
	 * You can verify method calls and a lot of other things.
	 */

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAMock() {
		
		TodoService todoServiceMock = mock(TodoService.class);
		
 		List<String> allTodos = Arrays.asList("Learn Spring MVC",
				"Learn Spring", "Learn to Dance");
		
		when(todoServiceMock.retrieveTodos("Spring")).thenReturn(allTodos);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		
		List<String> filteredTodos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Spring");
		
		assertEquals(2, filteredTodos.size());
	}
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingAMock_WithEmptyList() {
		
		TodoService todoServiceMock = mock(TodoService.class);
		
 		List<String> allTodos = Arrays.asList();
		
		when(todoServiceMock.retrieveTodos("Spring")).thenReturn(allTodos);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		
		List<String> filteredTodos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Spring");
		
		assertEquals(0, filteredTodos.size());
	}
}
