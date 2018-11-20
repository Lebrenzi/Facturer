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
import java.sql.SQLException;
import javax.swing.SwingUtilities;

public class controller{
private model database;
private view application;
	controller() throws SQLException{
		this.database = new model();
	}
	
	public String sendMessage(String tableName) throws SQLException{
		return this.database.returnAllFromTable(tableName);
	}

	controller(model m){
		this.database = m;

	}
}
