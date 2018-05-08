import javax.swing.*;
import java.awt.*;

public class Lab2Part2 extends JFrame{
	public Lab2Part2(){

		Container contentPane = getContentPane();
		//create panel
		JPanel panel = new JPanel();

		//create JLabel
		JLabel nameLabel = new JLabel ("Joseph Tierney");
		//add label to panel
		panel.add(nameLabel);

		//create 2nd JLabel
		JLabel hometownLabel = new JLabel ("Dublin");
		//add label to panel
		panel.add(hometownLabel);

		//add to the content pane
		contentPane.add(panel);

		//set frame details
		setTitle("Frame With Labels");
		setSize(500,300);
		setVisible(true);

	}//end Lab2Part2

	public static void main(String args[]){
		JFrame myFrame = new Lab2Part2();

	}//end main

}//end class
