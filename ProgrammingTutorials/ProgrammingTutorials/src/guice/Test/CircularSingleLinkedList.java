package guice.Test;

public class CircularSingleLinkedList {
	
	
	
	static class Node{
		Node next;
		
		int data;
		
		public Node(int data)
		{
			this.data=data;
			
		}
	}
	Node head=null;
	Node tail=null;
	int size=0;
	
	public void insertData(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			newNode.next=newNode;
			size++;
			
		}
		else {
			tail.next=newNode;
			newNode.next=head;
			tail=newNode;
			size++;
			
		}
		
	}
	
	
	public void display()
	{
		int count=0;
		Node temp=head;
		Node current=head;
		while(count!=size) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			count++;
		}
		//both loops are same
		do {
			System.out.println("");
			System.out.print(current.data+" ");
			current=current.next;
		}while(current.next!=head.next);
		
	}
	
	public static void main (String[] args)
	{
		CircularSingleLinkedList l=new CircularSingleLinkedList();
		l.insertData(2);
		l.insertData(99);
		l.insertData(23);
		l.insertData(43);
		l.insertData(33);
		l.display();
	}
	
}
