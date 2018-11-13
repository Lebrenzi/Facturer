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
import javax.swing.SwingUtilities;

public class controller{
private model database;
private view application;
	controller(){
		this.database = null;
		this.application = new view("Facturer");
	}
	
	public void sendMessage(String message){
		this.application.printMessage(message);
	}

	controller(model m, view v){
		this.database = m;

	}
}
