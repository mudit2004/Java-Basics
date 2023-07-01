// PopUpMenu ... MessageBox ... InputBox

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class EditFrame{
	JFrame frm;
	JTextArea ta;
	JPopupMenu mnu;
	JPopupMenuItem mnucut;
	JPopupMenuItem mnucpy;
	JPopupMenuItem mnupas;
	
    
    EditFrame(){
		frm=new JFrame("Wordpad");
		frm.setVisible(true);
		frm.setSize(500,500);
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta=new JTextArea("Enter here...");
		ta.setBounds(0,0,frm.getWidth(),frm.getHeight());
		frm.add(ta);
		
		mnu = new JPopupMenu();
		mnucut = new JPopupMenuItem("Cut");
		mnucpy = new JPopupMenuItem("Copy");
		mnupas = new JPopupMenuItem("Paste");
		mnu.add(mnucut);mnu.add(mnucpy);mnu.add(mnupas);

		ta.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent me){
				if(me.getButton() == MouseEvent.BUTTON1)
					mnu.show(ta.me.getX(),ta.me.getY());
			}
		});
		

    }

   


    public static void main(String[] args) {
		new EditFrame();
    }
}