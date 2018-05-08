import javax.swing.*;
import java.awt.*;

public class Lab10Part2 extends JFrame {

    public Lab10Part2() {

    	setTitle("Circle Pattern");
    	setSize(500,500);
    	setVisible(true);
    }//end lab10part2

    public void paint(Graphics g){
    	g.drawOval(150,150,100,100);
    	g.drawOval(100,180,100,100);
    	g.drawOval(90,240,100,100);
    	g.drawOval(90,290,100,100);
    	g.drawOval(130,330,100,100);
    	g.drawOval(200,330,100,100);
    	g.drawOval(250,290,100,100);
    	g.drawOval(270,240,100,100);
    	g.drawOval(250,200,100,100);
    	g.drawOval(220,150,100,100);
    }//end paint

    public static void main(String args[]){
    	Lab10Part2 circles = new Lab10Part2();
    }//end main

}//end class