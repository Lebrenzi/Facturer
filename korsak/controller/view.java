/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package korsak.controller;

/**
 *
 * @author lebrenzi
 */
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class view extends JFrame{
    
//data base manipulator
private controller c;
    
//Atributes
private int xSize, ySize;

//Searching frame
private searchFrame sf;



private JPanel topButtonPanel;
private JPanel bottomOperationalPanel;
private JTextArea log_test;
private JTextArea dataBaseLog;
private JButton button;
private JButton basket;
private JButton message;
private JTextField enterMessage;


//Main constuctor
view(String title) throws SQLException
{	
	super(title);
        c = new controller();
	//Two working panes
	topButtonPanel = new JPanel();
	bottomOperationalPanel = new JPanel();

	//Initializing elements
	button = new JButton("Search");
        basket = new JButton("To the basket");
        message = new JButton("Retrieve message");
	log_test = new JTextArea(50,20);
       	dataBaseLog = new JTextArea(50,20);
	enterMessage = new JTextField(20);
        
        
	this.xSize = 800;
	this.ySize = 600;
        
	this.setSize(xSize, ySize);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	//Function which sets frame
	setFrame();

	this.setVisible(true);
}


public void setFrame(){
	this.setLayout(new BorderLayout());
	this.add(topButtonPanel, BorderLayout.NORTH);
	this.add(bottomOperationalPanel, BorderLayout.CENTER);
	setBottomOperationalPanel();
	setTopOperationalPanel();
}


public void setTopOperationalPanel()
{
	topButtonPanel.setLayout(new FlowLayout());
	JPanel int_1 = new JPanel();
	JPanel int_2 = new JPanel();
	topButtonPanel.add(button);
        
	topButtonPanel.add(basket);
        
        topButtonPanel.add(message);
	//topButtonPanel.add(int_1, BorderLayout.NORTH);
	//topButtonPanel.add(int_2, BorderLayout.SOUTH);
	topButtonPanel.add(enterMessage);
        button.addActionListener((e) -> {
            sf = new searchFrame("Search");
        });
        basket.addActionListener((e) -> {
            basketFrame bf = new basketFrame("Basket");
        });
        message.addActionListener((e) -> {
            try {
                this.printMessage();
            } catch (SQLException ex) {
                this.dataBaseLog.append("Something goes wrong\n");
                Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
}

public void setBottomOperationalPanel()
{   
    JPanel westPane = new JPanel();
    JPanel centralBrake = new JPanel();
    JPanel northBrake = new JPanel();
    JPanel southBrake = new JPanel();
    bottomOperationalPanel.setLayout(new BorderLayout());
    bottomOperationalPanel.add(westPane, BorderLayout.WEST);
    westPane.setLayout(new BorderLayout());
    westPane.add(northBrake, BorderLayout.NORTH);
    westPane.add(centralBrake, BorderLayout.CENTER);
    westPane.add(southBrake, BorderLayout.SOUTH);
    westPane.add(log_test, BorderLayout.WEST);
    westPane.add(dataBaseLog, BorderLayout.EAST);
};



void printMessage() throws SQLException{
	String message = c.sendMessage("Rura");
	this.dataBaseLog.append(message);
        this.dataBaseLog.append("\n");

}

view(){}
}
