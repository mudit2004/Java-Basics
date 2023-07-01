I class Stack{
	int top;
	int A[];
	Stack(){
		top = -1;
		A[] = new int[10];
	}

	synchronized void push(int v){
		A[++top] = v;
		System.out.println("Pushed.."+A[top]);
	}

	synchronized void pop(){
		System.out.println("Pop..."+A[top]);
		--top;
	}
}

//THREAD
class TestSyn implements Runnable{
	Thread t;
	Stack target;
	String msg;
	TestSyn(Stack target,String msg){
		this.target = target;
		this.msg = msg;
		t = new Thread(this);
	}

	public void run(){
		synchronized(target){
			if(ch == 1){
				target.push(v);
			else
				target.pop();
		} 
		target.push(
	}
}

class StackDemo{
	public static void main(String[] args){
		Print target = new Print(); // share resource
		TestSyn t1 = new TestSyn(target , "Welcome");
		TestSyn t2 = new TestSyn(target , "Sastra");
		TestSyn t3 = new TestSyn(target , "University");
		t1.t.start();
		t2.t.start();
		t3.t.start();
	}
}