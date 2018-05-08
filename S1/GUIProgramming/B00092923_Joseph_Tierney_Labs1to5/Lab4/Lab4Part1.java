import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab4Part1 extends JFrame implements ActionListener {

	//create label
	JLabel helloLabel = new JLabel("Hello");

    public Lab4Part1() {

    	Container contentPane = getContentPane();
    	//create panel
    	JPanel panel = new JPanel();

		//add label to the panel
    	panel.add(helloLabel);

		//create button
    	JButton changeButton = new JButton("Change Label");
    	changeButton.addActionListener(this);
    	//add the button to the panel
    	panel.add(changeButton);

		//add panel to content pane
    	contentPane.add(panel);

		//set frame details
    	setTitle("Hello World");
    	setSize(300,300);
    	setVisible(true);

    }//end Lab4Part1

    public static void main(String args[]){
    	Lab4Part1 change = new Lab4Part1();
    }//end main method

    public void actionPerformed(ActionEvent e) {
    	//set the text in the label when user clicks button
    	helloLabel.setText("Hello World! My listener works!");
	}//end action

}//end class