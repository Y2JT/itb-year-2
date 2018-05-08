import javax.swing.*;
import java.awt.*;

// *** This program is used for Lab7Part2.java and Lab3Part3.java *** //

public class MyInternalFrame extends JInternalFrame {

	int openFrame = 0;
	int xOffset = 20;
	int yOffset = 40;

	public MyInternalFrame(){

		JInternalFrame myFrame = new JInternalFrame("Internal Frame # " + (++openFrame), true, true, true, true);
		setTitle("Internal Frame");
		setSize(500,500);
		setLocation(xOffset*openFrame, yOffset*openFrame);

	}//end MyInternalFrame

}//end class