import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lab9Part3 extends JFrame implements ActionListener {

	JFrame myFrame;
	JMenuBar myMenu;
	String subjects[] = {"GUI","Networks","OOAD"};

    public Lab9Part3() {

    	myMenu = new JMenuBar();
		Container contentPane = getContentPane();
		//add menu items
		JMenuItem favSubs = new JMenuItem("Subject Choice");
		//add menu items to menu
		myMenu.add(favSubs);
		//add menu items to the action listener
		favSubs.addActionListener(this);

		//add menu contents
		myMenu.add(favSubs);

		//set menu display
		setJMenuBar(myMenu);
    	setTitle("Lab9Part3");
    	setSize(300,300);
    	setVisible(true);

    }//end Lab9Part3

    public void actionPerformed(ActionEvent e){
    	if(e.getActionCommand().equals("Subject Choice")){
    		Object[] subject = {"GUI","Networks","OOAD"};
    		int n = JOptionPane.showOptionDialog(myFrame, "Choose your favourite subject so far!", "Subjects",
    		JOptionPane.YES_NO_OPTION,
    		JOptionPane.QUESTION_MESSAGE,
    		null,
    		subject,
    		subjects[0]);
    		if(n == JOptionPane.YES_OPTION){
    			JOptionPane.showMessageDialog(myFrame,
			                                    "You selected GUI",
			                                    "subjects",
			                                    JOptionPane.INFORMATION_MESSAGE
                                    );
    		}
    		else if(n == JOptionPane.NO_OPTION){
    			JOptionPane.showMessageDialog(myFrame,
			                                    "You selected Networks",
			                                    "subjects",
			                                    JOptionPane.INFORMATION_MESSAGE
                                    );
    		}
    		else{
    			JOptionPane.showMessageDialog(myFrame,
			                                    "You selected OOAD",
			                                    "subjects",
			                                    JOptionPane.INFORMATION_MESSAGE
                                    );
    		}
    	}
    }//end actionPerformed

    public static void main(String args[]){
    	Lab9Part3 frame = new Lab9Part3();
    }


}//end class