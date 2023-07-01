import java.util.*;

class MyComp implements Comparator<String>{
	public int compare(String a, String b){
		return a.compareTo(b);
	}
}

class Test{
	public static void main(String[] args){
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Alice");
		l1.add("Clark");
		l1.add("Bob");	
		l1.add("Darth");
		l1.addFirst("xxx");	
		//Collections.sort(l1,new MyComp());

		Iterator<String> itr = l1.iterator();
		while(itr.hasNext()){
			String e = (String)itr.next();
			itr.set(e+"...");
		}
		System.out.println(l1);
	}
}	