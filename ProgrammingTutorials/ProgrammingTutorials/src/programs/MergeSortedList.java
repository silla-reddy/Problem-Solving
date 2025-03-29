package programs;

public class MergeSortedList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node l=new Node(1);
		l.next.val=2;
		System.out.println(l.val+" "+l.next.val);
		
	}

}
class Node{
	int val;
	Node next;
	public Node(int val) {
		this.val=val;
	}
}
