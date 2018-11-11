import javax.swing.SwingUtilities;

public class controller{
private model database;
private view application;
	controller(){
		this.database = null;
		this.application = new view("Facturer");
	}

	controller(model m, view v){
		this.database = m;

	}
}

