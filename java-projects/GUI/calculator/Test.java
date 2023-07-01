import java.lang.*;
import java.awt.*;
import java.awt.event.*;


public class Test extends Frame implements ActionListener{
	static int count;
	Button btnSubmit;
	//Button btnSubmit2;
	TextField t1;
	TextField t2;
	Label lbl;
	Label l1;
	Label l2;
	Label l3;
	public Test(){
		t1 = new TextField();
		t2 = new TextField();
		l1 = new Label("First Operand: ");
		l2 = new Label("First Operand: ");
		l3 = new Label("Result: ");
		btnSubmit = new Button("+");
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
		add(l3);
		l3.setBounds(50,160,100,30);
		add(t1);
		t1.setBounds(150,60,200,30);
		add(t2);
		t2.setBounds(150,110,200,30);
		add(lbl);
		lbl.setBounds(150,160,100,30);
		btnSubmit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand() == "+"){
		int s1  = Integer.parseInt( t1.getText());
		int s2 = Integer.parseInt(t2.getText());
			lbl.setText(String.valueOf(s1+s2));
		repaint();
		}
		//else{
		//	t1.setText(" ");
		//	t2.setText(" ");
		//}	
	}
	public static void main(String[] args){
		new Test();
	}
}
		