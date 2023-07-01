/*

Thread Synchrnization 
---------------------

-> Shared resource
-> Race condition - more than one Thread try to catch the CPU.
	1. Synchronized block
	2. Synchronized method

-> KEYWORD - Synchronized



Syntax Synchronized function
----------------------------

synchronized public void function(){
}
synchronized(shared_resource){
}


*/

//SHARED RESOURCE
class Print{
	Synchronized void callPrint(String msg){
		System.out.print("["+msg);
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){}
		System.out.println("]");
		
	}
}

//THREAD
class TestSyn implements Runnable{
	Thread t;
	Print target;
	String msg;
	TestSyn(Print target,String msg){
		this.target = target;
		this.msg = msg;
		t = new Thread(this);
	}

	public void run(){
		target.callPrint(msg);
//		synchronized(target){
//			target.callPrint(msg);
//		}
	}
}

class TestSynDemo{
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
		
		