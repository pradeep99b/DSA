public class DeleteMiddle{

	int capacity= 10;
	int Stack[] = new int[capacity];
	int size = 0;


	void push(int data){


		if(size==capacity){
			System.out.print("Stack oVERFLOW");
			return ;
		}

		Stack[size] = data;
		size++;
	}

	int pop(){


		if(size==0){

		System.out.print("Stack Underflow");
		return -1;
		}

		int top = Stack[size-1];
		size--;
		return top;
	}


	void display(){

		if(size==0){
			System.out.print("Stack is Empty");
			return ;
		}

		for(int i=0; i<size; i++)
			System.out.print(Stack[i]+" ");

		System.out.println();
		
	}

	void deleteMiddle(int i){

		
		if(size == i){
		
			
			pop();
			return;
		
		
		}

		int top = pop();
		deleteMiddle(i);
		push(top);	



	}

	public static void main(String[] args){


		DeleteMiddle dm = new DeleteMiddle();

	
		dm.push(3);
		dm.push(4);
		dm.push(7);
		dm.push(1);
		dm.push(0);

		dm.display();
		dm.pop();

		dm.display();
		dm.deleteMiddle(2);
		dm.display();

	}

}

	