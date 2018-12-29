package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Draw类，用于界面的初始化
 * @author CBS
 */
@SuppressWarnings("serial")
public class Draw extends JFrame {
    private DrawListener dl;
    private Graphics g;
    // 界面初始化方法
    public void showUI() {
        setTitle("画图");//窗体名称
        setSize(1200, 700);//窗体大小
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);//窗体居中
                //流式布局左对齐
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        setLayout(layout);//窗体使用流式布局管理器
        this.setResizable(false);//窗体大小不变
        
        //使用数组保存按钮名
        String buttonName[] = { "画直线", "画椭圆", "画曲线"};
                //用于保存图形按钮，使用网格布局
        JPanel jp1=new JPanel(new GridLayout(15, 2,10,10));
        jp1.setPreferredSize(new Dimension(200, 800));
        
        //实例化DrawListener对象
        dl=new DrawListener();
        //循环为按钮面板添加按钮
        for (int i = 0; i < buttonName.length; i++) {
            JButton jbutton = new JButton(buttonName[i]);
            jbutton.addActionListener(dl);//为按钮添加监听
            jp1.add(jbutton);
        }
        
        JPanel jp2=new JPanel();//画布面板
        jp2.setPreferredSize(new Dimension(970, 800));
        jp2.setBackground(Color.WHITE);
        

        // 定义Color数组，用来存储按钮上要显示的颜色信息
        Color[] colorArray = { Color.BLUE, Color.GREEN, 
                    Color.RED, Color.BLACK,Color.ORANGE,Color.PINK,Color.CYAN,
                    Color.MAGENTA,Color.DARK_GRAY,Color.GRAY,Color.LIGHT_GRAY,
                    Color.YELLOW};
        //用于保存颜色按钮的面板
        JPanel jp3=new JPanel(new GridLayout(1,colorArray.length,3,3));
        // 循环遍历colorArray数组，根据数组中的元素来实例化按钮对象
        for (int i = 0; i < colorArray.length; i++) {
            JButton button = new JButton();
            button.setBackground(colorArray[i]);
            button.setPreferredSize(new Dimension(30, 30));
            button.addActionListener(dl);//为按钮添加监听
            jp3.add(button);
        }
        //将面板添加到主窗体
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        //添加按钮，作为当前颜色
        JButton nowColor=new JButton();
        nowColor.setPreferredSize(new Dimension(40,40));
        nowColor.setBackground(Color.BLACK);//默认黑色
        add(nowColor);
        //设置窗体的组件可见，如果为FALSE就看不到任何组件
        setVisible(true);    
        //获取画笔对象
        g=jp2.getGraphics();
        dl.setG(g);
        dl.setNowColor(nowColor);
        //为面板添加鼠标监听，用于绘制图形
        jp2.addMouseListener(dl);
        jp2.addMouseMotionListener(dl);
    }
    public static void main(String[] args) {
    	Draw draw=new Draw();
    	draw.showUI();
	}
}