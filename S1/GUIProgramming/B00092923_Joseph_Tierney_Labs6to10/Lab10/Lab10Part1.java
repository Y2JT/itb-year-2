import javax.swing.*;
import java.awt.*;

public class Lab10Part1 extends JFrame {

    public Lab10Part1() {

    	setTitle("Draw Initals");
    	setSize(400,400);
    	setVisible(true);

    }//end lab10part1

    public void paint(Graphics g){
    	// J
    	g.drawLine(30,50,150,50);
    	g.drawLine(90,50,90,150);
    	g.drawLine(30,150,90,150);

    	// T
    	g.drawLine(130,150,250,150);
    	g.drawLine(190,150,190,250);
    }//end paint

    public static void main(String args[]){
    	Lab10Part1 initals = new Lab10Part1();
    }//end main

}//end class