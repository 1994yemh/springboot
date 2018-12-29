package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintJFrame extends JFrame implements ActionListener{
	
	
	JButton jb1=new JButton("直线");
	JButton jb2=new JButton("矩形");
	JButton jb3=new JButton("圆形");
	JButton jb4=new JButton("颜色");
	private Graphics g;
	
	Color selectColor=Color.black;//画笔的颜色
	
	MyJPanel jp=new MyJPanel(this);//绘画区域
	public void actionPerformed(ActionEvent e) 
	{
		if(jb1==e.getSource())
		{  
			System.out.println(111);
			//画直线
			jp.setType("直线");
			
		}
		else if(jb2==e.getSource())
		{
			//画矩形
			jp.setType("矩形");
		}
		else if(jb3==e.getSource())
		{
			//画圆形
			jp.setType("圆形");
		}
		else if(jb4==e.getSource())
		{
			//选颜色
			//弹出颜色选择面板  用来选择画笔颜色
			JColorChooser jc=new JColorChooser();
			//打开颜色选择面板 并得到选择面板所选择的颜色
			selectColor=jc.showDialog(this,"颜色面板",selectColor);
			//将选好的颜色设置为按钮背景颜色
			jb4.setBackground(selectColor);
		}
		
	}
	
	
	//构造器
	public paintJFrame() {
		
		//设置构造器背景颜色
		this.getContentPane().setBackground(Color.gray);
		
		
		JPanel jp2=new JPanel();//绘画区域
		jp2.setBackground(Color.white);//设置画板的底色为白色
		jp2.setBounds(65,10,515,545);
		
		//把绘画板添加到窗口中
		this.add(jp2);
		
		//添加按钮到窗口中
				this.add(jb1);
				this.add(jb2);
				this.add(jb3);
				this.add(jb4);
				jb4.setBackground(selectColor);
		
		//把按钮关联事件 (注册事件)
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		
		
		//设置按钮的位置大小
		jb1.setBounds(1, 10, 60, 30);
		jb2.setBounds(1, 40, 60, 30);
		jb3.setBounds(1, 70, 60, 30);
		jb4.setBounds(1, 100, 60, 30);
		
		this.setLayout(null);//令系统固定布局变为一个自定义的组件摆放方式布局
		this.setTitle("实验五简易画板");//设置窗口的标题
		this.setSize(600,600);//设置窗口的大小
		this.setVisible(true);//显示窗口
		
	}	
	public static void main(String[]args) {
		
		new paintJFrame();
		
	}	
}