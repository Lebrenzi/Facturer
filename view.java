import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
public class view extends JFrame{
private int xSize, ySize;
private JPanel topButtonPanel;
private JPanel bottomOperationalPanel;
view(String title)
{	
	super(title);
	topButtonPanel = new JPanel();
	bottomOperationalPanel = new JPanel();
	this.xSize = 800;
	this.ySize = 600;
	this.setSize(xSize, ySize);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setFrame();
	this.setVisible(true);
}

public void setFrame(){
	this.setLayout(new BorderLayout());
	this.add(topButtonPanel, BorderLayout.NORTH);
	this.add(bottomOperationalPanel, BorderLayout.CENTER);
	topButtonPanel.setLayout(new BorderLayout());
	bottomOperationalPanel.setLayout(new BorderLayout());
	JButton clickMe = new JButton("Click me");
	JTextArea writeOnMe = new JTextArea(50,20);
	topButtonPanel.add(clickMe, BorderLayout.WEST);
	bottomOperationalPanel.add(writeOnMe, BorderLayout.CENTER);
	clickMe.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
			writeOnMe.append("Click! ");
		}
	});

}


view(){}
}
