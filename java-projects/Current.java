package Bank.Acc.Cur;
import Bank.Account;
public class Current extends Account{
	final int MAX = 10000;
	public Current( int a, int b){
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
		
	