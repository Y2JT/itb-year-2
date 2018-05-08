import javax.swing.*;
import java.awt.*;

public class Lab6Part1 extends JFrame {

	//create components for panel 1
	JLabel basicLabel1 = new JLabel("Panel 1");
	JButton loginButton = new JButton("Login");
	JLabel anotherLabel1 = new JLabel("Label 1");

	//create components for panel 2
	JLabel basicLabel2 = new JLabel("Panel 2");
	JButton helloButton = new JButton("Hello");
	JLabel anotherLabel2 = new JLabel("Label 2");

	Container contentPane = getContentPane();

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();

    public Lab6Part1() {

    	//Vertical Layout
    	panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
    	//Horizontal Layout
    	panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));

    	this.getContentPane().add(panel1,BorderLayout.NORTH);
    	this.getContentPane().add(panel2,BorderLayout.CENTER);

    	//add to the panel
    	panel1.add(basicLabel1);
    	panel1.add(loginButton);
    	panel1.add(anotherLabel1);

    	//add to the panel
    	panel2.add(basicLabel2);
    	panel2.add(helloButton);
    	panel2.add(anotherLabel2);

    	setSize(500,500);
		setVisible(true);

    }//end lab6part1

    public static void main(String args[]){
    	JFrame boxlayout = new Lab6Part1();
    }//end main

}//end class