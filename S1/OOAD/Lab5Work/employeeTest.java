public class employeeTest{

	public static void main(String args[]){

		employee e1 = new employee();
		employee e2 = new employee();
		employee e3 = new employee();

		e1.setName("Joey Tierney");
		e1.setID(4910);
		e1.setAddress("Dublin");
		e1.setPhone(123456);

		e2.setName("Dean Ambrose");
		e2.setID(225);
		e2.setAddress("Ohio");
		e2.setPhone(555234);

		e3.setName("Tommy McTom");
		e3.setID(16320);
		e3.setAddress("Russia");
		e3.setPhone(17772);

		System.out.print(e1.toString());
		System.out.print(e2.toString());
		System.out.print(e3.toString());
	}//end main method

}//end class