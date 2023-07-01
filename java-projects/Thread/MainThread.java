class NewThread extends Thread{
	NewThread(String name){
		super(name);
		System.out.println("created....."+this.getName()+"...."+this.getState());
	}
	public void run(){
		try{
			for(int i= 10;i>0;i--){
				System.out.println(this.getName()+"...i..."+i);
				Thread.sleep(1000); //long integer parameter.
			}
		}catch(Exception e){
			System.out.println(".."+e);
		}
	}
		
}

class MainThread{
	public static void main(String[] args){
		NewThread t1 = new NewThread("Child1");
		t1.start();
		NewThread t2 = new NewThread("Child2");
		t2.start();
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+"....."+t.getState()+"......"+t.getPriority()+"....."+t.isAlive());
		
	}
}	

/*class MainThread{
	public static void main(String[] args){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+"....."+t.getState()+"......"+t.getPriority()+"....."+t.isAlive());
		try{
			for(int i= 0;i<10;i++){
				System.out.println(t.getName()+"....."+i);
				Thread.sleep(1000); //long integer parameter.
			}
		}catch(Exception e){
			System.out.println(".."+e);
		}
	}
}	*/