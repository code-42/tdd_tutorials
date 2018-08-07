package net.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
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
        int actual = list.head.value;

        Assert.assertEquals(1, actual);
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

}
