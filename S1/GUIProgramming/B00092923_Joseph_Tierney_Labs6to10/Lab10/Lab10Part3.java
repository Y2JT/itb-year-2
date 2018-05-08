import javax.swing.*;
import java.awt.*;

public class Lab10Part3 extends JFrame {

    public Lab10Part3() {

    	setTitle("Draw Cars");
    	setSize(400,500);
    	setVisible(true);

    }//end Lab10Part3

    public void paint(Graphics g){

    	//car one
    	g.setColor(Color.red);
      	g.fillRect(100,100,190,55);
      	g.fillOval(100,150,50,55);
      	g.fillOval(240,150,50,55);

      	//car two
      	g.setColor(Color.black);
      	g.fillRect(100,300,190,55);
      	g.fillOval(100,350,50,55);
      	g.fillOval(240,350,50,55);

    }//end paint

     public static void main(String args[]){
     	Lab10Part3 cars = new Lab10Part3();
     }//end main

}//end class