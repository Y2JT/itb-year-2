import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lab4Part3 extends JFrame implements ListSelectionListener{

	//create JList
	JList<String> subjects;
	//create array of subjects
	String[] choice = new String[] {"GUI","Maths","OOAD","LAN Switching","Databases","Web Development","Operating Systems","WAN","Multimedia","Business"};
	//create a text area
	JTextArea ta = new JTextArea();

	public Lab4Part3() {

		Container contentPane = getContentPane();

		//add the array of subjects to the JList
		subjects = new JList<String>(choice);
		subjects.addListSelectionListener(this);

		//add label to the panel
		JPanel panel1 = new JPanel();
		JLabel topLabel = new JLabel("Please select your favourite subjects so far!");
		panel1.add(topLabel);

		//add list to panel
		JPanel panel2 = new JPanel();
		panel2.add(subjects);

		//add text area to panel
		JPanel panel3 = new JPanel();
		ta.setText("Response will appear here");
		panel3.add(ta);

		//add panels to frame, set them to NORTH, CENTER and SOUTH
		contentPane.add(panel1, BorderLayout.NORTH);
		contentPane.add(panel2, BorderLayout.CENTER);
		contentPane.add(panel3, BorderLayout.SOUTH);

		//set frame details
		setTitle("Subjects");
		setSize(500,300);
		setVisible(true);

	}//end Lab4Part3

	public void valueChanged(ListSelectionEvent e) {
		//set the text area to the selected value
		ta.setText((subjects.getSelectedValue().toString()));
	}//end List Event

	public static void main(String args[]){
		Lab4Part3 favSubjects = new Lab4Part3();
	}//end main method

}//end class