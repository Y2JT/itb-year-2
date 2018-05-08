package numbersAndStrings;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 01/02/2017
 * 
 */
public class StringNumberConversionFrame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	public JTextField numField;
	public JTextField stringField;
	public int input;
	
	public StringNumberConversionFrame(){
		Container contentPane = getContentPane();;
		GridLayout gridlayout = new GridLayout(4,4);
		contentPane.setLayout(gridlayout);
		
		JLabel numLabel = new JLabel("Enter an Integer to convert to String: ");
		numField = new JTextField("");
		
		JLabel stringLabel = new JLabel("The text version of the number entered is: ");
		stringField = new JTextField("");
		
		JButton convertButton = new JButton("Convert");
		convertButton.addActionListener(this);
		
		//add contents to content pane
		contentPane.add(numLabel);
		contentPane.add(numField);
		contentPane.add(stringLabel);
		contentPane.add(stringField);
		contentPane.add(convertButton);
		
		//set frame
		setTitle("Lab1Part4");
		setSize(500,200);
		setVisible(true);
	}//end StringNumberConversionFrame

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new StringNumberConversionFrame();
	}//end main

	public void actionPerformed(ActionEvent arg0) {
		input = Integer.parseInt(numField.getText());
		String result = NumberToStringConverter.convertNo(input);
		stringField.setText(result);
	}//end actionPerformed

}//end class