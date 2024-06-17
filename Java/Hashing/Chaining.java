class DoublyLinkedList{


	Node head;
	static class Node{

		int data;
		Node next, prev;
		
		Node(int data){

			this.data = data;
			next = null;
			prev = null;
		}

	}




	void append(int new_data){

		Node new_node = new Node(new_data);
		new_node.next = null;

		if(head==null)
		{
			new_node.prev = null;
			head = new_node;
			return ;
		}

		Node last = head;
		while(last.next != null)
			last = last.next;

		last.next = new_node;
		new_node.prev = last;


	}

	boolean search(int data){
	
		Node n = head;
		
		while(n != null){
			
			if(n.data == data)
				return true;
			n = n.next;
		}


		return false;

	}


	

	void display(){

		Node p = null;
		Node n = head;
		System.out.println("Forward direction: ");
		while( n != null)
		{	
			System.out.print(n.data+"-->");
			p = n;
			n = n.next;
		}
		System.out.println();
		System.out.println("Backward Direction: ");
		while(p != n){
			System.out.print(p.data+"-->");
			p = p.prev;
		}	
		System.out.println();

	}

	

}

public class Chaining{		


	DoublyLinkedList DLL[] = new DoublyLinkedList[7];

	public Chaining(){

		for(int i=0; i<7; i++)
			DLL[i] = new DoublyLinkedList();

	}

	void add_value(int data){

			
			DLL[data % 7].append(data);

	}

	boolean search(int data){

		int rem = data%7;
		return DLL[rem].search(data);
	}


	

		
	public static void main(String [] args){


		Chaining chains = new Chaining();


		chains.add_value(70);	
		chains.add_value(71);
		chains.add_value(9);
		chains.add_value(56);
		chains.add_value(72);

		for(int i=0;i<7;i++){
			System.out.println("Printing i th Linked List");
			chains.DLL[i].display();
			System.out.println();
		}

		System.out.println(chains.search(21));


	}
}
		
		