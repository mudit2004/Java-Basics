package Bank;
abstract public class Account{
	public int AccNo;
	public double Balance;
	public Account(){
		AccNo = 0;
		Balance = 0.0;
	}
	public Account(int a, double b){
		AccNo = a;
		Balance = b;
	}
	public void display(){
		System.out.println("The balance is : "+Balance);
	}
	public void depoist(int q){
	}
	public void withdrawal(int q){
	}
}