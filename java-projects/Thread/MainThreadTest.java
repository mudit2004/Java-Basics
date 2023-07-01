/*

create Thread

-> Thread class (Extends)
-> Runnable Interface (Implements)

*/

//Creation of Thread using Runnable Interface

class NewThread implements Runnable{
	Thread t;
	NewThread(String name){	
		t = new Thread(this,name);
		System.out.println(t.getName()+ "...." + t.getState());
	}
	public void run(){
		try{
			for(int i=4;i>0;i--){
				System.out.println(t.getName()+"...."+i);
				Thread.sleep(1000);
//				if(i==2)
//					t.join();
//				if(i==2)
	//				t.suspend();
			//	if(i==4)
			//		t.resume();
			}
		}catch(Exception e){
			System.out.println(e);
		}

	}
}

class MainThreadTest{
	public static void main(String[] args){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+ "...." + t.getState()+"...."+t.isAlive());
		NewThread t1 = new NewThread("Child Thread 1: ");
		t1.t.start();
		NewThread t2 = new NewThread("Child Thread 2: ");
		t2.t.start();
		System.out.println(t1.t.getName()+ "...." + t1.t.getState()+"...."+t1.t.isAlive());
		System.out.println(t2.t.getName()+ "...." + t2.t.getState()+"...."+t2.t.isAlive());
		try{
			for(int i=0;i<5;i++){
				System.out.println(t.getName()+"...."+i);
				Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println(t1.t.getName()+ "...." + t1.t.getState()+"...."+t1.t.isAlive());
		System.out.println(t2.t.getName()+ "...." + t2.t.getState()+"...."+t2.t.isAlive());
	}
}
// even without sleep the output is overlapping.... and this is known as multitasking.