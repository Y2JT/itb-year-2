import javax.swing.*;
import java.awt.*;

public class Lab2Part4 extends JFrame{
	public Lab2Part4(){

		Container contentPane = getContentPane();
		//create panel
		JPanel picPanel = new JPanel();

		//**** FIRST IMAGE **** //
		//create label and add to the panel
		JLabel pattonNameLabel = new JLabel("Patton");
		picPanel.add(pattonNameLabel);

		//create icon and a label for the icon, add the label to the panel
		Icon dogIcon = new ImageIcon ("patton.jpg");
		JLabel dogLabel = new JLabel (dogIcon);
		picPanel.add(dogLabel);

		//create a text area and add to the panel
		JTextField tf = new JTextField();
		picPanel.add(tf);
		tf.setText("This is my dog Patton");

		//**** SECOND IMAGE **** //
		//create label and add to the panel
		JLabel rommelNameLabel = new JLabel("Rommel");
		picPanel.add(rommelNameLabel);

		//create icon and a label for the icon, add the label to the panel
		Icon dog2Icon = new ImageIcon ("rommel.jpg");
		JLabel dog2Label = new JLabel(dog2Icon);
		picPanel.add(dog2Label);

		//create a text area and add to the panel
		JTextField tf2 = new JTextField();
		tf2.setText("This is Rommel");
		picPanel.add(tf2);

		//**** THIRD IMAGE ****//
		//create label and add to the panel
		JLabel bikeLabel = new JLabel("Motorcycle");
		picPanel.add(bikeLabel);

		//create icon and a label for the icon, add the label to the panel
		Icon bikeIcon = new ImageIcon("bike.jpg");
		JLabel bike2Label = new JLabel(bikeIcon);
		picPanel.add(bike2Label);

		//create a text area and add to the panel
		JTextField tf3 = new JTextField();
		tf3.setText("This is my bike");
		picPanel.add(tf3);

		//add the panel to content pane
		contentPane.add(picPanel);

		//set frame details
		setSize(400,900);
		setTitle("My Pics");
		setVisible(true);

	}//end Lab2Part4

	public static void main(String args[]){
		JFrame myFrame = new Lab2Part4();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end main

}//end class