/*
AdjustmentEvent
---------------

-> deals with Scrollbar
-> AdjustmentListener
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ColorFrame extends JFrame implements AdjustmentListener{
	JScrollBar sr,sg,sb;
	ColorFrame(){
		setVisible(true);	
		setSize(500,500);
		setTitle(null);
		setLayout(null);
		
		sr = new JScrollBar(JScrollBar.HORIZONTAL,0,5,0,255);
		add(sr);
		sr.setBounds(50,50,255,20);
		//sr.setBackground(Color.red);
		sg = new JScrollBar(JScrollBar.HORIZONTAL,0,5,0,255);
		add(sg);
		//sg.setBackground(Color.green);
		sg.setBounds(50,150,255,20);
		sb = new JScrollBar(JScrollBar.HORIZONTAL,0,5,0,255);
		add(sb);	
		sb.setBounds(50,250,255,20);
		//sb.setBackground(Color.blue);

		sr.addAdjustmentListener(this);
		sg.addAdjustmentListener(this);
		sb.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae){
		getContentPane().setBackground(new Color(sr.getValue(),sg.getValue(),sb.getValue()));
	}
	public static void main(String[] args){
		new ColorFrame();
	}
}