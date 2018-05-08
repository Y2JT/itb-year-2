import javax.swing.*;
import java.awt.*;

//*** This program requires MyInternalFrame.java ***//

public class Lab7Part2 extends JFrame {

	JDesktopPane myDesktop;

    public Lab7Part2() {
		//create GUI
		myDesktop = new JDesktopPane();
		//create a frame/window
		createiFrame();
		setContentPane(myDesktop);

		//make windows draggable
		myDesktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);

		//set window size to fit all 10 frames in
		int inset = 50;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(inset, inset, screenSize.width  - inset*2, screenSize.height - inset*2);
    }//end Lab7Part2

    public void createiFrame(){
		//for loop to print out 10 windows
		for(int i = 1; i<=10; i++){
			MyInternalFrame myFrame = new MyInternalFrame();
			myFrame.setVisible(true);
			myDesktop.add(myFrame);
		}//end for loop
	}//end createiFrame

	private static void createShowGUI(){
		//create and set up window
		Lab7Part2 myFrame = new Lab7Part2();
		//end program on exit
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//make frames visible
		myFrame.setTitle("Lab7Part2 - B00092923");
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