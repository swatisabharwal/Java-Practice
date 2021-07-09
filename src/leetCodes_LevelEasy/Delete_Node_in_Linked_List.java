package leetCodes_LevelEasy;

import java.util.LinkedList;
import java.util.LinkedList;

public class Delete_Node_in_Linked_List {
	ListNode head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delete_Node_in_Linked_List list = new Delete_Node_in_Linked_List();
		list.head= new ListNode(4);
//		ListNode ln1 = new ListNode(4);
		ListNode ln2 = new ListNode(5);
		ListNode ln3 = new ListNode(1);
		ListNode ln4 = new ListNode(9);
		
		list.head.next=ln2;
		ln2.next=ln3;
		ln3.next=ln4;
		list.Somefunc();
	}

	public void Somefunc() {
		
		ListNode n = head;
		while (n != null) {
			System.out.println(n.val);
			n = n.next;
		}
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
