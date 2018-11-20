/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package korsak.controller;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author lebrenzi
 */
public class basketFrame extends JFrame{
    private int xSize, ySize;
    
    basketFrame(){
        
    }
    
    basketFrame(String message){
        super(message);
        xSize = 800;
        ySize = 600;
        this.setSize(xSize, ySize);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        basketSet();
        this.setVisible(true);
        
    }
    
    
    public void basketSet(){
       TableModel dataModel = new AbstractTableModel() {
          public int getColumnCount() { return 4; }
          public int getRowCount() { return 15;}
          public Object getValueAt(int row, int col) { return new Integer(row*col); }
      };
      JTable table = new JTable(dataModel);
      JScrollPane scrollpane = new JScrollPane(table);
      this.add(table);
    }
}
