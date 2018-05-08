import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Lab6Part3 extends JFrame implements ChangeListener {

	JPanel volPanel = new JPanel();
	JPanel bassPanel = new JPanel();
	//create volume and bass labels
	JLabel volumeLabel = new JLabel("Volume");
	JLabel bassLabel = new JLabel("Bass");
	//create JSlider for volume and bass
	JSlider volSlider = new JSlider();
	JSlider bassSlider = new JSlider();

    public Lab6Part3() {

    	Container contentPane = getContentPane();

    	//set max and min values for volSlider and bassSlider
		volSlider.setMaximum(30);
		volSlider.setMinimum(0);

		bassSlider.setMaximum(10);
		bassSlider.setMinimum(-10);

		//add listener
		volSlider.addChangeListener(this);
		bassSlider.addChangeListener(this);

		volPanel.add(volSlider);
		volPanel.add(volumeLabel);

		bassPanel.add(bassSlider);
		bassPanel.add(bassLabel);

		//add both panels to the content pane
		contentPane.add(volPanel, BorderLayout.NORTH);
		contentPane.add(bassPanel, BorderLayout.SOUTH);

		setSize(300,200);
		setVisible(true);
    }//end lab6part3

    public static void main(String args[]){
    	new Lab6Part3();
    }//end main

    public void stateChanged(ChangeEvent e){
    	volumeLabel.setText("Set: " + volSlider.getValue());
    	bassLabel.setText("Set: " + bassSlider.getValue());
    }//end changeevent

}//end class