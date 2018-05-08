import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 03/03/2017
 * 
 */
public class ButtonTranslator extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ResourceBundle res;
	
	public JButton OneButton;
	public JButton TwoButton;
	public JButton ThreeButton;
	public JButton TranslateButton;
	
	public ButtonTranslator(){
		
		Container contentPane = getContentPane();
		GridLayout gridlayout = new GridLayout(4,4);
		contentPane.setLayout(gridlayout);
		
		Locale locale = new Locale("fr", "FR");
		res = ResourceBundle.getBundle("ListResourceBundle",locale);
		
		JButton OneButton = new JButton("One");
		JButton TwoButton = new JButton("Two");
		JButton ThreeButton = new JButton("Three");
		JButton TranslateButton = new JButton("Translate to French");
		TranslateButton.addActionListener(this);
		
		contentPane.add(OneButton);
		contentPane.add(TwoButton);
		contentPane.add(ThreeButton);
		contentPane.add(TranslateButton);
		
		setTitle("Lab4Part3");
		setSize(250,200);
		setVisible(true);
		
	}//end ButtonTranslator

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ButtonTranslator();
	}//end main

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==TranslateButton){
			OneButton.setText(res.getString("One"));
			TwoButton.setText(res.getString("Two"));
			ThreeButton.setText(res.getString("Three"));
		}//end if
	}//end actionPerformed

}//end class