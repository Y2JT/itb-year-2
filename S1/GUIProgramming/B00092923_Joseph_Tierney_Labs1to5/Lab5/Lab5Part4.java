import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab5Part4 extends JFrame implements ActionListener {

	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();

	//set balance
	int curBal = 400;

	//create and set labels
	JLabel balance = new JLabel("Current Balance: €" + curBal + ".00");
	JLabel message = new JLabel();
	JLabel header = new JLabel();

	//create text area and scroll
	JTextArea ta = new JTextArea(10,22);
	JScrollPane myPane = new JScrollPane(ta);

    public Lab5Part4() {

    	JMenuBar menu = new JMenuBar();
    	Container contentPane = getContentPane();
    	JMenu atm = new JMenu("ATM");
    	contentPane.setLayout(new GridLayout(3,3));

		//add menu items
		JMenuItem withdrawItem = new JMenuItem("Withdraw");
		JMenuItem lodgeItem = new JMenuItem("Lodgement");
		JMenuItem stateItem = new JMenuItem("Statement");

		//add menu items to menu
		atm.add(withdrawItem);
		atm.add(lodgeItem);
		atm.add(stateItem);

		//add listeners to menu items
		withdrawItem.addActionListener(this);
		lodgeItem.addActionListener(this);
		stateItem.addActionListener(this);

		//add shortcuts
		stateItem.setMnemonic('S');

		//create panel for label
		JPanel panel = new JPanel();
		panel.add(balance);

		//create panels for butons
		JPanel buttonPanel1 = new JPanel();
		JPanel buttonPanel2 = new JPanel();

		//create first set of buttons and add them to panel 1
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setActionCommand("Withdraw");
		btnWithdraw.addActionListener(this);
		buttonPanel1.add(btnWithdraw);

		JButton btnLodge = new JButton("Lodgement");
		btnLodge.setActionCommand("Lodgement");
		btnLodge.addActionListener(this);
		buttonPanel1.add(btnLodge);

		JButton btnPIN = new JButton("Change PIN");
		buttonPanel1.add(btnPIN);

		//create second set of buttons and add them to panel 2
		JButton btnState = new JButton("Statement");
		btnState.setActionCommand("Statement");
		btnState.addActionListener(this);
		buttonPanel2.add(btnState);

		JButton btnCheque = new JButton("Cheque Book");
		buttonPanel2.add(btnCheque);

		JButton btnPrint = new JButton("Print Reciept");
		buttonPanel2.add(btnPrint);

		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);

		//add menu contents
		menu.add(atm);
		//add labels to the panel
		panel.add(balance);
		panel.add(header);
		panel.add(message);
		//add panels to the content pane
		contentPane.add(panel, BorderLayout.NORTH);
		contentPane.add(panel2, BorderLayout.SOUTH);
		contentPane.add(buttonPanel1, BorderLayout.CENTER);
		contentPane.add(buttonPanel2, BorderLayout.CENTER);

		//set menu display
		setJMenuBar(menu);
    	setTitle("ATM");
    	setSize(600,600);
    	setVisible(true);
    }//end Lab5Part4

    public void actionPerformed(ActionEvent e){
    	//if the user clicks withdraw
    	if(e.getActionCommand().equals("Withdraw")){
    		balance.setText("Current Balance: €" + (curBal - 50) + ".00");
    		curBal = (curBal - 50);
    		//if the current balance is less than 0
    		if(curBal <= 0){
    			balance.setText("Insufficent Funds");
				curBal = 0;
    		}//end inner if
    	}//end if

    	//if the user clicks Lodgement
    	if(e.getActionCommand().equals("Lodgement")){
    		balance.setText("Current Balance: €" + (curBal + 100) + ".00");
    		curBal = (curBal + 100);
    	}//end if

    	//if the user clicks Statement
    	if(e.getActionCommand().equals("Statement")){
    		header.setText("Date: 17/10/2016 \t Transaction: NETFLIX \t Out: 8.99");
    		panel2.add(ta, BorderLayout.SOUTH);
			JScrollPane myPane = new JScrollPane(ta);
			panel.add(myPane);
    	}//end if

    }//end action

    public static void main(String args[]){
    	Lab5Part4 atmMenu = new Lab5Part4();
    }//end main method
}//end class