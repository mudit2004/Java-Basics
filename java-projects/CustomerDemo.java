package Bank.Cus;
import Bank.Account;
import Bank.Acc.Sav.Saving;
import Bank.Acc.Cur.Current;
import java.util.Scanner;

class Customer{
	int id;
	String name;
	Account a;
	Customer(int r, String b , Account q){
		id = r;
		name = b;
		this.a = q;
	}
}

public class CustomerDemo{
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Customer c[] = new Customer[5];
		int ch,t,u,o,balance;
		int i;
		String s;
		for(i=0;i<5;i++){
			System.out.println("Enter id, name, ...... and 1 for saving adn 2 for current and balance : ");
			t = in.nextInt();
			s = in.next();
			ch = in.nextInt();
			balance = in.nextInt();
			if(ch ==1){
				c[i] = new Customer(t,s,new Saving(t,balance));
			}
			else if(ch == 2){
				c[i] = new Customer(t,s,new Current(t,balance));
			}
		}
		System.out.println("Enter how many customers to do changes : ");
		ch = in.nextInt();
		for(i=ch ;i!=0;i--){
			System.out.println("Enter customers number to do changes : ");
			u = in.nextInt();
			System.out.println("1 for depoist 2 for withdrawal : ");
			o = in.nextInt();
			if(o==1){
				System.out.println("Enter amount: ");
				o = in.nextInt();
				c[u-1].a.depoist(o);
				c[u-1].a.display();
			}
			else if(o==2){
				System.out.println("Enter amount: ");
				o = in.nextInt();
				c[u-1].a.withdrawal(o);
				c[u-1].a.display();
			}
		}
	}
}
				
		
	
	