import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Demo{
    JFrame frm;
    JLabel l;
    Demo(){
        frm = new JFrame();
        frm.setVisible(true);
        frm.setSize(500,500);
        frm.setLayout(null);
        l = new JLabel("SASTRA");
        frm.add(l);
        l.setBounds(100, 100, 100, 20);
        l.setFont(new Font("Arid", Font.BOLD, 20));
        l.setForeground(Color.red);
        Timer t = new Timer(100, new ActionListener(){
            boolean f = true;
            int x = 10;
            public void actionPerformed(ActionEvent ae){
                if(f){
                    l.setForeground(Color.RED);
                    f = false;
                }
                else{
                    l.setForeground(frm.getBackground());
                    f = true;
                }
                if(x<=500){
                    l.setLocation(x, 100);
                    x+=50;
                }
                else{
                    x = 0;
                    l.setLocation(x, 100);
                    x+=50;
                }
            }
        });
        t.start();
    }
    public static void main(String args[]){
        new Demo();
    }
}