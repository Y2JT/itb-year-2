import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lab9Part2 extends JFrame implements ActionListener {

	JFrame myFrame;
	JButton myButton;
	//create the country array
	String country[] = {"Ireland","Germany","Canada"};

	//create the icons for the flags
	ImageIcon ireland = new ImageIcon("images/ireland.jpg");
	ImageIcon germany = new ImageIcon("images/germany.jpg");
	ImageIcon canada = new ImageIcon("images/canada.jpg");

    public Lab9Part2() {

    	Container contentPane = getContentPane();

    	JPanel myPanel = new JPanel();
    	//create button
    	myButton = new JButton("Pick a country!");
    	myButton.addActionListener(this);

    	//add button to panel
    	myPanel.add(myButton);
    	//add panel to content pane
    	contentPane.add(myPanel);

		//set frame
    	setVisible(true);
    	setSize(200,100);
    	setTitle("Lab9Part2");

    }//end Lab9Part2

    public void actionPerformed(ActionEvent e){
    	if(e.getSource() == myButton){
    		myFrame = new JFrame();
    		String choice = (String) JOptionPane.showInputDialog(myFrame, "Pick a Country", "Input Dialog", JOptionPane.PLAIN_MESSAGE, null, country, country[0]);
    		//if choice is Ireland
    		if(choice == "Ireland"){
    			//display the Irish flag
    			JOptionPane.showMessageDialog(myFrame, "Ireland's Flag", "International Flags", JOptionPane.INFORMATION_MESSAGE, ireland);
    		}//end choice Ireland
    		//if choice is Germany
    		if(choice == "Germany"){
    			//display the German flag
    			JOptionPane.showMessageDialog(myFrame, "Germany's Flag", "International Flags", JOptionPane.INFORMATION_MESSAGE, germany);
    		}//end choice Germany
    		//if choice is Canada
    		if(choice == "Canada"){
    			//display the Canadian flag
    			JOptionPane.showMessageDialog(myFrame, "Canada's Flag", "International Flags", JOptionPane.INFORMATION_MESSAGE, canada);
    		}//end choice Canada
    	}//end if e.getSource
    }//end actionPerformed

    public static void main(String args[]){
    	Lab9Part2 frame = new Lab9Part2();
    }//end main
}//end class