public class SortAStack{

	int capacity = 10;
	int Stack[] = new int[capacity];
	int size = 0;
	


	void push(int data){

	
		if(size==capacity){
			System.out.print("Stack overflow");
			return ;
		}

		Stack[size]=data;
		size++;

	}


	int pop(){

	if(size==0){
			System.out.print("Stack empty");
			return -1;
		}

	
	int a = Stack[size-1];
	size--;
	return a;

	}

	void display(){
		
		for(int i=0; i<size ; i++)
			System.out.print(Stack[i]+" ");

	}

	void sortAStack(){

		if(size>0){

			int top = pop();
			sortAStack();
			sortedInsert(top);
		}


	}

	void sortedInsert(int data){


		if(size==0 || Stack[size-1] <= data){

			push(data);
		}


		else{

			int top = pop();
		sortedInsert(data);
		push(top);


		}

	}




	public static void main(String[] args){

		SortAStack stack = new SortAStack();

		stack.push(5);
		stack.push(2);
		stack.push(1);
		stack.push(4);
		stack.push(9);


	stack.pop();
	stack.display();
	stack.sortAStack();
	stack.display();

		
		

	}











}