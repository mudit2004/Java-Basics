package Bank.Acc.Sav;
import Bank.Account;
public class Saving extends Account{
	final int MAX = 10000;
	public Saving( int a, int b){
		super(a,b);
	}
	public void depoist(int q){
		if( q < MAX){
			Balance += q;
		}
		else{
			System.out.println("INVALID!!, depoist only under 10000 ");
		}
	}
	public void withdrawal(int q){
		if(q < Balance){
			Balance -= q;
		}
		else{
			System.out.println("INVALID!!, less funds in acc ");
		}
	}
}	
		
		