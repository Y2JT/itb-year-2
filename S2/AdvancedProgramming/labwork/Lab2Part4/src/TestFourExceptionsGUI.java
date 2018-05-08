/**
 * 
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;
/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 08/02/2017
 * 
 */
public class TestFourExceptionsGUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	public JButton NullButton;
	public JButton MalButton;
	public JButton IOButton;
	public JButton ExButton;
	
	public TestFourExceptionsGUI(){
		Container contentPane = getContentPane();
		GridLayout gridlayout = new GridLayout(4,4);
		contentPane.setLayout(gridlayout);
		
		//set NullButton and add ActionListener
		NullButton = new JButton("Test Null Pointer Exception");
		NullButton.addActionListener(this);
		//set MalButton and add ActionListener
		MalButton = new JButton("Test URL Exception");
		MalButton.addActionListener(this);
		//set IOButton and add ActionListener
		IOButton = new JButton("Test IO Exception");
		IOButton.addActionListener(this);
		//set ExButton and add ActionListener
		ExButton = new JButton("Test General Exception");
		ExButton.addActionListener(this);
		
		//add buttons to content pane
		contentPane.add(NullButton);
		contentPane.add(MalButton);
		contentPane.add(IOButton);
		contentPane.add(ExButton);
		
		//set frame
		setTitle("Lab2Part4");
		setSize(300,200);
		setVisible(true);
	}//end TestFourExceptionsGUI
	
	public String testException(String string, String filename, String url, boolean generalExceptionActivated){
		String str = "Hi";
		try{
			str.toCharArray(); //Null string potential error
			new FileReader(filename); //Unknown filename potential error
			new URL(url); //Badly written URL potential error
			if(generalExceptionActivated) { //Potential error 
			this.clone(); //Will be caught as a general error!
			}
		}
		catch (MalformedURLException e){
			JOptionPane.showMessageDialog(null, "A URL has been badly written" + e.getMessage());
		}
		catch (IOException e){
			JOptionPane.showMessageDialog(null, "An IO Exception has been caught" + e.getMessage());
		}
		catch (NullPointerException e){
			JOptionPane.showMessageDialog(null, "A Null Pointer  Exception has been caught" + e.getMessage());
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Some general unidentified  Exception has been caught" + e.getMessage());
		}
		finally{
			System.out.print("The finally block has been called");
		}

		return url;		
	}//end testException
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame Lab2Part4 = new TestFourExceptionsGUI();
	}//end main

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== NullButton){
			testException(null, "Real.txt", "http://www.itb.ie", false);
		}//end NullButton if
		if(e.getSource()==MalButton){
			testException("Hi", "Real.txt", "ht//www.itb.ie", false);
		}//end MalButton if
		if(e.getSource()==IOButton){
			testException("Hi", "Whatever.txt", "http://www.itb.ie", false);
		}//end IOButton if
		if(e.getSource()==ExButton){
			testException("Hi", "Real.txt", "http://www.itb.ie", true);
		}//end ExButton if
		
	}//end actionPerformed

}//end class