import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ThreadDemo{
	JFrame frm;
	JTextArea t1,t2,t3;
	JButton b;
	ThreadDemo(){
		frm = new JFrame("ThreadDemo");
		frm.setVisible(true);
		frm.setSize(600,600);
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t1 = new JTextArea();frm.add(t1);t1.setBounds(100,100,100,300);
		t2 = new JTextArea();frm.add(t2);t2.setBounds(250,100,100,300);
		t3 = new JTextArea();frm.add(t3);t3.setBounds(400,100,100,300);
		b = new JButton("Start");
		frm.add(b);b.setBounds(50,50,100,50);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new AddThread().start();
				new SubThread().start();
				new MulThread().start();
			}
		});
	}
	class AddThread extends Thread{
		String msg = "";
		public void run(){
			for(int i = 1;i<15;i++){
			try{
				msg+=i+" + 2 = "+(i+2)+"\n";
				Thread.sleep(100);
				t1.setText(msg);
			}catch(Exception e){}
			}
		}
	}
	class SubThread extends Thread{
		String msg = "";
		public void run(){
			for(int i = 1;i<15;i++){
			try{
				msg+=i+" - 2 = "+(i-2)+"\n";
				Thread.sleep(200);
				t2.setText(msg);
			}catch(Exception e){}
			}
		}
	}
	class MulThread extends Thread{
		String msg = "";
		public void run(){
			for(int i = 1;i<15;i++){
			try{
				msg+=i+" * 2 = "+(i*2)+"\n";
				Thread.sleep(300);
				t3.setText(msg);
			}catch(Exception e){}
			}
		}
	}
	public static void main(String[] args){
		//SwingUtilities.invokeLater(
		//new Runnable(){
		//public void run(){
		new ThreadDemo();
		//}
		//})
	}
}