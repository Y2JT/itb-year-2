import javax.swing.*;
import java.awt.*;

public class Lab3Part2 extends JFrame{

    public Lab3Part2() {

    	Container contentPane = getContentPane();

    	//reate array of shops
    	String shops[] = {"Dunnes Stores", "GameStop", "Spar", "Tesco", "Aldi", "Dublin City Comics", "Schuh", "Amazon"};

    	//create list
    	JList shopList = new JList<String>(shops);
    	JScrollPane pane = new JScrollPane(shopList);
    	//set list to the north of the frame
    	contentPane.add(shopList,BorderLayout.NORTH);

		//add the scroll to the content pane
    	contentPane.add(pane);

    	//set frame details
    	setTitle("Shops");
    	setSize(500,300);
    	setVisible(true);

    }//end Lab2Part2 method

    public static void main(String args[]){
    	Lab3Part2 myList = new Lab3Part2();
    }//end main method

}//end class