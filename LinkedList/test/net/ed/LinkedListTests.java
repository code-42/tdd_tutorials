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
        Assert.assertEquals(1, actual);
        Assert.assertEquals(list.head, list.tail);
    }

}
