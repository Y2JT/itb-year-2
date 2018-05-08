import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab10Part4 extends JFrame {

    public Lab10Part4() {
    	setTitle("Lab10Part4");
    	setSize(300,300);
    	setVisible(true);
    }//end lab10part4

    public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.white);
		//draw Snowman's head
    	g.fillOval(130, 70, 60, 60);
    	//draw Snowman's body
    	g.fillOval(115, 105, 90, 70);
    	//draw Snowman's leg things
	    g.fillOval(100, 150, 120, 80);

	    g.setColor(Color.black);
	    //draw Snowman's eyes
	    g.fillOval(145, 80, 10, 10);
	    g.fillOval(165, 80, 10, 10);
	    //draw Snowman's mouth
	    g.drawArc(140, 80, 40, 30, 190, 160);
	    //draw Snowman's arms
	    g.drawLine(125, 125, 90, 70);
	    g.drawLine(200, 125, 105, 110);
    }//end paint

    public static void main(String args[]){
    	Lab10Part4 snowman = new Lab10Part4();
    }//end main method

}//end class