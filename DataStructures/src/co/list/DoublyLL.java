package co.list;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class DoublyLL {

	public static class node{
		
		int data;
		node next;
		node prev;
		
		public node(int d) {
			
			this.data=d;
			this.next=null;
			this.prev = null;
		}

	}
	
	

	node head;
	
	

	public void insert(int d) {

		node new_node = new node(d);
		new_node.next = head;
		new_node.prev = null;

		if (head != null)
			head.prev = new_node;

		head = new_node;

	}
	
	public void printList(){
		
		node n=head;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
		
	}
	
	public void printRev(){
		
		node n=head, last=null;
		while(n!=null){
			last=n;
			n=n.next;
		}
		
		while(last!=null){
			System.out.println(last.data);
			last=last.prev;
		}
	}
	
	public void appendLast(int d){
		
		node new_node=new node(d);
		 node n=head;
		 
		 new_node.next=null;
		 
		 if(head==null){
			 new_node.next=null;
			 new_node.prev=null;
			 head=new_node;
		 }
		 
		 
		 while(n.next!=null){
			 n=n.next;
		 }
		 
		 n.next=new_node;
		 new_node.prev=n;
	}
	
	public void insertAfter(node prev,int d){
		
		node new_node=new node(d);
		
		if(prev==null){
			System.out.println("node not found");
		}
		
		new_node.next=prev.next;
		prev.next=new_node;
		new_node.prev=prev;
		new_node.next.prev=new_node;
		
		
	}
	
	public void delete(int d){
		
		node temp,prev=null;
		
		if(head==null){
			System.out.println("head null");
		}
		
		temp=head;
		
		if(temp.prev==null){
			temp.next.prev=null;
			head=temp.next;
			return;
		}
		
		while(temp.next!=null&& temp.data!=d){
			prev=temp;
			temp=temp.next;
		}
		
		temp.next.prev=prev;
		prev.next=temp.next;
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
	
		DoublyLL dll=new DoublyLL();
		dll.head=new node(1);
		dll.insert(2);
		dll.insert(3);
		dll.printList();
		dll.appendLast(10);
		System.out.println("After append last");
		dll.printList();
		dll.insertAfter(dll.head.next, 20);
		System.out.println("insert after 2");
		dll.printList();
		dll.delete(3);
		System.out.println("After del");
		dll.printList();
		System.out.println("reverse");
		dll.printRev();
		
		

	}

}
