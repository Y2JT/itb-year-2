public class dvdTest{

	public static void main(String args[]){

		dvd d1 = new dvd();
		dvd d2 = new dvd();
		dvd d3 = new dvd();

		d1.setTitle("Batman Begins");
		d1.setDirector("Christopher Nolan");
		d1.setDuration("2 hours and 5 minutes");

		d2.setTitle("The Dark Knight");
		d2.setDirector("Christopher Nolan");
		d2.setDuration("2 hours and 30 minutes");

		d3.setTitle("The Dark Knight Rises");
		d3.setDirector("Christopher Nolan");
		d3.setDuration("2 hours and 45 minutes");

		System.out.print(d1.toString());
		System.out.print(d2.toString());
		System.out.print(d3.toString());
	}//end class

}//end class