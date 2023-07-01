import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ThreadDemo1 {
	JFrame frm;
	JLabel lbl;
	ThreadDemo1(){
		frm = new JFrame("ThreadDemo");
		frm.setVisible(true);
		frm.setSize(600,600);
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lbl = new JLabel("SANJITHA");
		frm.add(lbl);lbl.setBounds(50,50,300,50);
		lbl.setFont(new Font("Arial",Font.BOLD,20));
		lbl.setForeground(Color.red);

		Timer t = new Timer(100,new ActionListener(){
			boolean f = true;int x = 0; int y = 0;
			boolean f1 = true;boolean f2 = true;
			public void actionPerformed(ActionEvent ae){
				if(f){
					lbl.setForeground(Color.red);f = false;
				}
				else{
					lbl.setForeground(frm.getForeground());f = true;
				}
				lbl.setLocation(x,y);
				if(f1)
					x+=10;
				else
					x-=10;
				if(f2)
					y+=5;
				else
					y-=5;
				if(x>=frm.getWidth()-lbl.getWidth()+200 || x<=0){
					f1 = !f1;
				}
				if(y >= frm.getHeight()-lbl.getHeight()-17 || y<=0){
					f2 = !f2;
				}
				
			}
		});
		t.start();
	}
	public static void main(String[] args){
		new ThreadDemo1();
	}
}