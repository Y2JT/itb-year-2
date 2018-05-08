import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab3Part4 extends JFrame{

    public Lab3Part4() {

    	Container contentPane = getContentPane();
    	//create panel
    	JPanel panel1 = new JPanel();

		//create label to welcome user, and add label to the panel
    	JLabel welcome = new JLabel("WELCOME, Please Select An Option");
    	panel1.add(welcome);

		//create button panels
    	JPanel buttonPanel = new JPanel();
    	JPanel buttonPanel2 = new JPanel();
    	//set the layout of the content pane to a GridLayout
    	contentPane.setLayout(new GridLayout(3,3));

		//create first set of buttons and add them to the first button panel
    	JButton wButton = new JButton("Withdraw");
    	buttonPanel.add(wButton);

    	JButton bButton = new JButton("Balance");
    	buttonPanel.add(bButton);

    	JButton cButton = new JButton("Change PIN");
    	buttonPanel.add(cButton);

		//create second set of buttons and add them to the second panel
    	JButton sButton = new JButton("Statements");
    	buttonPanel2.add(sButton);

    	JButton cbButton = new JButton("Cheque Book");
    	buttonPanel2.add(cbButton);

    	JButton pButton = new JButton("Print Reciept");
    	buttonPanel2.add(pButton);

    	//add panels to content pane
    	contentPane.add(panel1);
    	contentPane.add(buttonPanel);
    	contentPane.add(buttonPanel2);

		//set frame details
    	setTitle("ATM");
    	setSize(200,300);
    	setVisible(true);

    }//end Lab3Part4 method

    public static void main(String args[]){
    	Lab3Part4 window = new Lab3Part4();
        window.setSize(330,300);
        window.pack();
        window.setVisible(true);
    }//end main method

}//end class