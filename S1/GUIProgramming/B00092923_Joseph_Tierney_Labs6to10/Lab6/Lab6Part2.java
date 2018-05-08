import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab6Part2 extends JFrame implements ActionListener{

	JPanel panelCont = new JPanel();
	JPanel panel1 = buildPanel1();
	JPanel panel2 = buildPanel2();

	JButton comboButton;
	JButton listButton;

    public Lab6Part2(){
    	panelCont.setLayout(new CardLayout());

		panelCont.add(panel1);
		panelCont.add(panel2);

		getContentPane().add(panelCont);

		setSize(300,300);
		setVisible(true);
    }//end lab6part2

    public void actionPerformed(ActionEvent e) {
		//Get the card layout from the main panel
		CardLayout card = (CardLayout)panelCont.getLayout();

		//Move to the next card in the card layout
		card.next(panelCont);

	}//end actionPerformed

    public JPanel buildPanel1(){
    	JPanel panel = null;
    	panel = new JPanel();
		//create the city choices array for the JList
    	String[] cityChoices = {"Dublin", "Berlin", "Las Vegas"};
    	JList<String> cityList= new JList<String>(cityChoices);

		//create button to swtich between cards and add listener
    	comboButton = new JButton("Switch to Combo Box");
    	comboButton.addActionListener(this);

    	panel.add(cityList);
    	panel.add(comboButton);
    	return panel;
    }//end buildPanel1

    public JPanel buildPanel2(){
    	//set the panel to null
    	JPanel panel;// = null;
    	//create a new panel
    	panel = new JPanel();

    	JButton listButton = new JButton("Switch to JList");
    	listButton.addActionListener(this);

    	String[] cityChoices = {"Dublin", "Berlin", "Las Vegas"};
    	JComboBox<String> cityCombo = new JComboBox<String>(cityChoices);

        //add combobox to the panel
    	panel.add(cityCombo);
    	panel.add(listButton);
    	//return the panel
		return panel;
    }//end buildPanel2

    public static void main(String args[]){
		new Lab6Part2();
	}//end main

}//end class