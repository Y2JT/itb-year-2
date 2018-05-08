import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lab9Part1 implements ActionListener {

	JFrame myFrame = null;

    public Lab9Part1() {
    	myFrame = new JFrame("Surname will appear here");
    	Container contentPane = myFrame.getContentPane();
    	JButton myButton = new JButton("Launch Input Dialog");
    	myButton.addActionListener(this);
    	contentPane.add(myButton);
    	myFrame.pack();
    	myFrame.setVisible(true);
    	myFrame.setSize(400,200);
    }//end Lab9Part1

    public void actionPerformed(ActionEvent e){
    	int messageType = JOptionPane.INFORMATION_MESSAGE;
    	String answer = JOptionPane.showInputDialog(myFrame, "What's your surname?", "Input Dialog Box", messageType);
    	myFrame.setTitle(answer);
    }//end actionPerformed

    public static void main(String args[]){
    	Lab9Part1 input = new Lab9Part1();
    }//end main

}//end class