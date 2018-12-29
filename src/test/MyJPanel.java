package test;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

//写一个类来改造画板
public class MyJPanel extends JPanel implements ActionListener, MouseListener,
MouseMotionListener{
	private paintJFrame jf=null;
	MyJPanel(paintJFrame jf){
		System.out.println(555);
		this.jf=jf;
		//把事件关联到这个面板上 （ 注册事件）
		this.addMouseListener(this);
		
	}
	private String type;
	public void setType(String type) {
		this.type=type;
	}
	
	int x,y;
	int x1,y1;
	
	//鼠标的按下
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(222);
		x=e.getX();
		y=e.getY();
		
	}
	
	//鼠标的松开
	@Override 
	public void mouseReleased(MouseEvent e)
	{
		System.out.println(333);
		 x1=e.getX();
		 y1=e.getY();
		Graphics2D g=(Graphics2D) this.getGraphics();
		if(type.equalsIgnoreCase("直线"))
		{
			g.drawLine(x,y,x1,y1);
		}
		else if(type.equalsIgnoreCase("矩形"))
		{
			g.drawRect(x, y, x1-x, y1-y);
		}
		else if(type.equalsIgnoreCase("圆形"))
		{
			g.drawOval(x, y, x1-x, y1-y);
		}
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
