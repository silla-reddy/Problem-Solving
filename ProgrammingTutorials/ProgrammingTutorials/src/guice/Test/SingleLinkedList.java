package guice.Test;

public class SingleLinkedList {
	
	private static class Node{
		Node next;
		int data;
		
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	
	Node head;
	Node tail;
	
	public void insertData(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public void display() {
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node current =head;
			while(current!=null) {
				System.out.print(current.data+" ");
				current=current.next;
			}
			System.out.println("");
		}
	}
	
	public void remove(int data)
	{
		Node current=head;
		
		if(head==null)
		System.out.println("List is empty");
		int count=0;
		if(current.data==data) {
			head=current.next;
			count++;
		}
		
		else if(tail.data==data)
		{
			while(current.next!=null) {
				if(current.next==tail)
				{
					tail=current;
					current.next=null;
					count++;
					break;
				}
				current=current.next;
			}
		}
		
		else {
		while(current.next!=null)
		{
			if(current.next.data==data)
			{
				current.next=current.next.next;
				count++;
				break;
			}
			current=current.next;
		}
		}
		if(count==0)
			System.out.println("Doesnt have the given value "+data);
		
	}
	
	public static void main(String[] args)
	{
		SingleLinkedList l=new SingleLinkedList();
		l.insertData(4);
		l.insertData(80);
		l.insertData(3);
		l.display();
		l.remove(3);
		l.display();
		SingleLinkedList j=new SingleLinkedList();
		j.insertData(4);
		j.insertData(80);
		j.insertData(3);
		j.display();
	}
	
	
}
