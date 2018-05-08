import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class Lab8Part3 extends JFrame implements MouseInputListener {

	JPanel myPanel;
	JLabel myLabel;

    public Lab8Part3() {

    	Container contentPane = getContentPane();
    	myPanel = new JPanel();
    	contentPane.add(myPanel, BorderLayout.CENTER);

    	myLabel = new JLabel("default");
    	contentPane.add(myLabel, BorderLayout.SOUTH);

    	setSize(800,400);
		setVisible(true);

		myPanel.addMouseListener(this);
		myPanel.addMouseMotionListener(this);

    }//end Lab8Part3

    public void mouseClicked(MouseEvent e){
    	myLabel.setText("Mouse Click Event");
    }//end click

    public void mouseEntered(MouseEvent e){
    	myLabel.setText("Mouse Entered Event");
    }//end enter

    public void mouseExited(MouseEvent e){
    	myLabel.setText("Mouse Exit Event");
    }//end exit

    public void mousePressed(MouseEvent e){
    	myLabel.setText("Mouse Pressed Event");
    }//end pressed

    public void mouseReleased(MouseEvent e){
    	myLabel.setText("Mouse Released Event");
    }//end released

    public void mouseDragged(MouseEvent e){
    	myLabel.setText("Mouse Dragged Event");
    }//end dragged

    public void mouseMoved(MouseEvent e){
    	myLabel.setText("Mouse Move " + e.getX() + " " + e.getY() + "\n" + " \nTop " + e.getXOnScreen() + " " + e.getYOnScreen());
    }//end moved

    public static void main(String args[]){
    	Lab8Part3 mouse = new Lab8Part3();
    }//end main

}//end class