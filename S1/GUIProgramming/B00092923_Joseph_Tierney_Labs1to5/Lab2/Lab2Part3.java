import javax.swing.*;
import java.awt.*;

public class Lab2Part3 extends JFrame{
	public Lab2Part3(){

		Container contentPane = getContentPane();
		//create panel
		JPanel loginPanel = new JPanel();

		//create login label and add to the panel
		JLabel loginLabel = new JLabel ("Login");
		loginPanel.add(loginLabel);

		//create login button and add to the panel
		JButton loginButton = new JButton ("Login");
		loginPanel.add(loginButton);

		//add panel to content pane
		contentPane.add(loginPanel);

		//set frame details
		setTitle("Login");
		setSize(500, 300);
		setVisible(true);

	}//end Lab2Part3

	public static void main(String args[]){
		JFrame myFrame = new Lab2Part3();
	}//end main method

}//end class