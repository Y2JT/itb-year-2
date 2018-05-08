import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//*** This program requires MyInternalFrame.java ***//

public class Lab7Part3 extends JFrame implements ActionListener {

	JDesktopPane myDesktop;
	Font txtFont;

    public Lab7Part3() {

    	//create GUI
		myDesktop = new JDesktopPane();
		setContentPane(myDesktop);
		setJMenuBar(createMenu());

		//make windows draggable
		myDesktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);

		//set window size to fit all 10 frames in
		int inset = 50;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(inset, inset, screenSize.width  - inset*2, screenSize.height - inset*2);

    }//end Lab7Part3

    public JMenuBar createMenu(){

    	JMenuBar myMenu = new JMenuBar();

    	//create the menu
    	JMenu menu = new JMenu("Apps");
    	menu.setMnemonic(KeyEvent.VK_D);
        myMenu.add(menu);

        //create and add first menu item
        JMenuItem appItem = new JMenuItem("Font App");
        appItem.setActionCommand("Font App");
        appItem.addActionListener(this);
        menu.add(appItem);

        //create and add second menu item
        JMenuItem imageItem = new JMenuItem("Image App");
        imageItem.setActionCommand("Image App");
        imageItem.addActionListener(this);
        menu.add(imageItem);

        return myMenu;

    }//end createMenu

    //actionPerformed
    public void actionPerformed(ActionEvent e) {
    	if("Font App".equals(e.getActionCommand())){
    		//display the frame with fonts
    		fontFrame();
    	}//end if
    	else{
    		//display image frame
    		imageFrame();
    	}//end else
    }//end actionPerformed

    //create the frames using an internal frame
    public void fontFrame(){
    	//set up frame
    	MyInternalFrame iFrame = new MyInternalFrame();
    	iFrame.setVisible(true);
    	myDesktop.add(iFrame);

    	JPanel myPanel = new JPanel();
    	JLabel fontLabel1 = new JLabel();
    	fontLabel1.setText("Font is set to Italics");
    	txtFont = new Font("Times New Roman", Font.ITALIC, 32);
    	fontLabel1.setFont(txtFont);

    	JLabel fontLabel2 = new JLabel();
    	fontLabel2.setText("Font is set to Bold");
    	txtFont = new Font("Serif", Font.BOLD, 32);
    	fontLabel2.setFont(txtFont);

    	//add panel to the frame
    	iFrame.add(myPanel);
    	//add labels to the panel
    	myPanel.add(fontLabel1);
    	myPanel.add(fontLabel2);

    	 try {
            iFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}

    }//end fontFrame

    public void imageFrame() {
    	//set up frame
    	MyInternalFrame iFrame2 = new MyInternalFrame();
    	iFrame2.setVisible(true);
    	myDesktop.add(iFrame2);

    	//create Icon
    	Icon listIcon = new ImageIcon("images/thelist.jpg");

    	JLabel imageLabel = new JLabel();
    	imageLabel.setIcon(listIcon);
    	iFrame2.add(imageLabel);

    	try {
		            iFrame2.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}

    }//end imageFrame

    public static void createShowGUI() {
    	//create and set up window
    	Lab7Part3 myFrame = new Lab7Part3();
    	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	//display
    	myFrame.setVisible(true);
    }//end createShowGUI

    public static void main(String args[]){
    	javax.swing.SwingUtilities.invokeLater(new Runnable(){
    		public void run(){
    			createShowGUI();
    		}//end run
    	});//end javax.swing
    }//end main

}//end class