package net.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LinkedListTests {

	@Test
    public void CreateNode_SetsValueAndNextIsNull() {
		
        ListNode<Integer> node = new ListNode<Integer>(1);
        int actual = node.value;
        
        Assert.assertEquals(1, actual);
        Assert.assertNull(node.next);
    }
	
	@Test
    public void AddFirst_HeadAndTailAreSame() {
		
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        ((MyLinkedList<Integer>) list).addFirst(1);
        
        int list_head_value = list.head.value;
        int list_tail_value = list.tail.value;

        Assert.assertEquals(1, list_head_value);
        Assert.assertEquals(1, list_tail_value);
        Assert.assertSame(list.head, list.tail);
    }
	
	@Test
    public void AddFirstTwoElements_ListIsInCorrectState() {
		
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        ((MyLinkedList<Integer>) list).addFirst(1);
        ((MyLinkedList<Integer>) list).addFirst(2);
        
        int list_head_value = list.head.value;
        int list_tail_value = list.tail.value;

        Assert.assertEquals(2, list_head_value);
        Assert.assertEquals(1, list_tail_value);
        Assert.assertEquals(2, list.count);
        Assert.assertSame(list.head.next, list.tail);
    }
	
	@Test
    public void AddLast_HeadAndTailAreSame() {
		
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        ((MyLinkedList<Integer>) list).addLast(1);

        int list_head_value = list.head.value;
        int list_tail_value = list.tail.value;
        
        Assert.assertEquals(1, list_head_value);
        Assert.assertEquals(1, list_tail_value);
        Assert.assertSame(list.head, list.tail);
    }

	@Test
    public void AddLastTwoElements_ListIsInCorrectState() {
		
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        ((MyLinkedList<Integer>) list).addLast(1);
        ((MyLinkedList<Integer>) list).addLast(2);
        
        int list_head_value = list.head.value;
        int list_tail_value = list.tail.value;

        Assert.assertEquals(1, list_head_value);
        Assert.assertEquals(2, list_tail_value);
        Assert.assertEquals(2, list.count);
        Assert.assertSame(list.head.next, list.tail);
    }
	
	@Test
    public void RemoveFirst_EmptyList_ThrowsException() {
		
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        Assertions.assertThrows(IllegalStateException.class, () -> list.removeFirst());
        
	}
	
	@Test
    public void RemoveFirst_OneElement_ListIsInCorrectState() {
		
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        ((MyLinkedList<Integer>) list).addFirst(1);
        ((MyLinkedList<Integer>) list).removeFirst();
        
		Assert.assertNull(list.head);
		Assert.assertNull(list.tail);
		Assert.assertEquals(0, list.count);
        
	}
	
	@Test
    public void RemoveLast_EmptyList_ThrowsException() {
		
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        Assertions.assertThrows(IllegalStateException.class, () -> list.removeLast());
        
	}

	@Test
    public void RemoveLast_OneElement_ListIsInCorrectState() {
		
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        ((MyLinkedList<Integer>) list).addFirst(1);
        ((MyLinkedList<Integer>) list).removeLast();
        
		Assert.assertNull(list.head);
		Assert.assertNull(list.tail);
		Assert.assertEquals(0, list.count);
        
	}
}
