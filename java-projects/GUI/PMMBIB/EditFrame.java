 // PopUpMenu ... MessageBox ... InputBox

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class EditFrame{
	JFrame frm;
	JTextArea ta;
	JPopupMenu mnu;
	JMenuItem mnucut;
	JMenuItem mnucpy;
	JMenuItem mnupas;
	
    
    EditFrame(){
		frm=new JFrame("Wordpad"); 
		frm.setVisible(true);
		frm.setSize(500,500);
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta=new JTextArea("Enter here...");
		ta.setBounds(0,0,frm.getWidth(),frm.getHeight());
		frm.add(ta);
		frm.getContentPane().repaint();
		mnu = new JPopupMenu();
		mnucut = new JMenuItem("Cut");
		mnucpy = new JMenuItem("Copy");
		mnupas = new JMenuItem("Paste");
		mnu.add(mnucut);mnu.add(mnucpy);mnu.add(mnupas);

		mnucut.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				ta.cut();
			}
		});

		mnucpy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				ta.copy();
			}
		});

		mnupas.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				ta.paste();
			}
		});

		ta.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
				if(me.getButton() == MouseEvent.BUTTON3)
					mnu.show(ta,me.getX(),me.getY());
			}
		});
		

    }

   


    public static void main(String[] args) {
		new EditFrame();
    }
}