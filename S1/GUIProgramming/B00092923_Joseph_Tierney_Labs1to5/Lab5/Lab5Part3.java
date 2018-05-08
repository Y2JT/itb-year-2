import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab5Part3 extends JFrame implements ActionListener {

	JPanel panel = new JPanel();

	//create labels
	JLabel lblNews = new JLabel();
	JLabel headline = new JLabel();

	//set text area
	JTextArea ta = new JTextArea(10,22);
	JScrollPane myPane = new JScrollPane(ta);

	//create icons
	Icon sportsIcon = new ImageIcon("images/muller.png");
	Icon localIcon = new ImageIcon("images/car.png");
	Icon weatherIcon = new ImageIcon("images/snow.png");

	public Lab5Part3(){
		JMenuBar menu = new JMenuBar();
		Container contentPane = getContentPane();
		JMenu news = new JMenu("News");

		//add menu items
		JMenuItem sportsItem = new JMenuItem("Sports News");
		JMenuItem localItem = new JMenuItem("Local News");
		JMenuItem weatherItem = new JMenuItem("Weather");

		//add menu items to menu
		news.add(sportsItem);
		news.add(localItem);
		news.add(weatherItem);

		//add listeners to menu items
		sportsItem.addActionListener(this);
		localItem.addActionListener(this);
		weatherItem.addActionListener(this);

		//add shortcuts
		news.setMnemonic('N');
		sportsItem.setMnemonic('S');
		localItem.setMnemonic('L');
		weatherItem.setMnemonic('W');

		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);

		//add menu contents
		menu.add(news);
		panel.add(lblNews);
		panel.add(headline);
		contentPane.add(panel);

		//set menu display
		setJMenuBar(menu);
    	setTitle("Sports News");
    	setSize(500,600);
    	setVisible(true);

	}//end Lab5Part3

	public void actionPerformed(ActionEvent e){
		//if the user selects Sports news
		if(e.getActionCommand().equals("Sports News")){
			//create sports news icon
			sportsIcon = new ImageIcon("images/muller.png");
			//set the icon to the label for display
			lblNews.setIcon(sportsIcon);
			headline.setText("Thomas Muller scores winner as Bayern become Bundesliga Champions!");
			panel.add(ta);
			ta.setText("Philipp Lahm and Julian Green gave the hosts a comfortable half-time lead at the Allianz Arena.\n\nManuel Neuer saved a Ja-Cheol Koo penalty shortly before Thomas Muller sent a penalty over at the other end. \n\nJi Dong-Won brought Augsburg back into the game midway through the second half, making for an interesting final 25 minutes, but Muller settled any nerves in stoppage time with Bayern's third.");
			JScrollPane myPane = new JScrollPane(ta);
			panel.add(myPane);
		}//end if

		//if the user selects Local News
		if(e.getActionCommand().equals("Local News")){
			//create local news icon
			localIcon = new ImageIcon("images/car.png");
			//set the icon to the label for display
			lblNews.setIcon(localIcon);
			headline.setText("Local Man caught in the act of breaking into a car! Residences are told to be on the look out.");
			panel.add(ta);
			ta.setText("Garda have warned residences of Santry to be extra careful when parking and locking their cars, due to the holiday season, as this is the fifth time in just two days that a car has been broken into, or nearly broken into.");
		}//end if

		//if the user selects Weather
		if(e.getActionCommand().equals("Weather")){
			//create weatherIcon
			weatherIcon = new ImageIcon("images/snow.png");
			//set the icon to the label for display
			lblNews.setIcon(weatherIcon);
			headline.setText("Heavy Snow showers are expected for the next 6 weeks!");
			panel.add(ta);
			ta.setText("Some heavy snow showers are expected to fall over Ireland for the next six weeks, giving people hope of a white Christmas this year. A reminder to people who use transport; be careful out there and drive slow.");
		}
	}//end action

	public static void main(String args[]){
		Lab5Part3 newsMenu = new Lab5Part3();
	}//end main method

}//end class