import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab4Part4 extends JFrame implements ActionListener {

	//set current balance to 20
	int curBal = 20;
	//create label for current balance
	JLabel balance = new JLabel("Current Balance: €" + curBal + ".00");

	public Lab4Part4() {

		Container contentPane = getContentPane();

		//create panel
		JPanel panel = new JPanel();
		//add the balance label to the panel
		panel.add(balance);

		//create a second panel
		JPanel panel2 = new JPanel();
		//create a Call button
		JButton callButton = new JButton("Call");
		callButton.setActionCommand("callButton");
		callButton.addActionListener(this);
		//add button to the second panel
		panel2.add(callButton);

		//create a Top Up button
		JButton topupButton = new JButton("Top Up");
		topupButton.setActionCommand("topupButton");
		topupButton.addActionListener(this);
		//add button to the second panel
		panel2.add(topupButton);

		//create a Text button
		JButton textButton = new JButton("Text");
		textButton.setActionCommand("textButton");
		textButton.addActionListener(this);
		//add button to the panel
		panel2.add(textButton);

		//add both panels to the content pane
		contentPane.add(panel, BorderLayout.NORTH);
		contentPane.add(panel2, BorderLayout.CENTER);

		//set frame details
    	setTitle("iPhone");
    	setSize(300,300);
    	setVisible(true);

	}//end Lab4Part4

	public static void main(String args[]){
    	Lab4Part4 phone = new Lab4Part4();
    }//end main method

	public void actionPerformed(ActionEvent e){
		//if the user selects the call button
		if(e.getActionCommand().equals("callButton")){
			//update the label text, taking away 2 from the current balance
			balance.setText("Current Balance: €" + (curBal - 2) + ".00");
			curBal = (curBal - 2);
			//if the current balance is less than or equal 0
			if(curBal <= 0){
				balance.setText("Insufficent Funds");
				//set balance to 0
				curBal = 0;
			}//end inner if
        }//end if

        //if the user selects the top up button
        if(e.getActionCommand().equals("topupButton")){
        	//update the label text, adding 5 to the current balance
            balance.setText("Current Balance: €" + (curBal + 5) + ".00");
            curBal = (curBal + 5);
        }//end if

        //if the user selects the text button
        if(e.getActionCommand().equals("textButton")){
        	//update the label text, taking away 1 from the current balance
            balance.setText("Current Balance: €" + (curBal - 1) + ".00");
            curBal = (curBal - 1);
            //if the current balance is less than or equal to 0
            if(curBal <= 0){
				balance.setText("Insufficent Funds");
				//set balance to 0
				curBal = 0;
			}//end inner if
        }//end if

	}//end action performed

}//end class