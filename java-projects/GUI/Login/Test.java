import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test extends Frame implements ActionListener{
	static int count;
	Button btnSubmit;
	Button btnSubmit2;
	TextField t1;
	TextField t2;
	Label lbl;
	Label l1;
	Label l2;
	Label l3;
	JRadioButton c1 ;
	JRadioButton c2;
	public Test(){
		t1 = new TextField();
		t2 = new TextField();
		l1 = new Label("USER NAME: ");
		l2 = new Label("PASSWORD: ");
		l3 = new Label("GENDER: ");
		btnSubmit = new Button("Submit");
		btnSubmit2 = new Button("Cancel");
		c1 = new JRadioButton("Male"); 
		c2 = new JRadioButton("Female"); 
		lbl = new Label();
		setVisible(true);
		setSize(500,500);
		setLayout(null);
		add(l1);
		l1.setBounds(50,60,100,30);
		add(l2);
		l2.setBounds(50,110,100,30);
		add(btnSubmit);
		btnSubmit.setBounds(250,210,100,30);
		add(btnSubmit2);
		btnSubmit2.setBounds(50,210,100,30);
		add(l3);
		l3.setBounds(50,160,100,30);
		add(c1);
		c1.setBounds(150,160,100,30);
		add(c2);
		c2.setBounds(260,160,100,30);
		add(t1);
		t1.setBounds(149,60,200,30);
		add(t2);
		t2.setBounds(149,110,200,30);
		add(lbl);
		lbl.setBounds(250,250,200,50);
		btnSubmit.addActionListener(this);
		btnSubmit2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand() == "Submit"){
		try{
		String s1  = t1.getText();
		String s2 = t2.getText();
			lbl.setText("Welcome");
		}catch(Exception e){
			lbl.setText("Not Welcome");
		}
		repaint();
		}
		else{
			t1.setText(" ");
			t2.setText(" ");
		}	
	}
	public static void main(String[] args){
		new Test();
	}
}
		