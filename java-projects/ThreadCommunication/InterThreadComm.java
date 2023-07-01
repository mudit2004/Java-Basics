//shared resource.
class Queue{
	int v;
	boolean semaphore = false;
	synchronized void put(int v){
		
		//wait
		while(semaphore)
			try{
				wait();
			}catch(InterruptedException e){}

		//taks
		this.v = v;
		System.out.println("Put..."+v);
		
		//signal
		semaphore = true;
		notify();
	}
	synchronized void get(){

		//wait
		while(!semaphore)
			try{
				wait();
			}catch(InterruptedException e){}
		
		//task
		System.out.println("Get..."+v);

		//signal
		semaphore = false;
		notify();
	}
}

//Producer Thread.
class Producer implements Runnable{
	Thread t;
	Queue q;
	Producer(Queue q){
		this.q = q;
		t = new Thread(this,"Producer");
	}
	
	public void run(){
		int i = 0;
		while(true){
			q.put(++i);
		}
	}
}


//Consumer Thread.
class Consumer implements Runnable{
	Thread t;
	Queue q;
	Consumer(Queue q){
		this.q = q;
		t = new Thread(this,"Consumer");
	}
	
	public void run(){
		while(true){
			q.get();
		}
	}
}

class InterThreadComm{
	public static void main(String[] args){
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.t.start();
		c.t.start();
	}
}