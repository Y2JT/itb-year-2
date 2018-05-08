import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab4Part2 extends JFrame implements ActionListener {

	//create array of colours
	String[] colours = new String[] {"Blue", "Red", "Green"};
	//create combo box
	JComboBox<String> colourSelector;
	//create panel
	JPanel panel = new JPanel();

    public Lab4Part2() {

    	Container contentPane = getContentPane();

		//set the combo box
		colourSelector = new JComboBox<String>(colours);
		//add combo box to the panel
    	panel.add(colourSelector);

		//create button
    	JButton changeButton = new JButton("Change Colour");
    	changeButton.addActionListener(this);
    	//add button to the panel
    	panel.add(changeButton);

		//add panel to the content pane
    	contentPane.add(panel);

		//set frame details
    	setTitle("Change Colour");
    	setSize(500,300);
    	setVisible(true);

    }//end Lab4Part2

    public static void main(String args[]){
    	Lab4Part2 changingColours = new Lab4Part2();
    }//end main method

    public void actionPerformed(ActionEvent e){
    	//if the selected item is blue
    	if(colourSelector.getSelectedItem().toString() == "Blue"){
    		panel.setBackground(Color.BLUE);
    	}//end if

		//if the selected item is red
    	if(colourSelector.getSelectedItem().toString() == "Red"){
    		panel.setBackground(Color.RED);
    	}//end if

		//if the selected item is green
    	if(colourSelector.getSelectedItem().toString() == "Green"){
    		panel.setBackground(Color.GREEN);
    	}//end if

    }//end ActionEvent

}//end class