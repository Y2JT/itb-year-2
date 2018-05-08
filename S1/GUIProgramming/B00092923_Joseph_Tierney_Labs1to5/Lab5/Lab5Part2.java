import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab5Part2 extends JFrame implements ActionListener {

	JPanel panel = new JPanel();

	//create label
	JLabel lblFruit = new JLabel();

	//create icons
	Icon appleIcon = new ImageIcon("images/apple.png");
	Icon orangeIcon = new ImageIcon("images/orange.png");
	Icon pearIcon = new ImageIcon("images/pear.png");

	public Lab5Part2(){

		JMenuBar menu = new JMenuBar();
		Container contentPane = getContentPane();
		JMenu fruit = new JMenu("Fruit");

		//add menu items
		JMenuItem appleItem = new JMenuItem("Apple");
		JMenuItem orangeItem = new JMenuItem("Orange");
		JMenuItem pearItem = new JMenuItem("Pear");
		//add menu items to menu

		fruit.add(appleItem);
		fruit.add(orangeItem);
		fruit.add(pearItem);

		//add menu items to the action listener
		appleItem.addActionListener(this);
		orangeItem.addActionListener(this);
		pearItem.addActionListener(this);

		//add menu contents
		menu.add(fruit);
		panel.add(lblFruit);
		contentPane.add(panel);

		//set menu display
		setJMenuBar(menu);
    	setTitle("Fruit");
    	setSize(300,300);
    	setVisible(true);

	}//end Lab5Part2

	public void actionPerformed(ActionEvent e){
		//if the user selects Apple
		if(e.getActionCommand().equals("Apple")){
			//create appleIcon
			appleIcon = new ImageIcon("images/apple.png");
			//set the icon to the label for display
			lblFruit.setIcon(appleIcon);
		}//end if

		//if the user selects Orange
		if(e.getActionCommand().equals("Orange")){
			//create orangeIcon
			orangeIcon = new ImageIcon("images/orange.png");
			//set the icon to the label for display
			lblFruit.setIcon(orangeIcon);
		}//end if

		//if the user selects Pear
		if(e.getActionCommand().equals("Pear")){
			//create pearIcon
			pearIcon = new ImageIcon("images/pear.png");
			//set the icon to the label for display
			lblFruit.setIcon(pearIcon);
		}//end if
	}//end action

	public static void main(String args[]){
		Lab5Part2 fruitMenu = new Lab5Part2();
	}//end main method
}//end class