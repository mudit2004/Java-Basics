import java.util.*;

/*class MyComp implements Comparator<String>{
	public int compare(String a, String b){
		return a.compareTo(b);
	}
}

class Test1{
	public static void main(String[] args){
		HashSet<String> l1 = new HashSet<String>(new MyComp().reversed() );
		l1.add("Alice");
		l1.add("Clark");
		l1.add("Bob");	
		l1.add("Darth");
		l1.add("xxx");	

		for(var i:l1)
			System.out.println(i+"\t"+i.hashCode());
	
	}
}*/	

/*class MyComp implements Comparator<String>{
	public int compare(String a, String b){
		return a.compareTo(b);
	}
}*/

class Test1{
	public static void main(String[] args){
		TreeSet<String> l1 = new TreeSet<String>((fstr,sstr)->fstr.compareTo(sstr)); // lamda expression
		l1.add("alice");
		l1.add("Clark");
		l1.add("Bob");	
		l1.add("Darth");
		l1.add("xxx");	

		for(var i:l1)
			System.out.println(i+"\t");
	
	}
}

/*class Test1{
	public static void main(String[] args){
		HashSet<String> l1 = new HashSet<String>();
		l1.add("Alice");
		l1.add("Clark");
		l1.add("Bob");	
		l1.add("Darth");
		l1.add("xxx");	

		for(var i:l1)
			System.out.println(i+"\t"+i.hashCode());
	
	}
}	*/