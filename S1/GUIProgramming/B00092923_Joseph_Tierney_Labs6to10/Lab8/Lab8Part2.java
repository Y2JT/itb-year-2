import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Lab8Part2 extends JFrame implements ActionListener {

	JPanel myPanel = new JPanel();
	JButton colourButton = new JButton("Change text colour");
	JLabel colourFontLabel;
	Font txtFont;

    public Lab8Part2() {
    	Container contentPane = getContentPane();
    	contentPane.add(myPanel);
    	contentPane.add(colourButton,BorderLayout.SOUTH);

		//create label and font
    	colourFontLabel = new JLabel();
    	colourFontLabel.setText("This text will change colour");
    	txtFont = new Font("Times New Roman",Font.BOLD, 40);
    	//set font
    	colourFontLabel.setFont(txtFont);
    	//add label to panel
    	myPanel.add(colourFontLabel);

    	colourButton.addActionListener(this);

    	//set up frame
    	setTitle("Lab8Part2");
    	setSize(600,600);
    	setVisible(true);

    }//end Lab8Part2

    public void actionPerformed(ActionEvent e){
    	Color pickColour = (new JColorChooser()).showDialog(colourFontLabel,"Choose colour", Color.BLACK);
    	colourFontLabel.setForeground(pickColour);
    }//end actionPerformed

    public static void main(String args[]){
    	Lab8Part2 colours = new Lab8Part2();
    }//end main

}//end class