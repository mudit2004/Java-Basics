import java.util.*;

class Product{
	int pid;
	String pname;
	double up;
	Product(int pid,String pname, double up){
		this.pid = pid;
		this.pname = pname;
		this.up = up;
	}
	public String toString(){
		return pid+" "+pname+" "+up;
	}
}

class Comp implements Comparator<Product>{
	public int compare(Product p1,Product p2){
		return (p1.pname).compareTo(p2.pname)	;
	}
}

class Comp1 implements Comparator<Product>{
	public int compare(Product p1,Product p2){
		return (String.valueOf(p1.pid)).compareTo(String.valueOf(p2.pid))	;
	}
}


class Demo{
	public static void main(String[] args){
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(new Product(120,"xxx",34.5));
		al.add(new Product(100,"aaa",74.5));
		al.add(new Product(202,"bbb",64.5));

		System.out.println("before... "+al);
		Collections.sort(al,new Comp());
		for(var i:al){
			System.out.println(i+"\t");
		}

		Collections.sort(al,new Comp1());
		for(var i:al){
			System.out.println(i+"\t");
		}





		
		/*Iterator itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		

		/*System.out.println(al);
		//al.remove(0);
		double amt = 0;
		double t = 0;
		for(var i:al){
			t = i.up*2.0;
			System.out.println(i+"\t"+t);
			amt+=t;
		}
		System.out.println("Amount to be paid... "+amt);
		*/
	}
}



/*class Demo{
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		
		System.out.println(al+"\n"+al.size());
		al.remove(1);
		System.out.println(al+"\n"+al.size());
		al.clear();
		System.out.println(al+"\n"+al.size());
	}
}*/