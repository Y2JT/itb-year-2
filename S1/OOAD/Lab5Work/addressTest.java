public class addressTest{

	public static void main(String args[]){

		//default values
		address a1 = new address();

		//created values
		address a2 = new address("Joey","Dublin","01777642");
		address a3 = new address("Tom","Meath","6544491");
		address a4 = new address("Evie","Dublin","09871123");

		//print default values
		System.out.print("Default Values: " + a1.toString());

		//print created values
		System.out.print(a2.toString());
		System.out.print(a3.toString());
		System.out.print(a4.toString());

	}//end main

}//end class