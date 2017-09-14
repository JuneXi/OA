
import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseNodeTest {
	
	@Test
	public void testReverseListNode(){		
		//initialize node
		Node head0 = new Node();
		head0.value = 0;
		Node head1 = new Node();
		head1.value = 0;
		Node node1 = new Node(), node2 = new Node(), node3 = new Node(), node4 = new Node();
		node1.value = 1;
		node2.value = 2;
		node3.value = 3;
		node4.value = 4;
		head1.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		ReverseNode reverse = new ReverseNode();
		assertEquals(0, reverse.reverseList(head0).value);
		assertEquals(4,reverse.reverseList(head1).value);
		
		}

}
