import javax.swing.*;
import java.awt.*;

public class Lab7Part1 extends JFrame {

    public Lab7Part1() {

    	JPanel panel = new JPanel();
    	JLabel label = new JLabel("Internal Frame Label");
    	JButton button = new JButton("Internal Frame Button");

    	JDesktopPane desktop = new JDesktopPane();
    	JInternalFrame innerframe = new JInternalFrame("Internal Window", true, true, true, true);

		//set frame
    	innerframe.setSize(300,300);
		innerframe.setVisible(true);
		//add the frame to the desktop
        desktop.add(innerframe);
        //add the panel to the frame
        innerframe.add(panel);

        //add label to panel
        panel.add(label);
        //add button to panel
        panel.add(button);

        //add items to desktop
        setContentPane(desktop);
        //set frame
        setTitle("Lab7Part1 - B00092923");
        setSize(640,480);
        setVisible(true);
    }//end Lab7Part1

    public static void main(String args[]){
    	Lab7Part1 InternalFrame = new Lab7Part1();
    }//end main

}//end class