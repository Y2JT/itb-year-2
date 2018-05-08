import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class Lab8Part1 extends JPanel implements ActionListener {

	String newline = "\n";
	JButton loadButton;
	JLabel myLabel;
	JFileChooser fileChs;

    public Lab8Part1() {

    	super(new BorderLayout());

    	//create label panel
    	JPanel labelPanel = new JPanel();
    	myLabel = new JLabel();
    	//set text
    	myLabel.setText("File name will appear here");
    	//add to panel
    	labelPanel.add(myLabel);
    	add(labelPanel, BorderLayout.CENTER);

    	//create file chooser
    	fileChs = new JFileChooser();
    	fileChs.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

    	//create load button
    	loadButton = new JButton("Load file");
    	loadButton.addActionListener(this);

    	//create a panel for the button
    	JPanel buttonPanel = new JPanel();
    	buttonPanel.add(loadButton);

    	add(buttonPanel, BorderLayout.PAGE_START);

    }//end Lab8Part1

    public void actionPerformed(ActionEvent e){
    	//open button
    	if(e.getSource() == loadButton){
    		int value = fileChs.showOpenDialog(Lab8Part1.this);
    		if(value == JFileChooser.APPROVE_OPTION){
    			File file = fileChs.getSelectedFile();
    			myLabel.setText("Opening: " + file.getName());
    		}//end inner if
    		else{
    			myLabel.setText("Action cancelled");
    		}//end else
    	}//end if
    }//end actionPerformed

    //create and show GUI
    public static void createShowGUI(){
    	//create and set up window
    	JFrame myFrame = new JFrame("Lab8Part1");
    	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	//set up content pane
    	JComponent newContentPane = new Lab8Part1();
    	newContentPane.setOpaque(true);
    	myFrame.setContentPane(newContentPane);

    	//Display window
    	myFrame.pack();
    	myFrame.setVisible(true);
    	myFrame.setSize(600,600);

    }//end createShowGUI

    public static void main(String args[]){
    	javax.swing.SwingUtilities.invokeLater(new Runnable(){
    		public void run(){
    			createShowGUI();
    		}//end run
    	});//end javax.swing
    }//end main

}//end class