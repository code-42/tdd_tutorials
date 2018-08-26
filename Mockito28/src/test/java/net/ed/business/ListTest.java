package net.ed.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void testMockListSizeMethod() {
		
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());
	}
	
	@Test
	public void testMockListSize_ReturnMultipleValues() {
		
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
	}
	
	@Test
	public void testMockListGetMethod() {
		
		List listMock = mock(List.class);
		
		when(listMock.get(0)).thenReturn("in28Minutes");
		
		// Argument Matcher
		when(listMock.get(anyInt())).thenReturn("in28Minutes");
		
		assertEquals("in28Minutes", listMock.get(0));
		assertEquals("in28Minutes", listMock.get(1));
	}
	
	@Test(expected=RuntimeException.class)
	public void testMockList_throwAnException() {
		
		List listMock = mock(List.class);
		
		when(listMock.get(0)).thenReturn("in28Minutes");
		
		// Argument Matcher
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Some Exception"));
		
		listMock.get(0);
	}
	
	@Test(expected=RuntimeException.class)
	public void testMockList_mixingUp() {
		
		/**
		 * Open DeclarationList java.util.List.subList(int fromIndex, int toIndex)	
		 * Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive. (If fromIndex and toIndex are equal, the returned list is empty.) The returned list is backed by this list, so non-structural changes in the returned list are reflected in this list, and vice-versa. The returned list supports all of the optional list operations supported by this list.
			
			This method eliminates the need for explicit range operations (of the sort that commonly exist for arrays). Any operation that expects a list can be used as a range operation by passing a subList view instead of a whole list. For example, the following idiom removes a range of elements from a list:
			
			list.subList(from, to).clear();
			Similar idioms may be constructed for indexOf and lastIndexOf, and all of the algorithms in the Collections class can be applied to a subList.
			The semantics of the list returned by this method become undefined if the backing list (i.e., this list) is structurally modified in any way other than via the returned list. (Structural modifications are those that change the size of this list, or otherwise perturb it in such a fashion that iterations in progress may yield incorrect results.)
			
			Parameters:
			fromIndex low endpoint (inclusive) of the subList
			toIndex high endpoint (exclusive) of the subList
			Returns:
			a view of the specified range within this list
			Throws:
			IndexOutOfBoundsException - for an illegal endpoint index value (fromIndex < 0 || toIndex > size || fromIndex > toIndex)
		 */
		
		List listMock = mock(List.class);
		
		when(listMock.subList(anyInt(), 5)).thenThrow(new RuntimeException("Some Exception"));
		
		listMock.get(0);
	}
	
	@Test
	public void testMockListGetMethod_usingBDD() {
		
		// Given
		List<String> listMock = mock(List.class);
		given(listMock.get(anyInt())).willReturn("in28Minutes");

		// When
		String firstElement = listMock.get(0);
		
		// Then
		assertThat(firstElement, is("in28Minutes"));
	}
}
