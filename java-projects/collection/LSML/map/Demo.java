import java.util.*;

//UNSORTED
/*class Demo{
	public static void main(String[] args){
		HashMap<String,Double> hm = new HashMap<String,Double>();
		hm.put("Alice",12000.00);
		hm.put("Bob",10000.00);
		hm.put("Clark",13000.00);
		hm.put("Darth",14000.00);
		Set<Map.Entry<String,Double>> set = hm.entrySet();   //navigatable set 
		for(var me:set){
			System.out.println(me.getKey()+"\t"+me.getValue());
		}     

	}
}*/

class MyCompLast implements Comparator<String>{
	public int compare(String a, String b){
		int i = a.lastIndexOf(" ");
		int j = b.lastIndexOf(" ");
		return a.substring(i).compareTo(b.substring(j));
	}
}

class MyCompFirst implements Comparator<String>{
	public int compare(String a, String b){
		return a.compareTo(b);
	}
}

//SORTED
class Demo{
	public static void main(String[] args){
		MyCompLast c = new MyCompLast();
		Comparator<String> co = c.thenComparing(new MyCompFirst());
		TreeMap<String,Double> hm = new TreeMap<String,Double>(c);
		hm.put("Mathew Clark",13000.00);
		hm.put("John Alice",12000.00);
		hm.put("Mark Bob",10000.00);
		hm.put("Kavin Darth",14000.00);
		//double d = hm.get("Darth");
		//hm.put("Darth",d+5000.00);
		Set<Map.Entry<String,Double>> set = hm.entrySet();   //navigatable set
		for(var me:set){
			System.out.println(me.getKey()+"\t"+me.getValue());
		}     

	}
}















