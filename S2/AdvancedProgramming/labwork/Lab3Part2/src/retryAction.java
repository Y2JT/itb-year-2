/**
 * 
 */
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 22/02/2017
 * 
 */
public class retryAction extends JFrame implements ActionListener{
	
	JButton stringLengthButton;
	JTextField inputField;
	JLabel outputLabel;
	
	public retryAction(){
		Container contentPane = getContentPane();
		GridLayout gridlayout = new GridLayout(4,4);
		contentPane.setLayout(gridlayout);
		
		stringLengthButton = new JButton("Length of String!");
		stringLengthButton.addActionListener(this);
		inputField = new JTextField("");
		outputLabel = new JLabel("String length = ");
		
		//add contents to the content pane
		contentPane.add(inputField);
		contentPane.add(outputLabel);
		contentPane.add(stringLengthButton);
		
		//set frame
		setTitle("Lab3Part2");
		setSize(400,400);
		setVisible(true);
		
	}//end retryAction

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame Lab3Part2 = new retryAction();
	}//end main

	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == stringLengthButton){
			try{
				String userText = inputField.getText();
				
				if(userText.length()>0){
					outputLabel.setText("String length = " + userText.length());
				}
				else{
					userText = null;
					System.out.print(userText.toString());
				}
			}
			catch(NullPointerException e){
				String error = JOptionPane.showInputDialog(null, "ERROR: Please enter characters only!");
				outputLabel.setText("String length = " + error.length());
			}
		}
		
	}//end actionPerformed
}//end class