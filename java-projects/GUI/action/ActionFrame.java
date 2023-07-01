// ActionEvent... ActionListener...Button,list,....JButton, JList
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
class ActionFrame extends JFrame implements ActionListener{
	JButton b;
	ActionFrame(){
		setVisible(true);
		setSize(500,500);
		setTitle("ActionDemo");
		setLayout(null);
		
		b = new JButton("Click");
		add(b);
		b.setBounds(50,50,100,50);
	
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		//if(ae.getSource()==b or ae.getActionCommand.equals("Click"))
		Random r = new Random();
		getContentPane().setBackground(new Color(r.nextInt()%260,r.nextInt()%260,r.nextInt()%260));
		
	}
	public static void main(String[] args){
		new ActionFrame();
	}
}