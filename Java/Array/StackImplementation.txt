class Stack{

	
	private int capacity;
	private int stack[];
	private int size;

	public Stack(int capacity){
		this.capacity=capacity;
		this.stack = new int[capacity];
		this.size = 0;
		
	}


	public void display(){

		for(int i=0;i<size;i++)
			System.out.print(stack[i]+" ");


		System.out.println();
	}

	public boolean isEmpty(){

		return (size==0);
	}

	public boolean isFull(){

		return (size==capacity);
	}

	public void push(int data){

		if(!isFull()){

			stack[size]=data;
			size++;
		}	
		else
			System.out.println("Stack Overflow");


	}

	public int peek(){

		return stack[size-1];
	}

	public int pop(){


		if(!isEmpty()){
			int a = stack[size-1];
			size--;
			return a;
		}
		else{
			System.out.println("Stack Underflow");
			return -1;
		}
	}


}

public class StackImplementation{


	public static void main(String[] args){

	
		Stack s = new Stack(10);
		s.push(1);
		s.push(2);
		s.push(3);

		s.display();
		System.out.println(s.pop());
		s.display();

		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		s.push(27);
		System.out.println(s.isFull());


	
		

	}

}