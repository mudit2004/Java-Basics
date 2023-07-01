//InputStream ... OutputStream
import java.io.*;

/*class Test1{
	public static void main(String[] args) throws IOException{
		//read data from console
		InputStream in = System.in;
		byte data[] = new byte[10];
		in.read(data);
		in.close();
		

		OutputStream out = System.out;
		out.write(data);
		out.close();
	}
}*/

class Test1{
	public static void main(String[] args) throws IOException{
		//read data from console
		Reader in = new InputStreamReader(System.in);
		char data[] = new char[10];
		in.read(data);
		in.close();
		

		Writer out = new OutputStreamWriter(System.out);
		out.write(data);
		out.close();
	}
}


/*class Test1{
	public static void main(String[] args) throws IOException{
		DataInputStream din = new DataInputStream(System.in);
		int a = din.readInt();
		float b = din.readFloat();
		din.close();

		DataOutputStream dout = new DataOutputStream(System.out);
		dout.writeInt(a);
		dout.writeFloat(b);
		dout.close();
	}
}*/

/*class Test1{
	public static void main(String[] args) throws IOException{
		BufferedInputStream bin = new BufferedInputStream(System.in);
		byte[] data = new byte[100];
		bin.read(data);

		System.out.println(new String(data));
	}
}*/
