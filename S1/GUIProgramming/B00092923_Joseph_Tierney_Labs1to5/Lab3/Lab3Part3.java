import javax.swing.*;
import java.awt.*;

public class Lab3Part3 extends JFrame{

    public Lab3Part3() {

    	Container contentPane = getContentPane();
    	//create panel
    	JPanel panel = new JPanel();

    	//populate arrays
    	String cars[] = {"Ford", "Honda", "Ferrari", "Renault"};
    	String artists[] = {"Iron Maiden", "Green Day", "Fozzy", "Jamie Cullum", "U2", "Skillet", "Drake Bell"};

    	//create combo boxes and add the arrays to them
    	JComboBox carCombo = new JComboBox(cars);
    	JComboBox artistCombo = new JComboBox(artists);

    	//make second combo box editable
    	artistCombo.setEditable(true);

    	//add combo boxes to panel
    	panel.add(carCombo);
    	panel.add(artistCombo);

    	//add panel to content pane
    	contentPane.add(panel);

    	//set frame details
    	setTitle("Cars and Artists");
    	setSize(500,300);
    	setVisible(true);

    }//end Lab3Part3 method

    public static void main(String args[]){
    	Lab3Part3 myCombo = new Lab3Part3();
    }//end main method

}//end class