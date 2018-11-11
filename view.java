import javax.swing.jframe;

import javax.swing.JButton;
import java.awt.BorderLayout;
public class view extends JFrame{
private int xSize, ySize;


view(String title)
{	
	super(title);
	this.xSize = 400;
	this.ySize = 400;
	this.setSize(xSize, ySize);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	JButton clickMe = new JButton("Click me");
	this.add(clickMe, BorderLayout.NORTH);
	this.setVisible(true);
}

public void setFrame(){
	this.setLayout(new BorderLayout());
	JButton clickMe = new JButton("Click me");
	this.add(clickMe, BorderLayout.NORTH);
}


view(){}
}
