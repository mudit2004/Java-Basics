// PopUpMenu ... MessageBox ... InputBox

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class InvalidMarkException extends Exception{
	public String toString(){
		return "ENTER VALID MARK";
	}
}
class EditFrame1{
	JFrame frm;
	JLabel lbl;
	JTextField txt;
	JButton b;	

    EditFrame1(){
		frm=new JFrame("Wordpad"); 
		frm.setVisible(true);
		frm.setSize(500,500);
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lbl = new JLabel("Mark: ");frm.add(lbl);lbl.setBounds(50,50,100,50);
		txt = new JTextField(20);frm.add(txt);txt.setBounds(180,50,100,50);
		b = new JButton("Check..");frm.add(b);b.setBounds(50,100,100,50);		
	
		//alert msg
		JOptionPane.showMessageDialog(frm,"Enter Properly ....");
		
			
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				try{
					int v = Integer.parseInt(txt.getText());
					if(v<0 || v> 100)
						throw new InvalidMarkException();
				}catch(Exception e){
					JOptionPane.showMessageDialog(frm,e.toString());
					JOptionPane.showInputDialog(frm,"Enter Properly ....","Input");
					
				}
			}
		});
    }
    public static void main(String[] args) {
		new EditFrame1();
    }
}