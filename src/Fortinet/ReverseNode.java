package fortinet;

//Your resolution 
//Time complexity:  O(n)
//Space complexity: O(1)
public class ReverseNode {
    public Node reverseList(Node head) {
    	if(head == null){
    		return head;
    	}
    	Node pre = null;
        
    	while(head.next != null){
    		Node temp = head.next;
    		head.next = pre;
    		pre = head;
    		head = temp;   		
    	}
    	//Last step
    	head.next = pre;
    	return head;
    }
}
