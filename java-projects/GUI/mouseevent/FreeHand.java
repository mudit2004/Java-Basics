/*
MouseEvent
----------
-> only mouse-only events should implements this MouseEvent.
-> javap java.awt.event.MouseEvent
-> javap java.awt.event.MouseListener
-> javap java.awt.event.MouseMotionListener
*/
import java.awt.*;
import java.awt.event.*;


class FreeHand extends Frame implements ItemListener,MouseListener , MouseMotionListener
{
	int xPressed , yPressed;
	int xReleased , yReleased;
	Graphics2D g;
	List l; int stroke;
	FreeHand()
	{
		
		setVisible(true);
		setSize(500,500);
		setTitle("Free-Hand");
		setLayout(null);
		l = new List(3);
		for(int i =1;i<50;i++){
			l.add(i+" ");
		}
		add(l);
		stroke= 1;
		l.setBounds(50,50,100,50);

		l.addItemListener(this);
		setBackground(Color.yellow);
		setForeground(Color.red);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		stroke = Integer.parseInt(l.getSelectedItem());
	}
	public void mouseClicked(MouseEvent me){}
  	public void mousePressed(MouseEvent me)
	{
		xPressed = me.getX();
		yPressed = me.getY();
	}
 	public void mouseReleased(MouseEvent me){}
  	public void mouseEntered(MouseEvent me){}
  	public void mouseExited(MouseEvent me){}

	public void mouseDragged(MouseEvent me)
	{
		g = (Graphics2D) this.getGraphics();
		g.setStroke(new BasicStroke(stroke));
		xReleased = me.getX();
		yReleased = me.getY();
		g.drawLine(xPressed,yPressed,xReleased,yReleased);
		xPressed = xReleased;
		yPressed = yReleased;
	}
  	public void mouseMoved(MouseEvent me){}
	public static void main(String[] args){
		new FreeHand();
	}
}