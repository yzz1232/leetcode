package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 反向单链表
 * @author Administrator
 *
 */
public class ReverseLinkedList {
	
	public class ListNode{
		int value;
		ListNode next;
		public ListNode(int value,ListNode node){
			this.value = value;
			this.next = node;
		}
	}
	
	public ListNode reverseList(ListNode node){
		if(node ==null){
			return null;
		}
		if(node.next==null){
			return node;
		}
		
		return null;
	}
}
