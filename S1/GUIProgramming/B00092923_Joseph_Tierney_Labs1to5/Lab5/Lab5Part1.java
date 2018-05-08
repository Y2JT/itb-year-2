import javax.swing.*;
import java.awt.*;

public class Lab5Part1 extends JFrame{

    public Lab5Part1() {

		JMenuItem jmiIrish, jmiGerman;
    	JMenuBar menu = new JMenuBar();

    	//create menus
    	JMenu functions = new JMenu("Functions");
    	JMenu languages = new JMenu("Languages");

    	//add menu items
    	functions.add(new JMenuItem("Rename"));
		functions.add(new JMenuItem("Delete"));
		languages.add(jmiIrish = new JMenuItem("Irish"));
		languages.add(jmiGerman = new JMenuItem("German"));

		//add icons
		jmiIrish.setIcon(new ImageIcon("images/ire.png"));
		jmiGerman.setIcon(new ImageIcon("images/ger.png"));

		//add menu items to menu
    	menu.add(functions);
    	menu.add(languages);

		//set menu
    	setJMenuBar(menu);
    	setTitle("Menu");
    	setSize(300,300);
    	setVisible(true);

    }//end Lab5Part1

    public static void main(String args[]){
    	Lab5Part1 menus = new Lab5Part1();
    }//end main method

}//end class