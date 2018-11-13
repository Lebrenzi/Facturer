/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package korsak.controller;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

/**
 *
 * @author lebrenzi
 */
public class searchFrame extends JFrame{
    
    private int xSize, ySize;

    
    searchFrame(String message){
        super(message);
        
        this.xSize = 450;
        this.ySize = 200;
        this.setSize(xSize,ySize);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        searchMessage("Message");
        this.setVisible(true);
        
    }
    
    
    public void searchMessage(String message){
    

    //Combobox choose versions;
    String[] materials = {" ","Miedź", "Mosiądz", "PP", "Pex", "Alu-Pex", "Spiro"};
    String[] types = {" ","Rura", "Kształtka", "Mufa", "Trójnik"};
    String[] sizes = {" ","6mm", "10mm", "16mm", "20mm", "25mm", "32mm", "40mm", "50mm", "100mm"};
    String[] triplerAdditionalSize = {" ", "6mm", "10mm", "16mm", "20mm", "25mm", "32mm", "40mm", "50mm", "100mm"};
    
    JPanel topOne = new JPanel();
    JPanel bottomOne = new JPanel();
    JPanel ratioButtonPane = new JPanel();
    this.setLayout(new BorderLayout());
    this.add(topOne,BorderLayout.NORTH);
    this.add(ratioButtonPane,BorderLayout.CENTER);
    this.add(bottomOne,BorderLayout.SOUTH);
    
    //Top pane making
    topOne.setLayout(new FlowLayout());
    JTextField searchField = new JTextField(10);
    JTextField triplerField = new JTextField(3);
    triplerField.setEnabled(false);
    JComboBox material = new JComboBox(materials);
    JComboBox type = new JComboBox(types);
    JComboBox size = new JComboBox(sizes);
    topOne.add(searchField);
    topOne.add(material);
    topOne.add(type);
    topOne.add(size);
    topOne.add(triplerField);
    
    
    //Radio Buttons
    JTextField amount = new JTextField(5);
    JLabel am = new JLabel("Ilość");
    JRadioButton chooseIfTripler = new JRadioButton("Trójnik niesymetryczny");
    chooseIfTripler.setEnabled(false);
    type.addActionListener((e)->{
        if(type.getSelectedItem() == "Trójnik")
        {
           chooseIfTripler.setEnabled(true);
        }
        else{
           chooseIfTripler.setEnabled(false);
        }
    });
    chooseIfTripler.addActionListener((e) -> {
        if(chooseIfTripler.isSelected())
        {
            triplerField.setEnabled(true);
        }
        else{
            triplerField.setEnabled(false);
        }
    });
    ratioButtonPane.setLayout(new FlowLayout());
    ratioButtonPane.add(am);
    ratioButtonPane.add(amount);
    ratioButtonPane.add(chooseIfTripler);
    
    //Bottom pane making
    JButton search = new JButton("Search");
    
    JButton OK = new JButton("OK");
    OK.addActionListener((e) -> {
        this.dispose();
    });
    bottomOne.setLayout(new FlowLayout());
    bottomOne.add(search);
    bottomOne.add(OK);
    

}
    
    searchFrame(){};
    
}
