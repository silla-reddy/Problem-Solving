package guice.Test;

public class DoubleLinkedList {
	
	static class Node{
		Node next;
		Node prev;
		int data;
		
		public Node(int data) {
			this.data=data;
		}
		
	}
	
	Node tail=null;
	Node head=null;
	
	public void insertData(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			newNode.prev=null;
			newNode.next=null;
			tail=newNode;
		}
		
		else
		{
			newNode.prev=tail;
			tail.next=newNode;
			newNode.next=null;
			tail=newNode;
		}
		
	}
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public void remove(int data)
	{
		Node temp=head;
		if(temp.data==data)
		{
			head=temp.next;
			temp.next.prev=null;
		}
		else if(tail.data==data)
		{
			tail=tail.prev;
			tail.next=null;
		}
		else 
		{
			while(temp!=null)
			{
				if(temp.data==data)
				{
					temp.prev.next=temp.next;
					temp.next.prev=temp.prev;
				}
				temp=temp.next;
			}
			
		}
	}
	
	public void deleteList(DoubleLinkedList list)
	{
		list.head.next=null;
		list.head=null;
		list.tail=null;
		
		System.out.println("Deleted list data : ");
		list.display();
		
	}
	
	public static void main(String[] args)
	{
		DoubleLinkedList d=new DoubleLinkedList();
		d.insertData(100);
		d.insertData(400);
		d.insertData(500);
		d.insertData(200);
		d.insertData(900);
		d.display();
		d.remove(900);
		d.display();
		d.remove(100);
		d.display();
		d.remove(500);
		d.display();
		d.deleteList(d);
		
		
	}
}
