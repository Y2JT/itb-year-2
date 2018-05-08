import javax.swing.*;
import java.awt.*;

public class Lab3Part1 extends JFrame{

    public Lab3Part1() {

    	Container contentPane = getContentPane();
    	JPanel panel = new JPanel();

    	//create name label and text field
    	JLabel nameLabel = new JLabel("Name: ");
    	JTextField nameField = new JTextField(20);

    	//create password label and password field
    	JLabel passLabel = new JLabel("Password: ");
    	JPasswordField passField = new JPasswordField(20);

    	//create e-mail label and text field
    	JLabel emailLabel = new JLabel("E-Mail: ");
    	JTextField emailField = new JTextField(25);

    	//create join button
    	JButton join = new JButton("Join");

    	//add all labels and buttons to panel
    	panel.add(nameLabel);
    	panel.add(nameField);
    	panel.add(passLabel);
    	panel.add(passField);
    	panel.add(emailLabel);
    	panel.add(emailField);
    	panel.add(join);

    	//add panel to content pane
    	contentPane.add(panel);

    	//set frame details
    	setTitle("Club Sign Up");
    	setSize(350,200);
    	setVisible(true);

    }//end Lab3Part1 method

    public static void main(String args[]){
    	JFrame myFrame = new Lab3Part1();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//end main method

}//end class