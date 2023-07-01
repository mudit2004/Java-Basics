import java.io.DataInputStream;
import java.io.IOException;
class Test1{
	public static void main(String[] args) throws Exception{
		DataInputStream din = new DataInputStream(System.in);
		int a = din.readInt();
		Thread.sleep(100);
		System.out.println(a);
	}
}